package com.bosscang.pickmax.entity;


import org.apache.commons.lang3.builder.ToStringBuilder;
import org.apache.commons.lang3.builder.ToStringStyle;

import java.io.Serializable;

public class Response<T> implements Serializable{
    public static <T> Response<T> SERVER_ERROR(T data) {
        Response<T> response = new Response<T>();
        response.setCode(CODE_SERVER_ERROR);
        response.setMsg("服务异常");
        response.setData(data);
        return response;
    }

    public static <T> Response<T> VALID_ARGUMENTS(T data) {
        Response<T> response = new Response<T>();
        response.setCode(CODE_OUT_OF_SERVICE_RANGE);
        response.setMsg("参数异常,不支持的数据类型");
        response.setData(data);
        return response;
    }

    // 请求成功
    public static final int CODE_SUCCESS = 200;

    // 用户未被认证
    public static final int CODE_USER_UNAUTHORIZED= 401;

    // 用户无权限访问
    public static final int CODE_NO_ACCESS = 403;

    // 访问资源或接口不存在
    public static final int CODE_RESOURCE_NOT_FOUND = 404;

    // 不支持的请求数据类型 如json序列化失败
    public static final int CODE_UNSUPPORT_REQUEST_FORMAT = 415;

    // 请求范围不满足，即参数内容不符合要求
    public static final int CODE_OUT_OF_SERVICE_RANGE = 416;

    // 服务端内部异常
    public static final int CODE_SERVER_ERROR = 500;

    public static final String MSG_INVALID_PARAM = "请求参数异常";
    public static final String MSG_SERVER_ERROR = "系统繁忙，请稍后再试";
    public static final String SUCCESS_MESSAGE = "成功";

    private T data;
    private int code;
    private String msg;

    public int getCode() {
        return code;
    }

    public T getData() {
        return data;
    }

    public String getMsg() {
        return msg;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public void setData(T data) {
        this.data = data;
    }

    @Override
    public String toString() {
        return ToStringBuilder.reflectionToString(this, ToStringStyle.SHORT_PREFIX_STYLE);
    }
}
