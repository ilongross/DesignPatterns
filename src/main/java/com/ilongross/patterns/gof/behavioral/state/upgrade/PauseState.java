package com.ilongross.patterns.gof.behavioral.state.upgrade;

public class PauseState extends PlayerState {
    public PauseState(Player player) {
        super(player);
    }

    @Override
    public PlayerState onOff() {
        player.setPlayerState(new OffState(player));
        return this;
    }

    @Override
    public PlayerState onPlay() {
        System.out.println(new PlayState(player));
        return this;
    }

    @Override
    public PlayerState onPause() {
        System.out.println("We are already on Pause!");
        return this;
    }

    @Override
    public PlayerState onLock() {
        player.setPlayerState(new LockState(player));
        return this;
    }
}
