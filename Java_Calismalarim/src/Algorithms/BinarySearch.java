package src.Algoritmalar;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;


public class BinarySearch {

    public int binarySearch(int aranan, int l,int r,List liste){
        Collections.sort(liste);
        int m = l + ( r-1) /2;
        if( r>=l ) {
            if( aranan == m) {return m; }
            if((int ) liste.get(m) > aranan) { return binarySearch(aranan,l,m-1,liste); }
                return binarySearch(aranan,m+1,r,liste); }
        return -1;}

    public static void main(String[] args) {

         int aranacak;
         int sonuc;
        Scanner scanner = new Scanner(System.in);
        BinarySearch binarySearch = new BinarySearch();
        ArrayList arraylist = new ArrayList();

            for(int i=50;i>0;i--) {
                arraylist.add(i);
            }

        System.out.println("Aranacak sayıyı giriniz max(50) :");
            aranacak = scanner.nextInt( );

            sonuc = binarySearch.binarySearch(aranacak,0,arraylist.size(),arraylist);
        if(sonuc == -1) {
            System.out.println("Aranan sayı bulunamadı");
        }
        else {
            System.out.println("Aranan sayı  "+sonuc+" . indiste bulundu !");
        }



    }
}
