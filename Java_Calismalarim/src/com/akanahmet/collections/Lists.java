package com.akanahmet.collections;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Random;
import java.util.Vector;

//LinkedList stores the memory address (or link) of the element that follows it.
// It's called a LinkedList because each element contains a link to the neighboring element.

//Summary:
//        - Use an ARRAYLIST when you need RAPID access to your data.
//        - Use a LINKEDLIST when you need to make a LARGE number of inserts and/or deletes.
//          (ArrayList makes shifting all values while add and delete operations. )

//  add(object o) , !! Doesn't delete  the value on existing index, just shifting right and keeps old value.
//  remove(pbject o),
//  get(int index),
//  size(),
//  contains(object o) ,
//  clear()(makes list empty)

// Collections methods =>
//sort() , max() , min() , reverse() , shuffle()(mix values randomly);

public class Lists {
    public static void main(String[] args){

        Random random= new Random();

        ArrayList alcolors = new ArrayList(); alcolors.add(5); // Non generic assignment exapmle.
        LinkedList llcolors = new LinkedList();  llcolors.add(5);  // Non generic assignment example.

//--------------------------------ARRAY LIST-------------------------------------------------------------------

        ArrayList<Integer> a = new ArrayList<>();
        ArrayList<Integer> b = new ArrayList<>();
        
        for(int i=1;i<10;i++) {
            a.add(i);  }
        for(int i=10;i<15;i++) {
            b.add(i); }

        a=b; //  every change in b, now changes a !  All a values are lost so you have to backup before assignment.

        b.set(0,5555);
        for (Integer x:a ) {
            System.out.println(x);
        }
        System.out.println("");
        for (Integer x:b ) {
            System.out.println(x);
        }

//------------------------------------------------------------------------------------------------------

        ArrayList<String> stringArrayList = new ArrayList<>();
        stringArrayList.add("gamze");
        stringArrayList.add("burak");
        stringArrayList.add("ahmet");

        Collections.sort(stringArrayList);  // Sorting

        if(stringArrayList.contains("gamze")) {
            System.out.println("\nThe list contains the value \'Gamze\' ");
        }
        for(String aa:stringArrayList) {
            System.out.println("Value:\t"+aa);

        }
        System.out.println(stringArrayList.get(0));
        System.out.println(stringArrayList.get(1));
        System.out.println(stringArrayList.get(2));
        System.out.println("Length:\t"+stringArrayList.size());
        stringArrayList.remove("ahmet");
        stringArrayList.remove(0);
        System.out.println(stringArrayList.toString());

//-----------------------------------------------------------------------------------------------------------------

        ArrayList<Integer> ar2= new ArrayList<Integer>();
        for(int i=0;i<15;i++) {
            ar2.add(random.nextInt(100));
        }

        System.out.println(ar2.toString());

        System.out.println("\nSorted ArrayList :");
        Collections.sort(ar2);

        for(int j=0;j<ar2.size();j++) {
            System.out.println(ar2.get(j));
        }
 //----------------------------------------------------------------------------------------------------------------------------------
        Iterator<Integer> it = ar2.iterator();
        int iterate = it.next();
        System.out.println(iterate);
        iterate=it.next();
        System.out.println(iterate);

        System.out.println("\nPrinting ArrayList with using Iterator");

        while(it.hasNext()) { 
            int value = it.next();
            System.out.println(value);
        }

//--------------------------------LINKED LISTS-------------------------------------------------------------------
        LinkedList<String> linkedList = new LinkedList<String>();
        int x = 0;
        while(x < 20) {
            linkedList.add(x,(random.nextInt(100)+""));
            x++;
        }
        for(String string: linkedList) {
            System.out.println("\t"+string);
        }
        linkedList.forEach(action -> System.out.println("\t\t"+action));
        linkedList.clear();
//------------------------------------VECTOR-------------------------------------------------------------------

        Vector vector = new Vector<>();
        Vector<Integer> vector2 = new Vector<Integer>();

        for(int i = 0 ; i< 9; i++) {
            vector2.add(i); }

        System.out.println("\nVector2 size:\t" + vector2.size() );

        System.out.println("Vector2 default Capacity:\t"+vector2.capacity());
            vector2.add(10);
            vector2.add(11);
        System.out.println("Vector2 size after additions :\t" + vector2.size() );    
        System.out.println("Vector2  Capacity after additions:\t"+vector2.capacity() + "\tThe default Capacity, Increases by 10 by 10");

        Vector vector3 = new Vector(5,3); // (Capacity,Increase rate) can be set with Constructor.




    }




}