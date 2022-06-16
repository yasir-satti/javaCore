package com.example.javacoredemo.MokitoDemoTest;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.*;

public class MockitSpyAnnotationNotUsedTest {

    @Test
    public void whenNotUseSpyAnnotation(){
        List<String> spyList = spy(new ArrayList<String>());

        spyList.add("one");
        spyList.add("two");

        verify(spyList).add("one");
        verify(spyList).add("two");

        assertEquals(2, spyList.size());

        doReturn(100).when(spyList).size();
        assertEquals(100, spyList.size());
    }
}
