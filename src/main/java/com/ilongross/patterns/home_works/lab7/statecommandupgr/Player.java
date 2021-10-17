package com.ilongross.patterns.home_works.lab7.statecommandupgr;

public class Player {

    private boolean playing;
    private PlayerState playerState;
    private PlayerState previousState;

    public Player() {
        // TODO
        playerState = new PauseState(this);
        previousState = new PauseState(this);
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

    public PlayerState getPreviousState() {
        return previousState;
    }

    public void setPreviousState(PlayerState previousState) {
        this.previousState = previousState;
    }

    @Override
    public String toString() {
        return "Player{" +
                "playing=" + playing +
                ", playerState=" + playerState.getClass().getSimpleName() +
                ", previousState=" + previousState.getClass().getSimpleName() +
                '}';
    }
}
