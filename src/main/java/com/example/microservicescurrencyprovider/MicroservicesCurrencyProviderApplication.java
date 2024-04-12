package com.example.microservicescurrencyprovider;
import com.example.microservicescurrencyprovider.properties.CurrencyRateSenderProperties;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.cloud.openfeign.EnableFeignClients;


@SpringBootApplication
@EnableFeignClients
@EnableConfigurationProperties(CurrencyRateSenderProperties.class)
public class MicroservicesCurrencyProviderApplication {

    public static void main(String[] args) {
        SpringApplication.run(MicroservicesCurrencyProviderApplication.class, args);
    }

}
