package com.ilongross.patterns.behavioral.state.base;

public class PauseState extends PlayerState{
    public PauseState(Player player) {
        super(player);
    }

    @Override
    public String onOff() {
        player.setPlayerState(new OffState(player));
        return "Off";
    }

    @Override
    public String onPlay() {
        System.out.println(new PlayState(player));
        return "Play!";
    }

    @Override
    public String onPause() {
        System.out.println("We are already on Pause!");
        return "Pause";
    }

    @Override
    public String onLock() {
        player.setPlayerState(new LockState(player));
        return "Lock";
    }
}
