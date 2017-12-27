package com.bosscang.pickmax.common;

import com.bosscang.pickmax.entity.InvalidTokenException;
import com.bosscang.pickmax.entity.Response;
import com.bosscang.pickmax.entity.ResponseUtils;
import com.bosscang.pickmax.game.entity.GameData;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

@ControllerAdvice
public class InvalidTokenExceptionHandle {
    @ResponseBody
    @ExceptionHandler(InvalidTokenException.class)
    public Response InvalidTokenHandle() {
        return ResponseUtils.buildResponse(Response.CODE_NO_ACCESS, "非法用户", null);
    }
}
