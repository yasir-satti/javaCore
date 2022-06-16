package com.example.javacoredemo.MokitoDemoTest;

import com.example.javacoredemo.testingMockito.ArgumentCaptorEmailService;
import com.example.javacoredemo.testingMockito.DeliveryPlatform;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.*;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;


@RunWith(MockitoJUnitRunner.class)
public class ArgumentCaptorTest {

    @Mock
    DeliveryPlatform platform;

    @InjectMocks
    ArgumentCaptorEmailService argumentCaptorEmailService;

    @Captor
    ArgumentCaptor<String> emailCaptor;

    @Test
    public void emailValueShouldBeString() {

        argumentCaptorEmailService.send();

        verify(platform).deliver(emailCaptor.capture());

        String emailCaptorValue = emailCaptor.getValue();

        assertEquals("ys@gmail.com", emailCaptorValue);
    }
}
