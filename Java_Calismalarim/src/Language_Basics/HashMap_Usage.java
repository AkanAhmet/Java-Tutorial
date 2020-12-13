package Language_Basics;

import java.util.HashMap;

// Python daki dictionary gibi anahtar - değer çifti tutar
// ArrayList ve LinkedList ten farkı, 2 parametre alması ,
// add(object o), yerine put(key, value) kullanılması ve get (key) şeklinde kullanımı.

//  A HashMap cannot contain duplicate keys. Adding a new item with a key that already exists overwrites the old element.
//  The HashMap class provides containsKey and containsValue methods that determine the presence of a specified key or value.
//  If you try to get a value that is not present in your map, it returns the value of null.
//  null is a special type that represents the absence of a value.

public class HashMap_Usage {

    public static void main(String[] args) {

        HashMap<Integer,String> hm = new HashMap<Integer, String>();

        hm.put(1,"Enes");
        hm.put(2,"Kerim");
        hm.put(3,"Mert");
        hm.put(4,"Atakan");
        hm.put(5,"Taha");
        hm.put(6,"Ahmet");

            for(int i=0; i< hm.size();i++) {
                System.out.println("KTC Ailesinin üyeleri : \t"+hm.get(i+1));

            }
    }
}
