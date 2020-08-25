package com.dciwang.springcloud.service;

import com.dciwang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Param;

/**
 * @Author DciWang
 * @Description TODO
 * @Date 2020/7/27 下午5:33
 * @Version 1.0
 */

public interface PaymentService {
    int inser(Payment payment);

    Payment getByPaymentId(@Param("id") Long id);
}
