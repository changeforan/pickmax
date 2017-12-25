package com.bosscang.pickmax.controller;

import com.bosscang.pickmax.entity.Response;
import com.bosscang.pickmax.game.entity.ResultData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class GotItController {

    @RequestMapping(value = "/pickmax/gotit", method = RequestMethod.POST)
    public Response<ResultData> got(@RequestParam("token") String token) {
        return null;
    }
}
