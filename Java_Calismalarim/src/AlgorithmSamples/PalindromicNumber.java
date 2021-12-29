package AlgorithmSamples;

import java.util.Scanner;

public class PalindromicNumber {
    
    static void checkPalindromicNumber(int number) {
        int temp;
        int remainder;
        int sum = 0;

        temp = number; // for compare with base number.

        while(number>0){    
            remainder=number%10;   
            sum=(sum*10)+remainder;    
            number /= 10;    
           }    

           if(temp==sum)    
            System.out.println(temp + " is a palindrome number ");    
           else    
            System.out.println(temp + " not a palindrome number");  
    }

    public static void main(String[] args) {
        
        int number;
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Enter number for calculate factorial . Number must be at least 10");
        number = scanner.nextInt();
        scanner.close();
        number  = number < 0 ? number * -1 : number;

        checkPalindromicNumber(number);

    }
}