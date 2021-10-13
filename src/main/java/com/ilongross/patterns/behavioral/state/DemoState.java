package com.ilongross.patterns.behavioral.state;

import com.ilongross.patterns.behavioral.state.base.Player;
import com.ilongross.patterns.behavioral.state.state_command.statecomm_isValid.Document;
import com.ilongross.patterns.behavioral.state.state_command.statecomm_isValid.ReconsiliationOperation;

import java.util.Random;

public class DemoState {
    public static void main(String[] args) throws InterruptedException {
        var player = new Player();

        var player2 = new com.ilongross.patterns.behavioral.state.upgrade.Player();
        player2.getPlayerState().onLock().onPlay().onOff().onPause();

        System.out.println();
        var rand = new Random();
        for (int i = 0; i < 15; i++) {
            Thread.sleep(1000);
            switch (rand.nextInt(3)) {
                case 0:
                    System.out.println(player.getPlayerState().onLock());
                    break;
                case 1:
                    System.out.println(player.getPlayerState().onOff());
                    break;
                case 2:
                    System.out.println(player.getPlayerState().onPause());
                    break;
                case 3:
                    System.out.println(player.getPlayerState().onPlay());
                    break;
            }
        }

        var doc1 = new Document();
        doc1.executeDocumentOperation(new ReconsiliationOperation());

    }
}
