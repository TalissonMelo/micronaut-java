package com.talissonmelo.resource;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloWorldController {

    @Get
    public String hello() {
        return "Olá Mundo.";
    }
}
