package com.example.javacoredemo.generics;

import com.example.javacoredemo.generics.Animal;

public class AnimalPrinter<T extends Animal> {
    private T animal;
    public AnimalPrinter(T animal) {
        this.animal = animal;
    };
    public void print() {
        System.out.println(animal.getAnimalType() + " name is " +  animal.getName() + " it is " + animal.getAge() + " years old.");
    };
}
