package com.bosscang.pickmax.player;

import com.bosscang.pickmax.player.state.InGameState;
import com.bosscang.pickmax.player.state.PlayerState;
import com.bosscang.pickmax.player.state.ReadyState;

/**
 * Created by cs on 2017/12/26.
 */
public class Context {
    public final static ReadyState READY_STATE = new ReadyState();
    public final static InGameState IN_GAME_STATE = new InGameState();
    private PlayerState  playerState;

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
    }

    public PlayerState getPlayerState() {
        return playerState;
    }

    public void newGame() {
        playerState.newGame();
    }

    public void next() {
        playerState.next();
    }

    public void gotIt() {
        playerState.gotIt();
    }
}
