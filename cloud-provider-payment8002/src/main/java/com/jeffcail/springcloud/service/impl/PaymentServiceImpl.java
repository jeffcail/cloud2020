package com.jeffcail.springcloud.service.impl;

import com.jeffcail.springcloud.dao.PaymentDao;
import com.jeffcail.springcloud.entities.Payment;
import com.jeffcail.springcloud.service.PaymentService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

/**
 * @ClassName PaymentServiceImpl
 * @Description TODO
 * @Author cc
 * @Date 2023/6/20 10:03 下午
 * @Version 1.0
 */
@Service
public class PaymentServiceImpl implements PaymentService {

    @Resource
    private PaymentDao paymentDao;

    public int create(Payment payment) {
        return paymentDao.create(payment);
    }

    public Payment getPaymentById(Long id) {
        return paymentDao.getPaymentById(id);
    }
}
