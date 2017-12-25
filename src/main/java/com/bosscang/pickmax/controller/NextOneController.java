package com.bosscang.pickmax.controller;

import com.bosscang.pickmax.entity.Response;
import com.bosscang.pickmax.game.entity.GameData;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * 获取下一个数字
 */
@Controller
public class NextOneController {
    @RequestMapping(value = "/pickmax/next", method = RequestMethod.GET)
    public Response<GameData> next(@RequestParam("token") String token) {
        return null;
    }
}
