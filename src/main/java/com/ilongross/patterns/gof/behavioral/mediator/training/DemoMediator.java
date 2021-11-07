package com.ilongross.patterns.gof.behavioral.mediator.training;

public class DemoMediator {
    public static void main(String[] args) throws Exception {
        var player1 = new GamePlayer("Player1", 50000);
        var player2 = new GamePlayer("Player2", 20000);
        var mediator = new GameMediatorImpl(player1, player2);
        mediator.cooperate(1, 2);
        mediator.cooperate(2, 1);
        System.out.println(player1);
        System.out.println(player2);

    }
}
