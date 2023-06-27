package com.jeffcail.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName AlibabaConsumnerMain9002
 * @Description TODO
 * @Author cc
 * @Date 2023/6/27 9:43 下午
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class AlibabaConsumnerMain9002 {

    public static void main(String[] args) {
        SpringApplication.run(AlibabaConsumnerMain9002.class, args);
    }

}
