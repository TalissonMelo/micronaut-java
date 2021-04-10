package com.talissonmelo.model;

import lombok.Getter;

import javax.inject.Singleton;

@Getter
@Singleton
public class GreetingConfig {

    private final String port = "PORTUGUES";
    private final String en = "ENGLISH";
}
