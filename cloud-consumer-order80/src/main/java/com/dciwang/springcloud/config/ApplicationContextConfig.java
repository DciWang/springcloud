package com.dciwang.springcloud.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @Author DciWang
 * @Description TODO
 * @Date 2020/7/31 下午12:53
 * @Version 1.0
 */
//要获取resttemplate对象，要把它注入到spring的容器里面
    @Configuration
public class ApplicationContextConfig {
    @Bean
    public RestTemplate restTemplate(){
        return new RestTemplate();
    }
}
