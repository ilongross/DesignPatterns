package com.ilongross.patterns.behavioral.commands.base;

import java.util.Stack;

public class CommandExecutor {

    private Stack<Command> commandHistory = new Stack<>();
    private String state = "";
    private int commandCount = 0;


    public void executeCommand(Command command) {
        if(command.execute()) {
            commandHistory.push(command);
            this.commandCount++;
        }
    }

    public void undoLastCommand() {
        if(!commandHistory.empty()) {
            commandHistory.pop().undo();
        }
    }

    public int getCommandCount() {
        return commandCount;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }
}
