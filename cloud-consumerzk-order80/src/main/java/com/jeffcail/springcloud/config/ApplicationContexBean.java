package com.jeffcail.springcloud.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @ClassName ApplicationContexBean
 * @Description TODO
 * @Author cc
 * @Date 2023/6/21 6:42 下午
 * @Version 1.0
 */
@Configuration
public class ApplicationContexBean {

    @Bean
    @LoadBalanced
    public RestTemplate getRestTemplate() {
        return new RestTemplate();
    }


}
