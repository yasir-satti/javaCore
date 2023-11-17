package com.example.javacoredemo.mockitoEx;

import org.junit.Before;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.ArgumentCaptor;
import org.mockito.InOrder;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.anyString;
import static org.mockito.Mockito.*;

public class UserServiceTest {

    private static final String PASSWORD = "password";

    private static final User ENABLED_USER =
            new User("user id", "hash", true);

    private static final User DISABLED_USER =
            new User("disabled user id", "disabled user password hash", false);

    private UserRepository userRepository;
    private PasswordEncoder passwordEncoder;
    private UserService userService;

    @BeforeEach
    public void setup() {
        userRepository = createUserRepository();
        passwordEncoder = createPasswordEncoder();
        userService = new UserService(userRepository, passwordEncoder);
    }

    @Test
    public void shouldBeValidForValidCredentials() {
        boolean userIsValid = userService.isValidUser(ENABLED_USER.getId(), PASSWORD);
        assertTrue(userIsValid);

        // userRepository had to be used to find a user with id="user id"
        verify(userRepository).findById(ENABLED_USER.getId());

        // passwordEncoder had to be used to compute a hash of "password"
        verify(passwordEncoder).encode(PASSWORD);
    }

    @Test
    public void shouldBeInvalidForInvalidId() {
        boolean userIsValid = userService.isValidUser("invalid id", PASSWORD);
        assertFalse(userIsValid);

        InOrder inOrder = inOrder(userRepository, passwordEncoder);
        inOrder.verify(userRepository).findById("invalid id");
        inOrder.verify(passwordEncoder, never()).encode(anyString());
    }

    @Test
    public void shouldBeInvalidForInvalidPassword() {
        boolean userIsValid = userService.isValidUser(ENABLED_USER.getId(), "invalid");
        assertFalse(userIsValid);

        ArgumentCaptor<String> passwordCaptor = ArgumentCaptor.forClass(String.class);
        verify(passwordEncoder).encode(passwordCaptor.capture());
        assertEquals("invalid", passwordCaptor.getValue());
    }

    @Test
    public void shouldBeInvalidForDisabledUser() {
        boolean userIsValid = userService.isValidUser(DISABLED_USER.getId(), PASSWORD);
        assertFalse(userIsValid);

        verify(userRepository).findById(DISABLED_USER.getId());
        verifyNoMoreInteractions(passwordEncoder);
    }

    private PasswordEncoder createPasswordEncoder() {
        PasswordEncoder mock = mock(PasswordEncoder.class);
        when(mock.encode(anyString())).thenReturn("any password hash");
        when(mock.encode(PASSWORD)).thenReturn(ENABLED_USER.getPasswordHash());
        return mock;
    }

    private UserRepository createUserRepository() {
        UserRepository mock = mock(UserRepository.class);
        when(mock.findById(ENABLED_USER.getId())).thenReturn(ENABLED_USER);
        when(mock.findById(DISABLED_USER.getId())).thenReturn(DISABLED_USER);
        return mock;
    }
}
