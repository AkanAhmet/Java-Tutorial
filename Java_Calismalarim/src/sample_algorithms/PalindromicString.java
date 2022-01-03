package sample_algorithms;

import java.util.Scanner;
public class PalindromicString {
    
    static String findReverseString ( String text) {

        char temp;
        StringBuilder stringBuilder = new StringBuilder();

        for( int i = text.length() -1 ; i >= 0; i--) {
            temp = text.charAt(i);
            stringBuilder.append(temp);
        }

        return stringBuilder.toString();
    }
    
    static void checkPalindromicString(String text) {

        if( text.equals(findReverseString(text))) {
            System.out.println (text + " is a palindromic string.");
        }
        else { System.out.println (text + " not a palindromic string."); }
    }

    public static void main(String[] args) {
        
       String text;
       Scanner scanner = new Scanner(System.in);
       System.out.println("Please enter a text to find reverse.");
       text =  scanner.nextLine();
       scanner.close();
       
       System.out.println("Reversed String :  "+ findReverseString(text));
       checkPalindromicString(text);

    }
}
