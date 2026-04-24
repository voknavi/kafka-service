package com.example.orderservicekafka;

public record Order(
        String orderId,
        String product,
        Integer quantity
) {}