package AlgorithmSamples;

import java.util.Random;
import java.util.Scanner;

public class LinearSearch {

    static int linearSearch(int number,int[] array) {
        for(int i=0;i<array.length;i++) {

            if(number == array[i]) {
                return i; }
        }
            return -1;
    } 

    public static void main(String[] args) {

        int lengthOfArray ;
        int number;
        int result;
        char wantToContinue;

        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        System.out.println("Welcome Linear Search, the complaxity [Big O (Worst Case)] is n .");
        
       

        System.out.println("Please enter legnth of Array. ");
        lengthOfArray = scanner.nextInt();


        int[] array = new int[lengthOfArray];

        for(int i=0;i<50;i++) {
            System.out.print("/");
            try {
            Thread.sleep(10); }
                catch( Exception e) {
                    System.out.println(e);
                }
            System.out.print("\\");

        }

        for(int i=0;i<lengthOfArray;i++) {
            array[i] = random.nextInt(500);

        }

        do {
        System.out.print("\nEnter a number for search.");
        number = scanner.nextInt();

        result =  LinearSearch.linearSearch(number,array);

        if(result == (-1)) {
            System.out.println("Number not found !");
        }
        else {
            System.out.println("The number found at "+result+". index !");
        }
            System.out.println("Do you want to contrinue ? ( y or n )");
                wantToContinue = scanner.next().charAt(0); } while( wantToContinue == 'y' || wantToContinue == 'Y' );

        System.out.println("Good bye :-)");

        scanner.close();
    }

}
