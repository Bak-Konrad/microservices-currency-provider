package com.example.microservicescurrencyprovider.service;

import com.example.microservicescurrencyprovider.model.Rate;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@RequiredArgsConstructor
@Service
@Slf4j
public class CurrencyRateSender {
    private final RabbitTemplate rabbitTemplate;
    @Value("${rabbit.rate-queue}")
    private String rateQueue;

    public void sendRate(Rate rate) {
        rabbitTemplate.convertAndSend(rateQueue, rate);
        log.info("rates sent: {}", rate);
    }
}
