package com.akanahmet.object_orianted_programming.association.aggregation;

// car needs engine

public class Car {


    private Engine engine;

    public double getTotalPrice() {

        engine = new Engine();
        double total = engine.getEnginePrice() + 2000;
        return total;
    }
}
