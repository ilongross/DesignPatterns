package com.ilongross.patterns.gof.behavioral.commands.training;

import com.ilongross.patterns.gof.behavioral.commands.training.commands.enums.ButtonCommand;
import com.ilongross.patterns.gof.behavioral.commands.training.commands.Control;

public class RemoteDeviceEnum implements Device{

    private final Television tv;

    public RemoteDeviceEnum(Television tv) {
        this.tv = tv;
    }

    @Override
    public void on(Control command) {
        if(command == ButtonCommand.ON)
            tv.on();
    }

    @Override
    public void off(Control command) {
        if(command == ButtonCommand.OFF)
            tv.off();
    }

    @Override
    public void channelUp(Control command) {
        if(command == ButtonCommand.CHANNEL_UP)
            tv.channelUp();
    }

    @Override
    public void channelDown(Control command) {
        if(command == ButtonCommand.CHANNEL_DOWN)
            tv.channelDown();
    }

    @Override
    public void volumeUp(Control command) {
        if(command == ButtonCommand.VOLUME_UP)
            tv.volumeUp();
    }

    @Override
    public void volumeDown(Control command) {
        if(command == ButtonCommand.VOLUME_DOWN)
            tv.volumeDown();
    }

}
