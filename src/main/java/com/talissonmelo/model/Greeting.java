package com.talissonmelo.model;

import lombok.Data;

import java.math.BigDecimal;
import java.time.Instant;

@Data
public class Greeting {
    final String myText = "Olá Mundo";
    final BigDecimal id = BigDecimal.ONE;
    final Instant timeUTC = Instant.now();
}
