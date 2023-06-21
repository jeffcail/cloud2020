package com.jeffcail.springcloud.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OderZkController
 * @Description TODO
 * @Author cc
 * @Date 2023/6/21 6:44 下午
 * @Version 1.0
 */
@RestController
@Slf4j
public class OderZkController {

    public static final String INVOKE__URL = "http://cloud-payment-service";

    @Resource
    private RestTemplate restTemplate;

    @RequestMapping(value = "/consumer/payment/zk")
    public String paymentInfo() {
        String result = restTemplate.getForObject(INVOKE__URL + "/payment/zk", String.class);

        return result;
    }

}
