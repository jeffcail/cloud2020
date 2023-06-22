package com.jeffcail.springcloud.service;

import org.springframework.stereotype.Component;

/**
 * @ClassName PaymentFallbackService
 * @Description TODO
 * @Author cc
 * @Date 2023/6/22 7:10 下午
 * @Version 1.0
 */
@Component
public class PaymentFallbackService implements PaymentHystrixService{
    @Override
    public String paymentInfoOk(Long id) {
        return "------------- PaymentFallbackService fall back paymentInfoOk";
    }

    @Override
    public String paymentInfoTimeout(Long id) {
        return "------------- PaymentFallbackService fall back paymentInfoTimeout";
    }
}
