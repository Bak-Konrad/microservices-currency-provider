package com.example.microservicescurrencyprovider.service;

import com.example.microservicescurrencyprovider.client.NbpApiClient;
import com.example.microservicescurrencyprovider.model.CurrencyTableData;
import lombok.RequiredArgsConstructor;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@RequiredArgsConstructor
public class CurrencyRateService {
    private final NbpApiClient apiClient;
    private final CurrencyRateSender currencyRateSender;

    @Scheduled(cron = "0 0/1 * * * * ")//co 1 min
    public void getAllRatesFromNbp() {
        List<CurrencyTableData> currencyTableData = apiClient.getAllRates();
        currencyTableData.stream()
                .flatMap(table -> table.getRates().stream())
                .forEach(currencyRateSender::sendRate);
    }
}