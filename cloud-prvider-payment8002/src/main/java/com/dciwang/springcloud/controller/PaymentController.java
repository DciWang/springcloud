package com.dciwang.springcloud.controller;


import com.dciwang.springcloud.entities.CommonResult;
import com.dciwang.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.*;
import com.dciwang.springcloud.service.PaymentService;

/**
 * @Author DciWang
 * @Description TODO
 * @Date 2020/7/27 下午5:41
 * @Version 1.0
 */
@RestController
@Slf4j
@RequestMapping("/payment")
public class PaymentController {
    @Autowired
    private PaymentService paymentService;

    @Value("${server.port}")
    private String serverPort;

    @PostMapping(value = "/create")
    public CommonResult creat(Payment payment) {
        int result = paymentService.inser(payment);
        log.info("插入的结果是" + result+"🏇哈哈哈哈");
        if (result > 0) {
            return new CommonResult(200, "插入数据库成功，serverPort：" +serverPort+","+ result);
        } else {
            return new CommonResult(500, "插入失败", null);
        }

    }
    @GetMapping(value = "/get/{id}")
    public CommonResult getBYPaymentId(@PathVariable(value = "id") Long id) {
        Payment payment = paymentService.getByPaymentId(id);
        log.info("查询的结果是" + payment);
        if (payment != null) {
            return new CommonResult(200, "插入数据库成功，serverPort：" +serverPort +" ,"+ payment);
        } else {
            return new CommonResult(500, "查询失败", null);
        }

    }

}
