package com.bosscang.pickmax.player.state;

import com.bosscang.pickmax.player.Context;

/**
 * Created by cs on 2017/12/26.
 */
public class ReadyState extends PlayerState {
    @Override
    public void newGame() {
        super.context.setPlayerState(Context.IN_GAME_STATE);
        super.context.next();
    }

    @Override
    public void next() {
        throw new RuntimeException("当前没有正在进行的游戏！");
    }

    @Override
    public void gotIt() {
        throw new RuntimeException("当前没有正在进行的游戏！");
    }
}
