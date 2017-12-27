package com.bosscang.pickmax.game;

import com.bosscang.pickmax.entity.InvalidTokenException;
import com.bosscang.pickmax.game.entity.GameData;
import com.bosscang.pickmax.player.PlayerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GameService {

    @Autowired
    PlayerService playerService;

    public GameData getGameDataForToken(String token) {
        if (!playerService.checkToken(token)) {
            throw new InvalidTokenException();
        }
        GameData gameData = new GameData();
        gameData.setN(100);
        gameData.setN(1);
        gameData.setValue(10);
        return gameData;
    }

}
