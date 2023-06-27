package com.jeffcail.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName ConsumnerController
 * @Description TODO
 * @Author cc
 * @Date 2023/6/27 9:58 下午
 * @Version 1.0
 */
@RestController
public class ConsumnerController {

    public static final String SERVER_URL = "http://nacos-payment-provider";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/{id}")
    public String paymentInfo(@PathVariable("id") Long id) {
        return restTemplate.getForObject(SERVER_URL + "/payment/nacos/" + id, String.class);
    }

}
