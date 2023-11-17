package com.example.javacoredemo.generics;

public class Animal {
    private String animalType;
    private String name;
    private int age;

    public Animal(String animalType, String name, int age) {
        this.animalType = animalType;
        this.name = name;
        this.age = age;
    };
    public String getName() {
        return name;
    };
    public int getAge() {
        return age;
    };

    public String getAnimalType() {
        return animalType;
    }
}
