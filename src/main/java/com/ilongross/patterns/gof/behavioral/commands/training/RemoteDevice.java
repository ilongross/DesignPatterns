package com.ilongross.patterns.gof.behavioral.commands.training;

import com.ilongross.patterns.gof.behavioral.commands.training.commands.classes.*;
import com.ilongross.patterns.gof.behavioral.commands.training.commands.Control;

public class RemoteDevice implements Device{

    private final Television tv;

    public RemoteDevice(Television tv) {
        this.tv = tv;
    }

    @Override
    public void on(Control command) {
        if(command instanceof OnCommand)
            tv.on();
    }

    @Override
    public void off(Control command) {
        if(command instanceof OffCommand)
            tv.off();
    }

    @Override
    public void channelUp(Control command) {
        if(command instanceof ChannelUpCommand)
            tv.channelUp();
    }

    @Override
    public void channelDown(Control command) {
        if(command instanceof ChannelDownCommand)
            tv.channelDown();
    }

    @Override
    public void volumeUp(Control command) {
        if(command instanceof VolumeUpCommand)
            tv.volumeUp();
    }

    @Override
    public void volumeDown(Control command) {
        if(command instanceof VolumeDownCommand)
            tv.volumeDown();
    }
}
