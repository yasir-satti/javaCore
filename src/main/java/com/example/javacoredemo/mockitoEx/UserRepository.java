package com.example.javacoredemo.mockitoEx;

import com.example.javacoredemo.mockitoEx.User;

public interface UserRepository {
    User findById(String id);
};