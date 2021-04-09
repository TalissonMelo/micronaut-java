package com.talissonmelo.service;

import javax.inject.Singleton;

@Singleton
public class HelloWorldService {

    public String hello() {
        return "Olá Mundo.";
    }
}
