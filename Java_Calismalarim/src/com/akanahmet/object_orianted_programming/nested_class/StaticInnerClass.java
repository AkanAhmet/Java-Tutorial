package com.akanahmet.object_orianted_programming.nested_class;

public class StaticInnerClass {
    
    private int a = 12;
    private static int b = 14;

    public static class Inner {
        
        public int a = 2;

        public void innerRun() {
            System.out.println("a :\t"+a);
            System.out.println("this.a :\t"+this.a);
                // System.out.println(StaticInnerClass.this.a);  //! you CANT ACCESS superclass  from static inner class.
            System.out.println("b:\t"+b);
        }
    }
}
