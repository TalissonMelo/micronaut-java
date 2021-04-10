package com.talissonmelo.store;

import com.talissonmelo.model.Symbol;

import javax.inject.Singleton;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Singleton
public class InMemoryStore {

    private List<Symbol> symbols = new ArrayList<>();

    public InMemoryStore() {
        this.symbols = Stream.of("NFLX","AMZN","FB").map(Symbol::new).collect(Collectors.toList());
    }

    public List<Symbol> symbolAll() {
        return symbols;
    }

}
