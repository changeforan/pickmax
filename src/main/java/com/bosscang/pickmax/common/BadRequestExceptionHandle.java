package com.bosscang.pickmax.common;

import com.bosscang.pickmax.entity.Response;
import com.bosscang.pickmax.entity.ResponseUtils;
import org.springframework.web.bind.MissingServletRequestParameterException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class BadRequestExceptionHandle {
    @ResponseBody
    @ExceptionHandler(MissingServletRequestParameterException.class)
    public Response badRequestHandle() {
        return ResponseUtils.buildResponse(400, "参数异常",null);
    }
}
