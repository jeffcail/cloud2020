package com.jeffcail.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

/**
 * @ClassName ConsumerHystrixMain80
 * @Description TODO
 * @Author cc
 * @Date 2023/6/22 6:00 下午
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class ConsumerHystrixMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixMain80.class, args);
    }

}
