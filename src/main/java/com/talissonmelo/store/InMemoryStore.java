package com.talissonmelo.store;

import com.talissonmelo.model.Quote;
import com.talissonmelo.model.Symbol;

import javax.inject.Singleton;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Singleton
public class InMemoryStore {

    private List<Symbol> symbols = new ArrayList<>();
    private final ThreadLocalRandom current = ThreadLocalRandom.current();

    public InMemoryStore() {
        this.symbols = Stream.of("NFLX","AMZN","FB").map(Symbol::new).collect(Collectors.toList());
    }

    public List<Symbol> symbolAll() {
        return symbols;
    }

    public Quote fetchQuotes(String symbol) {
        return new Quote(new Symbol(symbol),randomValue(),randomValue(),randomValue(),randomValue());
    }

    public BigDecimal randomValue(){
        return BigDecimal.valueOf(current.nextDouble(1,100));
    }
}
