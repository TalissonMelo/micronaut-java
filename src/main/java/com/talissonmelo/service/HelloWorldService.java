package com.talissonmelo.service;

import javax.inject.Singleton;

@Singleton
public class HelloWorldService {

    public String sayHi(){
        return "Hello World From Service";
    }
}
