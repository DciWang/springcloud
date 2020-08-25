package com.dciwang.springcloud.controller;

import com.dciwang.springcloud.entities.CommonResult;
import com.dciwang.springcloud.entities.Payment;
import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @Author DciWang
 * @Description 服务之间得调用，使用restTemplate，restTemplate封装了httpClient
 * 使用restTemplate访问restful接口非常简单。
 * （url，requestMap，ResponsBean.class）这三个参数分别代表rest请求地址，请求参数，HTTP响应转换被转换的对象类型。
 * @Date 2020/7/31 下午12:42
 * @Version 1.0
 */
@RestController
@Slf4j
public class OrderController {
    /*单机服务url*/
//    private static final String PAYMENT_URL = "http://localhost:8001";
    /*集群服务url*/
    private static final String PAYMENT_URL = "http://CLOUD-PAYMENT-SERVICE";
    @Resource
    private RestTemplate restTemplate;

    @GetMapping("/consumer/payment/create")
    public CommonResult<Payment> create(Payment payment) {

        return restTemplate.postForObject(PAYMENT_URL + "/payment/create", payment, CommonResult.class);
    }

    @GetMapping("/consumer/payment/get/{id}")
    public CommonResult<Payment> getById(@PathVariable("id") Long id) {
        return restTemplate.getForObject(PAYMENT_URL + "/payment/get/" + id, CommonResult.class);
    }

}
