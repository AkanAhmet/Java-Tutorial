package object_orianted_programming.nested_class;

// Nested Class: 
//      - Inner Class:
//              - Static
//              - Non Static    
//      - Local Class
//      - Anonymous Class

public class Main {
    
    public static void main(String[] args) {

        //---------------------------------------------------------------------------------------------
        System.out.println("\nNonstatic inner class:\n");
        NonStaticInnerClass nonStaticInnerClass = new NonStaticInnerClass();
        NonStaticInnerClass.Inner inner = nonStaticInnerClass.new Inner();
        inner.innerRun();
        nonStaticInnerClass.nonStaticInnerClassRun();
        //---------------------------------------------------------------------------------------------
        System.out.println("\nStatic inner class:\n");
        StaticInnerClass.Inner staticInner= new StaticInnerClass.Inner();
        staticInner.innerRun();
        //---------------------------------------------------------------------------------------------
        System.out.println("\nLocal class :\n");
        LocalClass localClass = new LocalClass();
        localClass.run();
        //---------------------------------------------------------------------------------------------
        System.out.println("\nAnonymous class :\n");
        AnonymousClass anonymousClass = new AnonymousClass();
        anonymousClass.run();
        AnonymousClass anonymousClass2 = new AnonymousClass() {
            @Override
            public void run() {
                System.out.println("This is a method named \'run\' which belongs Anonymous class.");
            }

            public void print() { // Override like interfaces. You cant create new methods here but you can override it.
                System.out.println("Pay attention to this point, Anonymous Class doesn't have class Name.");
            }
        };
        anonymousClass2.run();
        anonymousClass2.print();
        //---------------------------------------------------------------------------------------------
    }
}
