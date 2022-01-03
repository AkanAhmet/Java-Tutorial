package java_fundementals;

import java.util.*;
public class ArrayMethods {
    public static void main(String[] args) {

        int[] array;
        array=new int[10];
        array[0] = 100;

        String[] anArrayOfStrings = new String[5];
        anArrayOfStrings[0]="Ahmet";
        anArrayOfStrings[1]="Akan";

        int[] anArray = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };
        
        char[] chars = new char[] {'L','O','V','E'};
        
        // Multidimensional array=>
        String[][] arrays={{"Ahmet","Gamze","Burak"},{"Duman","Boncuk","Puf"}};
        System.out.println(arrays[0][0]+"->"+arrays[1][0]);
        System.out.println(arrays[0][1]+"->"+arrays[1][1]);
        System.out.println(arrays[0][2]+"->"+arrays[1][2]);

        //Copying Arrays =>
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};
        char[] copyTo = Arrays.copyOfRange(copyFrom, 2, 9);

        System.out.println(Arrays.toString(copyTo) + " or "+ new String(copyTo));

        // Array Functions =>
        //Arrays.sort() --- Arrays.binarySearch();(Dizi sıralı olmalı) ---
        //Arrays.equals() --- Arrays.copyOf() --- Arrays.fill() ---Arrays.toString() ---

        }
    }

