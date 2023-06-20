package com.jeffcail.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * @ClassName EurekaApplication7002
 * @Description TODO
 * @Author cc
 * @Date 2023/6/20 9:13 下午
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaServer
public class EurekaApplication7002 {

    public static void main(String[] args) {
        SpringApplication.run(EurekaApplication7002.class, args);
    }

}
