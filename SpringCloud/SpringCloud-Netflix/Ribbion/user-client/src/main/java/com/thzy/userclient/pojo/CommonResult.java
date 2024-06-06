package com.thzy.userclient.pojo;

import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @program: MicroServiceStudy
 * @description:
 * @author: Mr.Wang
 * @create: 2024-06-06 23:25
 **/
@Data
@NoArgsConstructor
public class CommonResult<T> {

    private int code;

    private String message;

    private boolean success;

    private T data;

    public CommonResult(String message, int code) {
        this.code = code;
        this.message = message;
    }

    public CommonResult(T data) {
        this.data = data;
    }
}
