package com.bosscang.pickmax.controller;

import com.bosscang.pickmax.entity.Response;
import com.bosscang.pickmax.entity.ResponseUtils;
import com.bosscang.pickmax.game.entity.GameData;
import com.bosscang.pickmax.game.GameService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * 开始一个新游戏
 */
@Controller
public class NewGameController {

    @Autowired
    private GameService gameService;

    @ResponseBody
    @RequestMapping(value = "/pickmax/newgame", method = RequestMethod.GET)
    public Response<GameData> newGame(@RequestParam("token") String token) {
        return ResponseUtils.buildResponse(200, "OK", gameService.getGameDataForToken(token));
    }

}
