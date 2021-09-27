package com.ilongross.patterns.structural.bridge.device;

import com.ilongross.patterns.structural.bridge.Device;

public class Radio implements Device {

    private boolean enabled;
    private int volume;
    private int channel = 1;


    @Override
    public boolean isEnabled() {
        return enabled;
    }

    @Override
    public void disable() {
        this.enabled = false;
    }

    @Override
    public void enable() {
        this.enabled = true;
    }

    @Override
    public int getVolume() {
        return volume;
    }

    @Override
    public void setVolume(int volume) {
        if(volume >= 100) {
            this.volume = 100;
            return;
        }
        else
        if(this.volume < 0){
            this.volume = 0;
            return;
        }
        this.volume = volume;
    }

    @Override
    public int getChannel() {
        return channel;
    }

    @Override
    public void setChannel(int channel) {
        if(channel >= 50) {
            this.channel = 50;
            return;
        }
        else
            if(channel < 1) {
                this.channel = 1;
                return;
            }
        this.channel = channel;
    }
}
