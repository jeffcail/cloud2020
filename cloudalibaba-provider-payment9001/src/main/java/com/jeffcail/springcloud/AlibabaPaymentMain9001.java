package com.jeffcail.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName AlibabaPaymentMain9001
 * @Description TODO
 * @Author cc
 * @Date 2023/6/27 9:25 下午
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaPaymentMain9001 {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaPaymentMain9001.class, args);
    }

}
