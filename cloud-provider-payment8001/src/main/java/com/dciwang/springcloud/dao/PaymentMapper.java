package com.dciwang.springcloud.dao;

import com.dciwang.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * @Author DciWang
 * @Description TODO
 * @Date 2020/7/27 下午4:54
 * @Version 1.0
 */
@Mapper
public interface PaymentMapper {
    int inser(Payment payment);

    Payment getByPaymentId(@Param("id") Long id);
}
