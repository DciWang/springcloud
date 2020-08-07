package com.dciwang.springcloud.entities;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import org.apache.catalina.User;

import java.util.Optional;

/**
 * @Author DciWang
 * @Description TODO
 * @Date 2020/7/27 下午4:48
 * @Version 1.0
 */
@Data
//空参构造方法
@NoArgsConstructor
//全参构造方法
@AllArgsConstructor
public class CommonResult<T> {
    private int code;
    private String message;
    private T data;
//两个参数得构造方法
    public CommonResult(int code, String message) {
        this.code = code;
        this.message = message;
        this.data = null;
    }
}
