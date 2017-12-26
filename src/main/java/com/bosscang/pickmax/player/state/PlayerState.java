package com.bosscang.pickmax.player.state;

import com.bosscang.pickmax.player.Context;

/**
 * Created by cs on 2017/12/26.
 */
public abstract class PlayerState {
    protected Context context;

    public void setContext(Context context) {
        this.context = context;
    }

    public abstract void newGame();
    public abstract void next();
    public abstract void gotIt();
}
