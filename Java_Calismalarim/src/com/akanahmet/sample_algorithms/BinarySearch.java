package com.akanahmet.sample_algorithms;

import java.util.*;

public class BinarySearch {

    static int binarySearch(int number, int left, int right, int[] array) {
        Arrays.sort(array);
        if (right >= left) {
            int middle = left + (right - left) / 2;
            if (number == middle) {
                return middle;
            }
            if (array[middle] > number) {
                return binarySearch(number, left, middle - 1, array);
            }
            return binarySearch(number, middle + 1, right, array);
        }
        return -1;
    }

    public static void main(String[] args) {

        int numberForSearch;
        int result;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        int[] array = new int[50];

        for (int i = 49; i >= 0; i--) {
            array[i] = random.nextInt(150);
        }

        System.out.println("Enter a number for search in Array,max 150 :");
        numberForSearch = scanner.nextInt();
        scanner.close();

        result = BinarySearch.binarySearch(numberForSearch, 0, array.length - 1, array);
        if (result == -1) {
            System.out.println("Number not found !");
        } else {
            System.out.println("Number found at " + result + " . index !");
        }

    }
}
