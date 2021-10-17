package com.ilongross.patterns.home_works.lab7.statecommandupgr;

public class PauseState extends PlayerState {
    public PauseState(Player player) {
        super(player);
    }

    @Override
    public PlayerState onOff() {
        player.setPreviousState(player.getPlayerState());
        player.setPlayerState(new OffState(player));
        player.setPlaying(false);
        return this;
    }

    @Override
    public PlayerState onPlay() {
        player.setPreviousState(player.getPlayerState());
        player.setPlayerState(new PlayState(player));
        player.setPlaying(true);
        return this;
    }

    @Override
    public PlayerState onPause() {
        System.out.println("We are already on Pause!");
        player.setPlaying(false);
        return this;
    }

    @Override
    public PlayerState onLock() {
        player.setPreviousState(player.getPlayerState());
        player.setPlayerState(new LockState(player));
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
