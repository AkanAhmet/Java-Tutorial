package JavaCores;


import java.util.HashSet;
import java.util.LinkedHashSet;

// HashSet  2 tane Aynı değeri İçeremez.  -> DISTINCT
// HashSet elemanlar arasında Sıra gözetmez. O yüzden get() metodu içermez.
// Fakat LinkedHashSet sıra sıra ekler.
public class SETS_COLLECTION {
    public static void main(String[] args) {

        HashSet<String> hs = new HashSet<String>();
        hs.add("duman");
        hs.add("zıpzıp");
        hs.add("zıpzıp");
        hs.add("zıpzıp");
        hs.add("zıpzıp");
        hs.add("boncuk");  // Sıralı yazdırmadığına bak.

        System.out.println("HashSet'in boyutu\t"+hs.size());
        System.out.println(hs);

        for( String a: hs) {
            System.out.println(a);
        }

        LinkedHashSet<String> lhs = new LinkedHashSet<String>();
        lhs.add("LinkedHashSet"); lhs.add("sıralı"); lhs.add("ekleme"); lhs.add("yapar");
        System.out.println(lhs);
    }
}
