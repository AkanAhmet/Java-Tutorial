package com.akanahmet.object_orianted_programming.nested_class;

public class LocalClass {
    
    public void run () {  //! You can access LocalClassExample class only in this Scope.

         class LocalClassExample {

                int a;

                LocalClassExample(int a) {
                    this.a = a;
                }

                public void print() {
                    System.out.println(this.a);
                }
        }

        LocalClassExample localClassExample = new LocalClassExample(88);
        localClassExample.print();
    }
    
}
