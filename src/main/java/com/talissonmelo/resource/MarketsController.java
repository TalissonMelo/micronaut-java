package com.talissonmelo.resource;

import com.talissonmelo.entity.store.InMemoryStore;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;

import java.util.List;

@Controller("/markets")
public class MarketsController {

    private final InMemoryStore store;

    public MarketsController(InMemoryStore store) {
        this.store = store;
    }

    @Get
    public List<String> all(){
        return store.getAllSymbols();
    }
}
