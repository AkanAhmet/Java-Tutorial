package com.akanahmet.collections;

public class GenericClass<T> {
    T obj;

    GenericClass(T obj ) {
        this.obj = obj;
    }
    
    public T getObj() {
        return this.obj;
    }

}

class Generic2 <T,U>{
    T obj1;
    U obj2;

    Generic2(T obj1, U obj2) {
        this.obj1 = obj1;
        this.obj2 = obj2;
    }

    public void print() {
            System.out.println(obj1 + "  -  " + obj2);
    }

}

 class Main {
    public static void main(String[] args) {
        GenericClass<Integer> generic = new GenericClass<Integer>(54);
        System.out.println(generic.getObj());

        GenericClass<String> genericstr = new GenericClass<>("Generic Usage");
        System.out.println(genericstr.getObj());

        Generic2<Integer,String> generic2 = new Generic2<>(1,"Ahmet");
        generic2.print();
    }
}
