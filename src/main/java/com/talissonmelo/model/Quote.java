package com.talissonmelo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.math.BigDecimal;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Quote {

    private Symbol symbol;
    private BigDecimal big;
    private BigDecimal ask;
    private BigDecimal lastPrice;
    private BigDecimal volume;
}
