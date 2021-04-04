package com.talissonmelo.web;

import com.talissonmelo.service.HelloWorldService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("${hello.controller.path:/hello}")
public class HelloWorldController {

    private final HelloWorldService service;

    public HelloWorldController(HelloWorldService service) {
        this.service = service;
   }

    @Get("/")
    public String initial(){
        return service.sayHi();
    }
}
