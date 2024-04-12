package com.example.microservicescurrencyprovider.model;

import lombok.Data;

import java.io.Serializable;
import java.math.BigDecimal;
@Data
public class Rate implements Serializable {
    private  String currency;
    private  String code;
    private BigDecimal bid;
    private  BigDecimal ask;
}
