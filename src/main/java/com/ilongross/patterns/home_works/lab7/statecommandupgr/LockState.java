package com.ilongross.patterns.home_works.lab7.statecommandupgr;

public class LockState extends PlayerState {
    public LockState(Player player) {
        super(player);
    }

    @Override
    public PlayerState onOff() {
        player.setPreviousState(player.getPlayerState());
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
        player.setPreviousState(player.getPlayerState());
        player.setPlayerState(new PauseState(player));
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
