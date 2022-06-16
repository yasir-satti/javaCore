package com.example.javacoredemo.MokitoDemoTest;

import org.junit.Test;
import org.junit.jupiter.api.extension.ExtendWith;

import org.mockito.junit.jupiter.MockitoExtension;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.when;
import static org.mockito.Mockito.verify;


@ExtendWith(MockitoExtension.class)
public class MockitoMockAnnotationNotUsedTest {

    @Test
    public void whenNotUseToUseMockAnnotationTest(){
        List mockList = mock(ArrayList.class);

        mockList.add("one");
        verify(mockList).add("one");

        assertEquals(0, mockList.size());

        when(mockList.size()).thenReturn(100);
        assertEquals(100, mockList.size());
    }

}
