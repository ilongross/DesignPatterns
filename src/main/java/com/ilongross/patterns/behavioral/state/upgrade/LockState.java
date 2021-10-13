package com.ilongross.patterns.behavioral.state.upgrade;

public class LockState extends PlayerState {
    public LockState(Player player) {
        super(player);
    }

    @Override
    public PlayerState onOff() {
        player.setPlayerState(new OffState(player));
        return this;
    }

    @Override
    public PlayerState onPlay() {
        System.out.println("We are locked now");
        return this;
    }

    @Override
    public PlayerState onPause() {
        System.out.println("We are locked now");
        return this;
    }

    @Override
    public PlayerState onLock() {
        player.setPlayerState(new PauseState(player));
        return this;
    }
}
