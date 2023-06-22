package com.jeffcail.springcloud.controller;

import com.jeffcail.springcloud.service.PaymentHystrixService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @ClassName PaymentHstrixControoler
 * @Description TODO
 * @Author cc
 * @Date 2023/6/22 6:05 下午
 * @Version 1.0
 */
@RestController
public class PaymentHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;


    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Long id) {
        String res = paymentHystrixService.paymentInfoOk(id);
        return res;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
    public String paymentInfoTimeout(@PathVariable("id") Long id){
        String res = paymentHystrixService.paymentInfoTimeout(id);
        return res;
    }

}
