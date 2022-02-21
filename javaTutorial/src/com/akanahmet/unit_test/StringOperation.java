package com.akanahmet.unit_test;

public class StringOperation {

    public  String findFirstTwoCharacters(String text) {

        if (text.length() <= 2) {
            return text;
        }

        String result = text.substring(0,2);

        return result;

    }

}


