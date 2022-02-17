package com.akanahmet.java_fundementals;

public class Control_Flow_Statements {
    public static void main(String[] args) {

        // BREAK = İÇİN DE BULUNDUĞU DÖNGÜYÜ SONLANDIRIR. CONTINUE = Döngüde, sonraki adıma atlama yapar.
        //RETURN METODU SONLANDIRIR.

     // TERNARY OPERATOR =>

        int num=5;
        String ternary= (num==5) ?"number is 5"  :"number isn't 5" ;
        System.out.println(ternary);


    // IF - ELSE IF -ELSE =>
        int testscore = 76;
        char grade;
        grade = ( "55".equals("55") ? 'X': 'W');

        if (testscore >= 90) {
            grade = 'A';
        } else if (testscore >= 80) {
            grade = 'B';
        } else if (testscore >= 70) {
            grade = 'C';
        } else if (testscore >= 60) {
            grade = 'D';
        } else {
            grade = 'F';
        }
        System.out.println("Grade = " + grade);
    //----------------------------------------------------------------------------------------------------------------
        // Switch Case => Sadece eşitlik durumlarında çalışır büyüktür küçüktür de çalışmaz!
        int monthNumber = 0;
        String month = "august";

        switch (month.toLowerCase()) {
            case "january":
                monthNumber = 1;
                break;
            case "february":
                monthNumber = 2;
                break;
            case "march":
                monthNumber = 3;
                break;
            case "april":
                monthNumber = 4;
                break;
            case "may":
                monthNumber = 5;
                break;
            case "june":
                monthNumber = 6;
                break;
            case "july":
                monthNumber = 7;
                break;
            case "august":
                monthNumber = 8;
                break;
            case "september":
                monthNumber = 9;
                break;
            case "october":
                monthNumber = 10;
                break;
            case "november":
                monthNumber = 11;
                break;
            case "december":
                monthNumber = 12;
                break;
            default:
                monthNumber = 0;
                break;
        }
        System.out.println(monthNumber);

        //----------------------------------------------------------------------------------------------------------------
        // WHILE =>
        int count = 1;
        while (count < 11) {
            System.out.println("Count is: " + count);
            count++; }
        // DO - WHILE => ilk işi 1 kez yapar sonra kontrollere geçer!
        do {
            System.out.println("Count is: " + count);
            count++;
        } while (count < 11);
        //----------------------------------------------------------------------------------------------------------------
        // FOR  =>
        for(int i=1; i<11; i++){
            System.out.println("I is: " + i);
        }

        // for( ; ; ) {}  => infinite Loop with for

    }
}
