package com.example.javacoredemo.testingMockito;

import java.text.Format;

public class ArgumentCaptorEmailService {

    private DeliveryPlatform platform;

    public ArgumentCaptorEmailService(DeliveryPlatform platform) {
        this.platform = platform;
    }

    public void send() {

        String email = new String("ys@gmail.com");
        platform.deliver(email);
    }
}
