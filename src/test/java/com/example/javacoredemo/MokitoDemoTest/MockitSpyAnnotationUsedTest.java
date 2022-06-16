package com.example.javacoredemo.MokitoDemoTest;

import org.junit.Test;
import org.mockito.Spy;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.doReturn;
import static org.mockito.Mockito.verify;

public class MockitSpyAnnotationUsedTest {

        @Spy
        List<String> spiedList = new ArrayList<String>();

        @Test
        public void whenSpyAnnotationUsed(){

            spiedList.add("one");
            spiedList.add("two");

            verify(spiedList).add("one");
            verify(spiedList).add("two");

            assertEquals(2, spiedList.size());

            doReturn(100).when(spiedList).size();
            assertEquals(100, spiedList.size());
        }

}
