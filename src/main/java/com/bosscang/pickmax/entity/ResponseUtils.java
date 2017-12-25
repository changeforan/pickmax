package com.bosscang.pickmax.entity;

public class ResponseUtils {
    public static <T> Response<T> buildResponse(int code, String msg ,T data) {
        Response<T> response = new Response<T>();
        response.setCode(code);
        response.setMsg(msg);
        response.setData(data);
        return response;
    }
}
