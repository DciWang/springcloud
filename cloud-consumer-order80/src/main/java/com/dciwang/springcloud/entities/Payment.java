package com.dciwang.springcloud.entities;

import lombok.*;

import java.io.Serializable;

/**
 * @Author DciWang
 * @Description TODO
 * @Date 2020/7/27 下午3:56
 * @Version 1.0
 */
@Getter
@Setter
@Builder
@ToString
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Payment implements Serializable {
    private long id;
    private String serial;
}
