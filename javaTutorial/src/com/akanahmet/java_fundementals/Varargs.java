package com.akanahmet.java_fundementals;

public class Varargs {

    public int sum(int... numbers) {
        int result = 0;

        for (int temp : numbers) {
            result += temp;
        }

        return result;
    }

    public static void main(String[] args) {

        Varargs varargs = new Varargs();
        System.out.println(varargs.sum(3,5,7));
        System.out.println(varargs.sum(3,5,7,9,11));

    }
}
