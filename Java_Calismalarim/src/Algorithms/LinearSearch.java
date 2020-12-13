package src.Algoritmalar;

import java.util.Random;
import java.util.Scanner;
public class LinearSearch {

    public  int linearSearch(int aranan,int[] dizi) {
        for(int i=0;i<dizi.length;i++) {

            if(aranan == dizi[i]) {
                return i; }
        }
            return -1;
    }

    public static void main(String[] args) {

        int eleman_sayisi ;
        int aranacak_sayi;
        int sonuc;
        char devam_istermisin;

        System.out.println("Linear Search' e hoşgeldiniz Big O(Worst Case) karmaşıklığı n dir.");
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        LinearSearch main = new LinearSearch();

        System.out.println("Dizi kaç elemanlı olacak ? ");
        eleman_sayisi = scanner.nextInt();


        int[] dizi = new int[eleman_sayisi];

        for(int i=0;i<50;i++) {
            System.out.print("/");
            try {
            Thread.sleep(10); }
                catch( Exception e) {
                    System.out.println("Thread.sleep metodunda hata alındı");
                }
            System.out.print("\\");

        }

        for(int i=0;i<eleman_sayisi;i++) {
            dizi[i] = random.nextInt(500);

        }

        do {
        System.out.print("\nHangi sayı aranacak ?");
        aranacak_sayi = scanner.nextInt();

        sonuc =  main.linearSearch(aranacak_sayi,dizi);
        if(sonuc == (-1)) {
            System.out.println("Aradığınız sayı bulunamadı !");
        }
        else {
            System.out.println("Aradığınız sayı "+sonuc+". indiste bulundu !");
        }
            System.out.println("Devam etmek istermisiniz ? ( e veya h )");
                devam_istermisin = scanner.next().charAt(0);} while( devam_istermisin == 'e');

        System.out.println("Güle Güle");

    }

}
