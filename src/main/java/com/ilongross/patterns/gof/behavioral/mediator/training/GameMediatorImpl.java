package com.ilongross.patterns.gof.behavioral.mediator.training;

public class GameMediatorImpl implements GameMediator{

    private final Player player1;
    private final Player player2;

    public GameMediatorImpl(Player player1, Player player2) {
        this.player1 = player1;
        this.player2 = player2;
    }

    @Override
    public void cooperate(int from, int to) throws Exception {
        if(from == 1 && to == 2) {
               player2.receiveData(player1.transferData());
        }
        else
            if(from == 2 && to == 1) {
                player1.receiveData(player2.transferData());
            }
            else {
                throw new Exception("Wrong transfer route");
            }
    }
}
