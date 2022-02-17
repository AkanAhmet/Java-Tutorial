package com.akanahmet.design_patterns.creational_design_patterns.abstractfactory_design;

public class Rectangle implements Shape {
    @Override
    public void draw() {
        System.out.println("Inside Rectangle::draw() method.");
    }
}