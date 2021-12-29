package JavaCores;

import java.util.HashSet;
import java.util.LinkedHashSet;

// HashSet  2 tane Aynı değeri İçeremez.  -> DISTINCT
// HashSet elemanlar arasında Sıra gözetmez. O yüzden get() metodu içermez.
// Fakat LinkedHashSet sıra sıra ekler.
public class SETS_COLLECTION {
    public static void main(String[] args) {

        HashSet<String> hashset = new HashSet<String>();
        hashset.add("Duman");
        hashset.add("Boncuk");
        hashset.add("Boncuk");
        hashset.add("Boncuk");
        hashset.add("Boncuk");
        hashset.add("Puf");  // Sıralı yazdırmadığına bak.

        System.out.println("Size of HashSet:\t"+hashset.size());
        System.out.println(hashset);

        for( String a: hashset) {
            System.out.println(a);
        }

        LinkedHashSet<String> linkedHashSet = new LinkedHashSet<String>();
        linkedHashSet.add("LinkedHashSet"); 
        linkedHashSet.add("adds"); 
        linkedHashSet.add("sequentially"); 
        System.out.println(linkedHashSet);
    }
}
