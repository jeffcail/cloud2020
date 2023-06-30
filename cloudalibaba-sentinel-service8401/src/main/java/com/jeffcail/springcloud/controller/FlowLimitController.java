package com.jeffcail.springcloud.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName FlowLimitController
 * @Description TODO
 * @Author cc
 * @Date 2023/6/30 5:48 下午
 * @Version 1.0
 */
@RestController
public class FlowLimitController {

    @GetMapping("/testA")
    public String testA() {
        try {
            TimeUnit.MILLISECONDS.sleep(800);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "----------- testA";
    }

    @GetMapping("/testB")
    public String testB() {
        return "----------- testB";
    }

}
