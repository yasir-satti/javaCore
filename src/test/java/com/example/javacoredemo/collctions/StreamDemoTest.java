package com.example.javacoredemo.collctions;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class StreamDemoTest {

    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    }

    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    }

    @Test
    public void testShowWhenCalledThenPrintsCorrectOutput() {
        StreamDemo.show();

        String expectedOutput = "Stream Demo\n" +
                "4\n" +
                "1\n" +
                "5\n" +
                "12\n" +
                "6\n" +
                "23\n" +
                "7\n" +
                "Sort Stream data\n" +
                "1\n" +
                "4\n" +
                "5\n" +
                "6\n" +
                "7\n" +
                "12\n" +
                "23\n" +
                "Mnipulate the stream data by doubling\n" +
                "2\n" +
                "8\n" +
                "10\n" +
                "12\n" +
                "14\n" +
                "24\n" +
                "46\n" +
                "Mnipulate the stream data with filter only odd number\n" +
                "2\n" +
                "10\n" +
                "14\n" +
                "46\n" +
                "Mnipulate the stream data with filter only odd number\n" +
                "2\n" +
                "10\n" +
                "14\n" +
                "46\n" +
                "Mnipulate the stream data with filter only odd number\n" +
                "Data stream reduce result is 72\n";

        assertEquals(expectedOutput, outContent.toString());
    }
}
