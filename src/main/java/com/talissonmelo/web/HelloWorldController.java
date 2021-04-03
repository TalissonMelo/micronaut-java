package com.talissonmelo.web;

import com.talissonmelo.service.HelloWorldService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import javax.inject.Inject;

@Controller
public class HelloWorldController {

    @Inject
    private HelloWorldService service;

//    public HelloWorldController(HelloWorldService service) {
//        this.service = service;
//    }

    @Get("/hello")
    public String initial(){
        return service.sayHi();
    }
}
