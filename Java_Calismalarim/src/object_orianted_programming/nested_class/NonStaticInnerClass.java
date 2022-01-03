package object_orianted_programming.nested_class;

public class NonStaticInnerClass {
    private int a = 10;
    private int b = 15;

    public class Inner {  // Inner Class number can be more than 1 if wanted.
        int a = 1;
        
       
        public void innerRun() {
            System.out.println("a :\t"+a);
            System.out.println("this.a :\t"+this.a);
            System.out.println("b :\t"+b);
            System.out.println("NonStaticInnerClass.this.a :"+NonStaticInnerClass.this.a);
        }
    }

    public void nonStaticInnerClassRun() {
        System.out.println("a :\t"+a);
        System.out.println("this.a :\t"+this.a);
         //  System.out.println("Inner.a :\t"+Inner.a);  => Checked Exception . Inner must be Static or must derive object from Inner.
    }
    
}
