package com.jeffcail.springcloud;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

/**
 * @ClassName ConsumnerZkOderMain80
 * @Description TODO
 * @Author cc
 * @Date 2023/6/21 6:41 下午
 * @Version 1.0
 */
@SpringBootApplication
@Slf4j
@EnableDiscoveryClient
public class ConsumnerZkOderMain80 {

    public static void main(String[] args) {
        SpringApplication.run(ConsumnerZkOderMain80.class, args);
    }

}
