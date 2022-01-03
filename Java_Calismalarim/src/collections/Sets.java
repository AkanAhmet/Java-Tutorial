package collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.TreeSet;


/*
    HashSet  doesn't contain the same values (DISTINCT) and there are no order between values so you cant use get() method.
 HashSet is not thread-safe. If multiple threads try to modify a HashSet at the same time, 
 then the final outcome is not-deterministic. 
 You must explicitly synchronize concurrent access to a HashSet in a multi-threaded environment.
 LinkedHashSet doesn't contain the same values (DISTINCT) and you can access value in order.
 HashSet ve LinkedHashSet accepts the null value  and places it on the first index.
 TreeSet, doesn't contain the same values (DISTINCT) and sorts the values ascending order, doesnt accept the null value.
 
*/
public class Sets {
    public static void main(String[] args) {

        System.out.println("\n HashSet Example:\n");
        HashSet rawHashSet = new HashSet();

        rawHashSet.add("12");
        rawHashSet.add(12);
        rawHashSet.add(12);
        rawHashSet.add(12);
        rawHashSet.add(12.0);
        rawHashSet.add(true);
        rawHashSet.add(null);

        rawHashSet.remove(12.0);

        System.out.println("rawHashSet.contains(false):\t" + rawHashSet.contains(false));
        System.out.println("rawHashSet Size:\t" + rawHashSet.size());

        Iterator iterator = rawHashSet.iterator();
        while (iterator.hasNext()) {

            System.out.println(iterator.next());
        }

        // rawHashSet.forEach(item -> System.out.println(item));

        // ----------------------------------------------------------------------------------------------

        HashSet<String> genericHashSet = new HashSet<String>();

        genericHashSet.add("Duman");
        genericHashSet.add("Boncuk");
        genericHashSet.add("Boncuk");
        
        genericHashSet.add("Boncuk");
        genericHashSet.add("Boncuk");
        genericHashSet.add(null);
        genericHashSet.add("Puf"); 

        System.out.println("Size of GenericHashSet:\t" + genericHashSet.size());
        System.out.println(genericHashSet);

        for (String a : genericHashSet) {
            System.out.println(a);
        }

    //-----------------------------------------------------------------------------------
        System.out.println("\n LinkedHashSet Example:\n");
        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("LinkedHashSet");
        linkedHashSet.add("adds");
        linkedHashSet.add("sequentially");
        linkedHashSet.add("and");
        linkedHashSet.add("accepts");
        linkedHashSet.add("null");
        System.out.println(linkedHashSet);

        // ----------------------------------------------------------------------------------------------
        System.out.println("\n TreeSet Example:\n");
        TreeSet tree = new TreeSet();
        tree.add(10);
        tree.add(5);
        tree.add(20);
        tree.add(0);
        tree.add(15);

        try {
            tree.add(null);
        }
        catch(Exception e) {
            System.out.println(e.toString()+" so you cant add null value to TreeSet");
        }

        tree.forEach(item -> System.out.println(item));

    }
}
