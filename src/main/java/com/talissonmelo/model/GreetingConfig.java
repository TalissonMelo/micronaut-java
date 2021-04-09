package com.talissonmelo.model;

import javax.inject.Singleton;

@Singleton
public class GreetingConfig {

    private final String port = "PORTUGUES";
    private final String en = "ENGLISH";

    public String getPort() {
        return port;
    }

    public String getEn() {
        return en;
    }
}
