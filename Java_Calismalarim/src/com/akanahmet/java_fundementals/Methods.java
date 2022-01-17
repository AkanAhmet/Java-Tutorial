package com.akanahmet.java_fundementals;

public class Methods {

    // OVERLOADİNG => parametre sayısı,tipi ve return tipi değişebilir.
    // Kullanıcının tamsayı yerine ondalıklı sayı girdiği durumlarda hata ile karşılaşılmaması gibi problemler için önlem niteliğindedir.
    public static int add(int num1, int num2) {
        int result = num1 + num2;
        return result;
    }

    public static double add(double num1, double num2) {
        double result = num1 + num2;
        return result;
    }
//-------------------------------------------------------------------------------------------------------------------------
    //RECURSIVE METHOD =>

    public static int factorial (int num) {
        if(num == 1) {
            return 1;
        }
        return num * factorial(num-1);

    }
    public static void main(String[] args) {
        System.out.println(add(5,6));
        System.out.println(add(3.78,6.54));
        System.out.println(factorial(5));

    }
}

//-------------------------------------------------------------------------------------------------------------------------
    //Method OVERRIDING =>

class A{
    public void print() {
        System.out.println("A");
    }
}

class B extends A {
    A a = new A () {
        @Override
        public void print() {   // ANONYMOUS CLASS CAN'T REDUCE VISIBILITY
            System.out.println("b");
        }
    };
}

class C extends A {

    @Override
   public void print() {
        System.out.println("c");
    }
    public static void main(String[] args) {
        A a = new A();
        C c = new C();
        c.print();
    }
}

