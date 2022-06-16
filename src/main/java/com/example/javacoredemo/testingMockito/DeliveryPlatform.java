package com.example.javacoredemo.testingMockito;

public class DeliveryPlatform {
    private String email;

    public DeliveryPlatform(){
    }

    public void deliver(String email){

        this.email = email;
    }
}
