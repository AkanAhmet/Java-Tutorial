package com.akanahmet.collections;

import java.util.Optional;

public class OptionalClass {

    public static void main(String[] args) {
        String[] str = new String[10];
        str[5] = "JAVA OPTIONAL CLASS EXAMPLE";  // Setting value for 5th index
        Optional<String> checkNull = Optional.ofNullable(str[5]);  //avoids exception
        checkNull.ifPresent(System.out::println);   // printing value by using method reference
        System.out.println("checkNull.isEmpty: "+checkNull.isEmpty());

    }
}
