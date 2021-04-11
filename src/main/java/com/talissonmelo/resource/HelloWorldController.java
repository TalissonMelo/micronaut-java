package com.talissonmelo.resource;

import com.talissonmelo.model.Greeting;
import com.talissonmelo.model.GreetingConfig;
import com.talissonmelo.service.HelloWorldService;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

@Controller("/hello")
public class HelloWorldController {

    private final HelloWorldService service;
    private final GreetingConfig config;

    public HelloWorldController(HelloWorldService service, GreetingConfig config) {
        this.service = service;
        this.config = config;
    }

    @Get
    public String hello() {
        return service.hello();
    }

    @Get("/port")
    public String port() {
        return config.getPort();
    }

    @Get("/en")
    public String en() {
        return config.getEn();
    }

    @Get("/json")
    public Greeting json(){
        return  new Greeting();
    }
}