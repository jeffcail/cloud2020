package com.jeffcail.springcloud.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author cc
 * @Date 2023/6/21 9:27 下午
 * @Version 1.0
 */
@RestController
public class OrderController {

    private final static String PAYMENT_SERVICE = "http://consul-provier-payment";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping(value = "/comsumer/payment/cs")
    public String paymentInfo() {
        String result = restTemplate.getForObject(PAYMENT_SERVICE + "/payment/cs", String.class);
        return result;
    }

}
