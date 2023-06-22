package com.jeffcail.springcloud.lb;

import org.springframework.cloud.client.ServiceInstance;

import java.util.List;

/**
 * @ClassName LoadBalancer
 * @Description TODO
 * @Author cc
 * @Date 2023/6/22 11:47 上午
 * @Version 1.0
 */
public interface LoadBalancer {

    ServiceInstance instances(List<ServiceInstance> serviceInstanceList);

}
