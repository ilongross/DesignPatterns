package com.ilongross.patterns.gof.behavioral.commands.base;

import java.util.Random;

public class DemoBaseCommand {
    public static void main(String[] args) throws InterruptedException {
        var commandExecutor = new CommandExecutor();

        var rand = new Random();
        Command command;
        for (int i = 0; i < 10; i++) {
            Thread.sleep(300);
            switch (rand.nextInt(3)) {
                case 0:
                    command = new SayHelloCommand(commandExecutor);
                    break;
                case 1:
                    command = new HowAreYouCommand(commandExecutor);
                    break;
                default:
                    command = new GoodByeCommand(commandExecutor);
                    break;
            }
            commandExecutor.executeCommand(command);
        }

        System.out.println("----------------------------------");
        for (int i = 0; i < rand.nextInt(10) + 1; i++) {
            commandExecutor.undoLastCommand();
            System.out.println(commandExecutor.getState());
        }

    }
}
