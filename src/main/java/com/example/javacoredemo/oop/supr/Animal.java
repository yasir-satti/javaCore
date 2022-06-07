package com.example.javacoredemo.oop.supr;

public class Animal {
//    class Animal {

        // default or no-arg constructor
        Animal() {
            System.out.println("I am an animal");
        }

        // parameterized constructor
        Animal(String type) {
            System.out.println("Type: "+type);
        }

    protected String type="endangered animal";

//    class Main {
//        public static void main(String[] args) {
//            Dog dog1 = new Dog();
//        }
//    }

}
