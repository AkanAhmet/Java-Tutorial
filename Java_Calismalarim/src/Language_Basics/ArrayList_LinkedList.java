package Language_Basics;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.Random;

// ArrayList ' i sil LinkedList, kullanımları birebir aynı !!!
//LinkedList stores the memory address (or link) of the element that follows it.
// It's called a LinkedList because each element contains a link to the neighboring element.

//Summary:
//        - Use an ArrayList when you need RAPID access to your data.
//        - Use a LinkedList when you need to make a LARGE number of inserts and/or deletes.

//  add(object o) ,
//  remove(pbject o),
//  get(int index),
//  size(),
//  contains(object o) ,
//  clear()(Tüm listeyi siler)

// Collections. metodları =>
//sort() , max() , min() , reverse() , shuffle()(Listeyi random karıştırır);

// Listenin içinde kolayca dolanmak için Iterator kullanılır.

public class ArrayList_LinkedList {
    public static void main(String[] args){

        Random rd= new Random();
        ArrayList<String> ar = new ArrayList<>();

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        //---------------------------------------------------------------
        for(int i=1;i<10;i++) {
            a.add(i);  }
        for(int i=10;i<15;i++) {
            b.add(i); }

        a=b; // b deki her değişiklik artık a yıda değiştirir ! A kendi elemanları kayboldu BU İŞELMDEN ONCE A YI YEDEKLEMEK GEREK

        b.set(0,5555);
        for (Integer x:a ) {
            System.out.println(x);
        }
        System.out.println("");
        for (Integer x:b ) {
            System.out.println(x);
        }

//---------------------------------------------------------------

// ArrayList colors= new ArrayList(); colors.add(5);
        //LinkedList<String> lk = new LinkedList<String>();

        ar.add("gamze");
        ar.add("burak");
        ar.add("ahmet");

        Collections.sort(ar);  // Sıralama

        if(ar.contains("gamze")) {
            System.out.println("Listede Gamze var");
        }
        for(String aa:ar) {
            System.out.println("Eleman:\t"+aa);

        }
        System.out.println(ar.get(0));
        System.out.println(ar.get(1));
        System.out.println(ar.get(2));
        System.out.println("Uzunluk:\t"+ar.size());
        ar.remove("ahmet");
        ar.remove(0);
        System.out.println(ar.toString());

        //--------------------------------------------------------------------------

        ArrayList<Integer> ar2= new ArrayList<Integer>();
        for(int i=0;i<15;i++) {
            ar2.add(rd.nextInt(100));
        }

        System.out.println(ar2.toString());

        System.out.println("Sıralanmış Hali :");
        Collections.sort(ar2);

        for(int j=0;j<ar2.size();j++) {
            System.out.println(ar2.get(j));
        }
        //-------------------------------------------------------------------------------------------
        Iterator<Integer> it = ar2.iterator();
        int eleman = it.next();
        System.out.println(eleman);
        eleman=it.next();
        System.out.println(eleman);

        // Iterator kullanarak listeyi yazdırmak;
        System.out.println("Iterator kullanarak listeyi yazdırmak");

        while(it.hasNext()) { // C deki bağlı liste yazdırmaya benziyor.
            int deger = it.next();
            System.out.println(deger);
        }

    }




}