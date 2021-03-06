package com.talissonmelo.resource;

import com.talissonmelo.model.Quote;
import com.talissonmelo.store.InMemoryStore;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Get;
import io.micronaut.http.annotation.PathVariable;

@Controller("/quotes")
public class QuotesController {

    private final InMemoryStore store;

    public QuotesController(InMemoryStore store) {
        this.store = store;
    }

    @Get("/{symbol}")
    public HttpResponse getQuotes(@PathVariable  String symbol) {
        Quote quote = store.fetchQuotes(symbol);
        return HttpResponse.ok(quote);
    }
}
