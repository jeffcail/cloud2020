package com.jeffcail.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName HystrixMain8001
 * @Description TODO
 * @Author cc
 * @Date 2023/6/22 3:48 下午
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class HystrixMain8001 {

    public static void main(String[] args) {
        SpringApplication.run(HystrixMain8001.class, args);
    }

}
