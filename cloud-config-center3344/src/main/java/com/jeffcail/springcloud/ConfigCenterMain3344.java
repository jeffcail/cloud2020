package com.jeffcail.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @ClassName defaultZone: http://eureka7001.com:7001/eureka/
 * @Description TODO
 * @Author cc
 * @Date 2023/6/24 4:25 下午
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
@EnableConfigServer
public class ConfigCenterMain3344 {

    public static void main(String[] args) {
        SpringApplication.run(ConfigCenterMain3344.class, args);
    }

}
