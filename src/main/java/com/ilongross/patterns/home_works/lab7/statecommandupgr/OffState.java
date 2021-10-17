package com.ilongross.patterns.home_works.lab7.statecommandupgr;

public class OffState extends PlayerState {
    public OffState(Player player) {
        super(player);
    }

    @Override
    public PlayerState onOff() {
        player.setPreviousState(player.getPlayerState());
        player.setPlayerState(new PauseState(player));
        player.setPlaying(false);
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

    @Override
    public PlayerState undo() {
        PlayerState state = player.getPlayerState();
        player.setPlayerState(player.getPreviousState());
        player.setPreviousState(state);
        player.setPlaying(!player.isPlaying());
        return this;
    }
}
