package com.example.basic.payment;

import java.math.BigDecimal;
import java.time.LocalDateTime;

public class PaymentService {
    public Payment prepare(Long orderId, String currency, BigDecimal foreignCurrencyAmount) {
        // 환율 가져오기
        // https://open.er-api.com/v6/latest/USD
        // 금액 계산
        // 유효시간 계산
        return new Payment(orderId, currency, foreignCurrencyAmount, BigDecimal.ZERO, BigDecimal.ZERO, LocalDateTime.now());
    }
}
