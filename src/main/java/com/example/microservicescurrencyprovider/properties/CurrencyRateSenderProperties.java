package com.example.microservicescurrencyprovider.properties;

import lombok.Getter;
import lombok.Setter;
import org.springframework.boot.context.properties.ConfigurationProperties;

@ConfigurationProperties(prefix = "rabbit")
@Getter
@Setter
public class CurrencyRateSenderProperties {
    private String rateQueue;
}
