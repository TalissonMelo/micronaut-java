package com.talissonmelo.resource;

import io.micronaut.http.client.RxHttpClient;
import io.micronaut.http.client.annotation.Client;
import io.micronaut.runtime.EmbeddedApplication;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import javax.inject.Inject;

@MicronautTest
class HelloWorldControllerTest {

    @Inject
    EmbeddedApplication<?> application;

    @Inject
    @Client("/")
    RxHttpClient client;

    @Test
    void testItWorks() {
        Assertions.assertTrue(application.isRunning());
    }

    @Test
    void testHelloWorldResponse(){
        final String result = client.toBlocking().retrieve("/hello");
        Assertions.assertEquals("Olá Mundo.", result);
    }

    @Test
    void testConfigPort(){
        final String port = client.toBlocking().retrieve("/hello/port");
        Assertions.assertEquals("PORTUGUES", port);
    }

    @Test
    void testConfigEng(){
        final String eng = client.toBlocking().retrieve("/hello/en");
        Assertions.assertEquals("ENGLISH", eng);
    }

}
