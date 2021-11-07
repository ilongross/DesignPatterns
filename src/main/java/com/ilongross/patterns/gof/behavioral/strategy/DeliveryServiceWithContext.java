package com.ilongross.patterns.gof.behavioral.strategy;

public class DeliveryServiceWithContext {

    private DeliveryStrategy currentStrategy;

    private float clientBalance;
    private float destinationRange;


    private void deliveryUsingContext(String product, String owner) {
        checkStrategy();
        currentStrategy.delivery(product, owner);
    }

    private void checkStrategy() {
        if(clientBalance <= 0) {
            currentStrategy = new DeliverSelf();
        } else if(destinationRange > 10) {
            currentStrategy = new DeliveryByCar();
        } else {
            currentStrategy = new DeliveryByCourier();
        }
    }

    public void setCurrentStrategy(DeliveryStrategy currentStrategy) {
        this.currentStrategy = currentStrategy;
    }

    public void setClientBalance(float clientBalance) {
        this.clientBalance = clientBalance;
    }

    public void setDestinationRange(float destinationRange) {
        this.destinationRange = destinationRange;
    }
}
