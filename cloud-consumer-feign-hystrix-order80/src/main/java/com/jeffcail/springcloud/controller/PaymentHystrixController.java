package com.jeffcail.springcloud.controller;

import com.jeffcail.springcloud.service.PaymentHystrixService;
import com.netflix.hystrix.contrib.javanica.annotation.DefaultProperties;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
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
@DefaultProperties(defaultFallback = "payment_global_fallbackMethod")
public class PaymentHystrixController {

    @Resource
    private PaymentHystrixService paymentHystrixService;


    @GetMapping("/consumer/payment/hystrix/ok/{id}")
    public String paymentInfoOk(@PathVariable("id") Long id) {
        String res = paymentHystrixService.paymentInfoOk(id);
        return res;
    }

    @GetMapping("/consumer/payment/hystrix/timeout/{id}")
//    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
//            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value = "1500")
//    })
    @HystrixCommand
    public String paymentInfoTimeout(@PathVariable("id") Long id){
        String res = paymentHystrixService.paymentInfoTimeout(id);
        return res;
    }

    public String paymentInfo_TimeoutHandler(@PathVariable("id") Long id) {
        return "~～～啦啦啦 服务提供方的服务开小差儿了: " + "\t" + "当前线程名字: " + Thread.currentThread().getName();
    }

    public String payment_global_fallbackMethod() {
        return "Global异常处理信息，请稍后再试!";
    }

}
