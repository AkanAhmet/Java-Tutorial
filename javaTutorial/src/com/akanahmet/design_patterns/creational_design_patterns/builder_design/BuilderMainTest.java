package com.akanahmet.design_patterns.creational_design_patterns.builder_design;

public class BuilderMainTest {
    public static void main(String[] args) {
        StudentBuilder builder=new StudentBuilder.Builder().name("Ahmet").surname("AKAN").build();
        System.out.println(builder.getName()+" "+builder.getSurname());
    }
}
