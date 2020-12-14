package Algorithms;

import java.util.*;


public class BinarySearch {

    public int binarySearch(int aranan, int l,int r,int[] dizi){
        Arrays.sort(dizi);
        if( r>=l ) {
            int m = l + ( r-1) /2;
            if( aranan == m) {return m; }
            if(dizi[m] > aranan) { return binarySearch(aranan,l,m-1,dizi); }
            return binarySearch(aranan,m+1,r,dizi); }
        return -1;}

    public static void main(String[] args) {

         int aranacak;
         int sonuc;
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        BinarySearch binarySearch = new BinarySearch();
       int[] dizi = new int[50];

            for(int i=49;i>=0;i--) {
                dizi[i] = random.nextInt(150);
            }

        System.out.println("50 elamanlı dizide Aranacak sayıyı giriniz max(150) :");
            aranacak = scanner.nextInt( );

            sonuc = binarySearch.binarySearch(aranacak,0,dizi.length-1,dizi);
        if(sonuc == -1) {
            System.out.println("Aranan sayı bulunamadı");
        }
        else {
            System.out.println("Aranan sayı  "+sonuc+" . indiste bulundu !");
        }



    }
}
