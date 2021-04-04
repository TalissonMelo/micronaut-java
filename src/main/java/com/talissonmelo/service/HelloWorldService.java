package com.talissonmelo.service;

import com.talissonmelo.Application;
import io.micronaut.context.event.StartupEvent;
import io.micronaut.runtime.event.annotation.EventListener;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import javax.inject.Singleton;

@Singleton
public class HelloWorldService {

    private static final Logger LOG = LoggerFactory.getLogger(HelloWorldService.class);

    @EventListener
    public void onStart(StartupEvent event){
        LOG.debug("Startup: {}", HelloWorldService.class.getSimpleName());
    }

    public String sayHi(){
        return "Hello World From Service";
    }
}
