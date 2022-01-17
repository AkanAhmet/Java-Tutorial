package com.akanahmet.sample_algorithms;

import java.util.Scanner;
public class Factorial {
    
    static int findFactorial(int number) {

        return  (number == 1 || number == 0 ) ? 1 :  number * findFactorial(number - 1);
    }

    public static void main(String[] args) {

        int number;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number for calculate factorial .");
        number = scanner.nextInt();
        scanner.close();
        number  = number < 0 ? number * -1 : number;
        System.out.println(number+"! =  "+Factorial.findFactorial(number));

    }
}
