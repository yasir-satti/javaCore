package com.example.javacoredemo.generics;

import com.example.javacoredemo.generics.Animal;

public class Cat extends Animal {
    private String litterPreference;
    public Cat(String name, int age) {
        super("cat", name, age);
    };
    public String getLitterPreference() {
        return litterPreference;
    };
    public void setLitterPreference(String litterPreference) {
        try {
            this.litterPreference = litterPreference;
        } catch (Exception e) {
            e.printStackTrace();
        }
    };
}
