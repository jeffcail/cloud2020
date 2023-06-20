package com.jeffcail.springcloud.service;

import com.jeffcail.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @ClassName PaymentService
 * @Description TODO
 * @Author cc
 * @Date 2023/6/20 11:45 上午
 * @Version 1.0
 */
public interface PaymentService {

    int create(Payment payment);

    Payment getPaymentById(@Param("id") Long id);

}
