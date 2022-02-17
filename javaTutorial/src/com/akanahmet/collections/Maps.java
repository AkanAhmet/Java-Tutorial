package com.akanahmet.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Set;
import java.util.TreeMap;

/* 
   Instead of add(object o), use put(key, value)  and get (key).

  A HashMap cannot contain duplicate keys. Adding a new item with a key that already exists overwrites the old element.
  The HashMap class provides containsKey and containsValue methods that determine the presence of a specified key or value.
  If you try to get a value that is not present in your map, it returns the value of null.
  null is a special type that represents the absence of a value.
  HashMap is an !UNORDERED! collection. It does not guarantee any specific order of the elements.
  HashMap is not thread-safe. You must explicitly synchronize concurrent modifications to the HashMap.
  LinkedHashMap => Unlike HashMap, the iteration order of the elements in a LinkedHashMap is predictable.
  TreeMap => Sorts the keys ascending order.
*/

public class Maps {

    public static void main(String[] args) {

        HashMap hashMap = new HashMap();
        HashMap<Integer,String> members = new HashMap<Integer, String>();
        LinkedHashMap<Integer,String> linkedHashMap = new LinkedHashMap<Integer,String>();
        TreeMap<String,Double> treeMap = new TreeMap<String,Double>();

        members.put(1,"Enes");
        members.put(2,"Kerim");
        members.put(3,"Mert");
        members.put(4,"Atakan");
        members.put(5,"Taha");
        members.put(6,"Ahmet");
        members.put(6,"Melih"); // Put, overwrites the old value.

            for(int i=0; i< members.size();i++) {
                System.out.println("Members : \t"+members.get(i+1));

            }

            for(Integer key: members.keySet()) {
                System.out.println("Key: "+ key + "   Value: " + members.get(key));
            }
            
            for(String value: members.values()) {
                System.out.println("Values:\t" + value);
            }

        Set set = members.entrySet();  // Map to Set Translation.
        Iterator iterator = set.iterator();
        while(iterator.hasNext()) {
           // System.out.println("\t"+ iterator.next());
           Map.Entry item = (Map.Entry) iterator.next();
           System.out.println(item.getKey() + "=>" + item.getValue());
        }

        
    }
}
