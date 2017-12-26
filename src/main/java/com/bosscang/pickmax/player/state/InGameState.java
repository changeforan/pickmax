package com.bosscang.pickmax.player.state;

import com.bosscang.pickmax.player.Context;

/**
 * Created by cs on 2017/12/26.
 */
public class InGameState extends PlayerState {
    @Override
    public void newGame() {
        throw new RuntimeException("当前游戏尚未结束！");
    }

    @Override
    public void next() {
        //todo get next num
    }

    @Override
    public void gotIt() {
        //todo game end
        super.context.setPlayerState(Context.READY_STATE);
    }
}
