package com.akanahmet.software_principles;

public class Monad {


    //1.method
    public static String getValue(String data) {
        return data;
    }

    //2.method
    public static String getResult(String data) {
        return data.toUpperCase();
    }

    //monad: using method as another method parameter.
    public static void main(String[] args) {
        String monad = getResult(getValue("Ahmet"));
        System.out.println(monad);

    }
}