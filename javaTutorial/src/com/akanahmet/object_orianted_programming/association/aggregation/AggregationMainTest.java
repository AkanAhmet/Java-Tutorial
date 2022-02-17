package com.akanahmet.object_orianted_programming.association.aggregation;

public class AggregationMainTest {

    public static void main(String[] args) {

        // Engine = 1
        // Car > 1

        Car car=new Car();
        double price=  car.getTotalPrice();
        System.out.println(price);
    }


}
