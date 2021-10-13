package com.ilongross.patterns.behavioral.state.upgrade;

public class OffState extends PlayerState {
    public OffState(Player player) {
        super(player);
    }

    @Override
    public PlayerState onOff() {
        player.setPlayerState(new PauseState(player));
        return this;
    }

    @Override
    public PlayerState onPlay() {
        System.out.println("We are off now");
        return this;
    }

    @Override
    public PlayerState onPause() {
        System.out.println("We are off now");
        return this;
    }

    @Override
    public PlayerState onLock() {
        System.out.println("We are off now");
        return this;
    }
}
