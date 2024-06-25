package com.example.basic.payment;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.math.BigDecimal;

import static org.junit.jupiter.api.Assertions.*;

class PaymentServiceTest {
    PaymentService paymentService;

    @BeforeEach
    void setUp() {
        paymentService = new PaymentService();
    }

    @Test
    @DisplayName("payment 가 유효성이 좋은지 확인")
    void prepare() {
        Payment payment = paymentService.prepare(1L, "ENG", BigDecimal.ONE);
        assertEquals(payment.getClass(), Payment.class);
        assertNotNull(payment);
    }
}