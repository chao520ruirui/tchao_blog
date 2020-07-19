package com.itchao.tchao_blog.result;

import lombok.Data;

/**
 * @author wangchao
 * @create 2020-06-14-23:53
 */
@Data
public class Result {

    private int code;

    private String message;

    private Object result;

    public Result(int code, String message, Object result) {
        this.code = code;
        this.message = message;
        this.result = result;
    }
}
