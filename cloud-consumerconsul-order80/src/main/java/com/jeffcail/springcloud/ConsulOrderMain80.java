package com.jeffcail.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ConsulOrderMain80
 * @Description TODO
 * @Author cc
 * @Date 2023/6/21 9:26 下午
 * @Version 1.0
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ConsulOrderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsulOrderMain80.class, args);
    }

}
