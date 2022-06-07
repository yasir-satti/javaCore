package com.example.javacoredemo.oop.intrfc;

public interface Polygon {
    void getArea();

    // default method
    default void getSides() {
        System.out.println("I can get sides of a polygon.");
    }
}
