package com.example.javacoredemo.oop.supr;

public class Dog extends Animall {

        // default constructor
        public Dog() {

            // calling parameterized constructor of the superclass
            super("Animal");
        }

        public void printType() {
            System.out.println("I am a dog");
            System.out.println("I am an " + super.type);
        }

}
