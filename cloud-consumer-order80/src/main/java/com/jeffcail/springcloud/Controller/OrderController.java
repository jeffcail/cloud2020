package com.jeffcail.springcloud.Controller;

import com.jeffcail.springcloud.entities.CommonResult;
import com.jeffcail.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @ClassName OrderController
 * @Description TODO
 * @Author cc
 * @Date 2023/6/20 5:48 下午
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderController {

    private static final String PROVIDER_URL = "http://localhost:8001";

    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/create/payment")
    public CommonResult<Payment> create(Payment payment) {
        return restTemplate.postForObject(PROVIDER_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PROVIDER_URL + "/payment/get/"+id, CommonResult.class);
    }

}
