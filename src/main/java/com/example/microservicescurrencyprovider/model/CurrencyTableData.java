package com.example.microservicescurrencyprovider.model;

import lombok.Data;

import java.util.List;
@Data
public class CurrencyTableData {
    private  String table;
    private  String no;
    private  String tradingDate;
    private  String effectiveDate;
    private List<Rate> rates;
}
