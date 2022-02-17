package com.akanahmet.sample_algorithms;

import static java.lang.Math.*;

public class ArmstrongNumber {

    static void isArmstrong(int x) 

    {

        if(x>=100 && x <=999) {
            int temp=x;
            int ones= temp %10;
            temp/=10;
            int tens = temp%10;
            temp/=10;
            int hundreds = temp;

                if((pow(ones,3)+ pow(tens,3) +pow(hundreds,3) == x)) {
                    System.out.println(x + "  is a Armstrong Number.");

                }
        }
        
     }

    public static void main(String[] args) {
           
            for(int i=0;i<1000;i++)
                ArmstrongNumber.isArmstrong(i);

    }
}
