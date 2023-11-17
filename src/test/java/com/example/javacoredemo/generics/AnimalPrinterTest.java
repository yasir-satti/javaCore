package com.example.javacoredemo.generics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalPrinterTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    };
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    };

    @Test
    public void printAnimalDetails() {
        Animal animal = new Animal("Dog", "Fido", 2);
        AnimalPrinter<Animal> animalPrinter = new AnimalPrinter<>(animal);
        animalPrinter.print();
        assertEquals("Dog name is Fido it is 2 years old.\n", outContent.toString());
    };
}
