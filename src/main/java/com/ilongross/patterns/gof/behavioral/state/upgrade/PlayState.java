package com.ilongross.patterns.gof.behavioral.state.upgrade;

public class PlayState extends PlayerState {

    public PlayState(Player player) {
        super(player);
    }

    @Override
    public PlayerState onOff() {
        player.setPlayerState(new OffState(player));
        return this;
    }

    @Override
    public PlayerState onPlay() {
        System.out.println("We are already on Play!");
        return this;
    }

    @Override
    public PlayerState onPause() {
        player.setPlayerState(new PauseState(player));
        return this;
    }

    @Override
    public PlayerState onLock() {
        player.setPlayerState(new LockState(player));
        return this;
    }
}
