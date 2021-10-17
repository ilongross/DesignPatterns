package com.ilongross.patterns.home_works.lab7.statecommandupgr;

public class DemoStateCommandUpgrade {
    public static void main(String[] args) {

        var player = new Player();

        var play = new PlayState(player);
        var pause = new PauseState(player);
        var off = new OffState(player);
        var lock = new LockState(player);

        play.onPlay();
        System.out.println(player);

        play.onPause();
        System.out.println(player);

        play.onLock();
        System.out.println(player);

        play.onOff();
        System.out.println(player);

        play.undo();
        System.out.println(player);

        play.onPlay();
        System.out.println(player);


        // Результат:
//        Player{playing=true, playerState=PlayState, previousState=PauseState}
//        Player{playing=false, playerState=PauseState, previousState=PlayState}
//        Player{playing=false, playerState=LockState, previousState=PauseState}
//        Player{playing=false, playerState=OffState, previousState=LockState}
//        Player{playing=true, playerState=LockState, previousState=OffState}
//        Player{playing=true, playerState=PlayState, previousState=LockState}



    }
}
