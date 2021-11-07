package com.ilongross.patterns.gof.behavioral.commands.training;

import com.ilongross.patterns.gof.behavioral.commands.training.commands.classes.ChannelUpCommand;
import com.ilongross.patterns.gof.behavioral.commands.training.commands.classes.OnCommand;
import com.ilongross.patterns.gof.behavioral.commands.training.commands.classes.VolumeUpCommand;
import com.ilongross.patterns.gof.behavioral.commands.training.commands.enums.ButtonCommand;

public class DemoRemoteCommands {

    public static void main(String[] args) {


        // TODO сделать команды через ENUM!!!



        var tv = new Television();
        var remote = new RemoteDevice(tv);

        remote.on(new OnCommand());
        for (int i = 0; i < 100; i++) {
            remote.channelUp(new ChannelUpCommand());
            remote.volumeUp(new VolumeUpCommand());
        }
        System.out.println(tv);

        var tv2 = new Television();
        var remote2 = new RemoteDeviceEnum(tv2);
        remote2.on(ButtonCommand.ON);
        for (int i = 0; i < 100; i++) {
            remote2.channelUp(ButtonCommand.CHANNEL_UP);
            remote2.volumeUp(ButtonCommand.VOLUME_UP);
        }
        System.out.println(tv2);

    }

}
