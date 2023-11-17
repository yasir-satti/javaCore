package com.example.javacoredemo.generics;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class AnimalTest {
    private final Animal animal = new Animal("Dog", "Fido", 2);

    @Test
    public void getAnimalType(){
        String expectedAnimalType = "Dog";
        String actualAnimalType = animal.getAnimalType();
        assertEquals(expectedAnimalType, actualAnimalType);
    };
    @Test
    public void getAnimalName(){
    String expectedAnimalName = "Fido";
    String actualAnimalName = animal.getName();
    assertEquals(expectedAnimalName, actualAnimalName);
    };
    @Test
    public void getAnimalAge(){
        int expectedAnimalAge = 2;
        int actualAnimalAge = animal.getAge();
        assertEquals(expectedAnimalAge, actualAnimalAge);
    };
}
