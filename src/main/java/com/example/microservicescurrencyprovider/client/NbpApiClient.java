package com.example.microservicescurrencyprovider.client;

import com.example.microservicescurrencyprovider.model.CurrencyTableData;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.List;
@FeignClient(name = "nbp", url = "${nbp.url}")
public interface NbpApiClient {
    @GetMapping(value = "${nbp.endpoint}")
    List<CurrencyTableData> getAllRates();
}
