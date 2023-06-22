package com.jeffcail.springcloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;
import org.springframework.stereotype.Service;

import java.util.concurrent.TimeUnit;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author cc
 * @Date 2023/6/22 3:49 下午
 * @Version 1.0
 */
@Service
public class PaymentService {

    /**
     * 正常访问 ok
     * @param id
     * @return
     */
    public String paymentInfoOk(Integer id) {
        return "线程池: " + Thread.currentThread().getName() + " paymentInfoOk, id: " + id + "\t" + "ok~~~";
    }

    /**
     * 超时时间 3秒 演示降级
     * @param id
     * @return
     */
    @HystrixCommand(fallbackMethod = "paymentInfo_TimeoutHandler", commandProperties = {
            @HystrixProperty(name="execution.isolation.thread.timeoutInMilliseconds", value = "3000")
    })
    public String paymentInfoTimeout(Integer id) {
        int timeNumber = 6;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " + Thread.currentThread().getName() + " paymentInfoTimeout, id: " + id + "\t" + "error~~~" + "耗时： "+ timeNumber;
    }

    public String paymentInfo_TimeoutHandler(Integer id) {
        return "~～～啦啦啦 服务开小差儿了: " + "\t" + "当前线程名字: " + Thread.currentThread().getName();
    }

}
