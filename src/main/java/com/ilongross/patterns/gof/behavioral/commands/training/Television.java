package com.ilongross.patterns.gof.behavioral.commands.training;

public class Television{

    private final int channels = 100;
    private int currentChannel = 1;
    private int maxVolume = 100;
    private int currentVolume = 20;
    private boolean onOFF = false;

    @Override
    public String toString() {
        return "Television{" +
                "channels=" + channels +
                ", currentChannel=" + currentChannel +
                ", maxVolume=" + maxVolume +
                ", currentVolume=" + currentVolume +
                ", onOFF=" + onOFF +
                '}';
    }

    public void on() {
        this.onOFF = true;
    }

    public void off() {
        this.onOFF = false;
    }

    public void channelUp() {
        if(currentChannel == channels) {
            return;
        }else {
            ++currentChannel;
        }
    }

    public void channelDown() {
        if(currentChannel == 1) {
            return;
        }else {
            --currentChannel;
        }
    }

    public void volumeUp() {
        if(currentVolume == maxVolume) {
            return;
        }else {
            ++currentVolume;
        }
    }

    public void volumeDown() {
        if(currentVolume == 0) {
            return;
        }else {
            --currentChannel;
        }
    }
}
