package com.talissonmelo.entity.store;

import javax.inject.Singleton;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Singleton
public class InMemoryStore {
    private List<String> symbols;

    public InMemoryStore() {
        symbols = Stream.of("NFLX", "AMZN", "GOOG").map(String::new).collect(Collectors.toList());
    }

    public List<String> getAllSymbols(){
        return symbols;
    }


}
