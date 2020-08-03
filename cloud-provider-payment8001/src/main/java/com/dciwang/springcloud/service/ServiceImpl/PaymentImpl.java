package com.dciwang.springcloud.service.ServiceImpl;

import com.dciwang.springcloud.dao.PaymentMapper;
import com.dciwang.springcloud.entities.Payment;
import com.dciwang.springcloud.service.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @Author DciWang
 * @Description TODO
 * @Date 2020/7/27 下午5:34
 * @Version 1.0
 */
@Service
public class PaymentImpl implements PaymentService {

    @Autowired
    private PaymentMapper paymentMapper;

    @Override
    public int inser(Payment payment) {
        return paymentMapper.inser(payment);
    }

    @Override
    public Payment getByPaymentId(Long id) {
        return paymentMapper.getByPaymentId(id);
    }
}
