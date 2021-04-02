package com.talissonmelo.web;

import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller
public class HelloWorldController {

    @Get("/hello")
    public String initial(){
        return "Hello World";
    }
}
