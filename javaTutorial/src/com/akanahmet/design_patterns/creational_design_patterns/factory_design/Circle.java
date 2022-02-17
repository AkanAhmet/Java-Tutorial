package com.akanahmet.design_patterns.creational_design_patterns.factory_design;

public class Circle implements Shape{
    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
