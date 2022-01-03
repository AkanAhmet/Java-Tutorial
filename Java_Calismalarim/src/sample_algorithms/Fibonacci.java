package sample_algorithms;

import java.util.Arrays;
import java.util.Scanner;

public class Fibonacci  {
    
    static double[] getFibonacciSerie(int length) {

        double[] fibonacci = new double[length];
        fibonacci[0] = 0;
        if(length > 1) {fibonacci[1] = 1;};

        for(int i = 2 ; i < length; i++) {
            fibonacci[i] = fibonacci[i-2] + fibonacci[i-1];
        }
        return fibonacci ;
    }

    public static void main ( String[] args) throws Exception {

        int length;
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter length for calculate Fibonacci Series. Length must be at least 1.");
        length = scanner.nextInt();
        scanner.close();
        
        length  = length < 0 ? length * -1 : length;
        System.out.println("Fibonacci Serie = "+ Arrays.toString(Fibonacci.getFibonacciSerie(length)) );
    }
}
