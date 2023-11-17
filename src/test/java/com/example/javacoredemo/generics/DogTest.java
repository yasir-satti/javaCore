package com.example.javacoredemo.generics;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DogTest {
    private final ByteArrayOutputStream outContent = new ByteArrayOutputStream();
    private final PrintStream originalOut = System.out;
    Dog dog = new Dog("Fido", 2, 4);

    @BeforeEach
    public void setUpStreams() {
        System.setOut(new PrintStream(outContent));
    };
    @AfterEach
    public void restoreStreams() {
        System.setOut(originalOut);
    };
    @Test
    public void getDogName() {
        String expectedName = "Fido";
        assertEquals(expectedName, dog.getName());
    };
    @Test
    public void getDogAge() {
        int expectedAge = 2;
        assertEquals(expectedAge, dog.getAge());
    };
    @Test
    public void getDogType() {
        String expectedType = "Dog";
        assertEquals(expectedType, dog.getAnimalType());
    };
    @Test
    public void printDogDetails() {
        AnimalPrinter<Dog> dogPrinter = new AnimalPrinter<>(dog);
        dogPrinter.print();
        assertEquals("Dog name is Fido it is 2 years old.\n", outContent.toString());
    };
}
