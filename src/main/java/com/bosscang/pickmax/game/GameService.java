package com.bosscang.pickmax.game;

import com.bosscang.pickmax.game.entity.GameData;
import org.springframework.stereotype.Service;

@Service
public class GameService {
    public GameData getGameDataForToken(String token) {
        GameData gameData = new GameData();
        gameData.setN(100);
        gameData.setN(1);
        gameData.setValue(10);
        return gameData;
    }

}
