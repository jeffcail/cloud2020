package com.jeffcail.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;

/**
 * @ClassName FeignMain80
 * @Description TODO
 * @Author cc
 * @Date 2023/6/22 12:49 下午
 * @Version 1.0
 */
@SpringBootApplication
@EnableFeignClients
public class FeignMain80 {

    public static void main(String[] args) {
        SpringApplication.run(FeignMain80.class, args);
    }

}
