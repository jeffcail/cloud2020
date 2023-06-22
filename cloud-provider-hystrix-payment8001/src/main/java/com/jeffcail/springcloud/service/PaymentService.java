package com.jeffcail.springcloud.service;

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
     * 有问题的访问 超时、异常
     * @param id
     * @return
     */
    public String paymentInfoTimeout(Integer id) {
        int timeNumber = 3;
        try {
            TimeUnit.SECONDS.sleep(timeNumber);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return "线程池: " + Thread.currentThread().getName() + " paymentInfoTimeout, id: " + id + "\t" + "error~~~" + "耗时： "+ timeNumber;
    }

}
