package com.atguigu.springcloud.service;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @auther admin
 * @Date 2020/4/4 18:46
 */
public interface PaymentService {
    public int create(Payment payment);

    public Payment getPaymentById(@Param("id") long id);
}


