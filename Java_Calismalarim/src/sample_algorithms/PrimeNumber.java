package sample_algorithms;

public class PrimeNumber {
    
     static String isPrimeNumber(int number) {

        String result;
        if (number == 2) 
        result =  "Prime number" ;
        else if (number < 2) 
         result = "Not a prime number";
        else {
            char control = 'y';
        for(int i = 2; i <= number/2 ; i++) {
            if(number % i == 0)
                control = 'n';
        }

        result = (control == 'y' ? "Prime number": "Not a prime number");
        }
        
    return result;

}

    public static void main(String[] args) throws Exception {
        int maxRange = 100;
        for(int i = -5; i < maxRange ; i++) {
            System.out.println(i+" is a " + PrimeNumber.isPrimeNumber(i));
        }
       
    }

}
