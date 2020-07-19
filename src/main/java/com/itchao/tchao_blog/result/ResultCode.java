package com.itchao.tchao_blog.result;

/**
 * @author wangchao
 * @create 2020-06-14-23:56
 */
public enum ResultCode {

    SUCCESS(200),
    FALL(400),
    UNAUTHORIZED(401),
    NOT_FOUND(404),
    INTERNAL_SERVER_ERROR(500);

    public int code;

    ResultCode(int code) {
        this.code = code;
    }
}
