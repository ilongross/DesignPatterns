package com.ilongross.patterns.home_works.lab7.statecommandupgr;

public abstract class PlayerState {
    Player player;

    public PlayerState(Player player) {
        this.player = player;
    }

    public abstract PlayerState onOff();
    public abstract PlayerState onPlay();
    public abstract PlayerState onPause();
    public abstract PlayerState onLock();
    public abstract PlayerState undo();



}
