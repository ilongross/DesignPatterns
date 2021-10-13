package com.ilongross.patterns.behavioral.state.base;

public class Player {

    private boolean playing;
    private PlayerState playerState;

    public Player() {
        // TODO
        playerState = new PauseState(this);
    }

    public boolean isPlaying() {
        return playing;
    }

    public void setPlaying(boolean playing) {
        this.playing = playing;
    }

    public PlayerState getPlayerState() {
        return playerState;
    }

    public void setPlayerState(PlayerState playerState) {
        this.playerState = playerState;
    }
}
