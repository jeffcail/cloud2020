package com.jeffcail.springcloud.controller;

import com.jeffcail.springcloud.entities.CommonResult;
import com.jeffcail.springcloud.entities.Payment;
import com.jeffcail.springcloud.service.PaymentService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;

/**
 * @ClassName PaymentController
 * @Description TODO
 * @Author cc
 * @Date 2023/6/20 10:05 下午
 * @Version 1.0
 */
@RestController
@Slf4j
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/payment/create")
    public CommonResult create(@RequestBody Payment payment) {
        int res = paymentService.create(payment);
        log.info("************************** 插入结果: " + res);
        if (res > 0) {
            return new CommonResult(200, "写入成功, serverPort: " + serverPort, res);
        }
        return new CommonResult(444, "写入失败",null);
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult<Payment> getPaymentById(@PathVariable("id") Long id) {
        Payment res = paymentService.getPaymentById(id);
        log.info("************************** 查询结果: " + res);
        if (res != null) {
            return new CommonResult(200, "查询成功, serverPort: " + serverPort, res);
        }
        return new CommonResult(444, "查询失败",null);
    }

}
