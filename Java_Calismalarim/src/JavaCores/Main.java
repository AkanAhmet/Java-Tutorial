package JavaCores;
//https://docs.oracle.com/javase/tutorial/java/index.html
// Temel kütüphane => java.util.* , list-arraylist-date-hash

/*
// Static(Sınıfa ait, objeye değil) olmayan methoda ulaşmak için önce o sınıftan new kelimesi ile bir obje yaratılır.

Deneme deneme = new Deneme(); // Obje oluşturuldu

deneme.ornekMethod(); //static olmayan methoda ulaşıldı

//Static methoda ulaşmak => Deneme.ornekMethod();
*/

import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("Hello World\t"+"Welcome to my Java Studies");
        System.out.println(Math.pow(2,4)+"\t"+Math.sqrt(81));
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a number please");
        int sayi= scanner.nextInt();
        scanner.close();
        System.out.println("Girilen sayı:\t"+sayi);
        Random random= new Random();
        int random_number= random.nextInt(100)+1;
        System.out.println("This is a random number:\t"+random_number);

    }
}
/*Program koşarken programın öğeleri ana bellekte belirli yerlerde tutulur. Çok ayrıntıya girmeden iki önemli bölgeyi söylemek gerekir: Stack ve Heap .

(Stack) :  LIFO (Last Input First Output – son giren önce çıkar) adıyla bilinen yapıdır. Üst üste yığılmış kutuları andırır.
Yeni gelen kutu en üste yerleşir, alınacak kutu en üstten alınır. RAM'de en hızlı erişim sağlanan bölgedir.
Java dilinde bütün değer tipleri stack 'ta tutulur.
Stack bir sınıftır ve stack ile ilgili bütün işleri yapmaya yetecek öğelere sahiptir.

(Heap): Java  dilinde bütün referans tiplerinin tutulduğu bellek bölgesidir; dolayısıyla nesneler heap'te tutulur.
Bir sınıfa ait bir nesne yaratılınca, Heap içinde nesnenin bütün öğelerini içerecek bir bellek bloku ayrılır.
Burası nesnenin adresidir. Bu adres, bu nesneyi işaret eden referans (işaretçi) tarafından bilinir.
Şekildeki oklar referansları (pointer, işaretçi) göstermektedir.

*/
