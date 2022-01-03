package collections;

public class GenericMethod {
    
    public static <E> void genericMethod(E[] arr) { // think about we dont know what kind of array we want to process.
        
        for(E item: arr) {
            System.out.println(item);
        }
    }

    public static <E,F> void genericMethod2 (E e,F f) {
            System.out.println("Argumants : " + e + " and  " + f );
    }

    public static void main(String[] args) {

        Integer[] integerArray = {1,2,3,4,5};
        String[] stringArray = {"Ahmet","Mehmet","Cevdet"};
        Double[] doubleArray = {45.6,34.8,35.8};

        GenericMethod.genericMethod(integerArray);
        GenericMethod.genericMethod(stringArray);
        GenericMethod.genericMethod(doubleArray);

        GenericMethod.genericMethod2(456.789, "Solo");
    }
}
