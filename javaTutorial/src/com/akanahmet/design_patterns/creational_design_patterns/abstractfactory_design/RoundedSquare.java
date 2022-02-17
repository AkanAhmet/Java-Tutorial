package com.akanahmet.design_patterns.creational_design_patterns.abstractfactory_design;

public class RoundedSquare implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside RoundedSquare::draw() method.");
    }
}