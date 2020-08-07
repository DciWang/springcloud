package com.dciwang.springcloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

/**
 * @Author DciWang
 * @Description 微服务提供者8001
 * @Date 2020/7/27 下午3:16
 * @Version 1.0
 */
@SpringBootApplication
@EnableEurekaClient
public class Payment8001 {
    public static void main(String[] args) {
        SpringApplication.run(Payment8001.class,args);
    }
}
