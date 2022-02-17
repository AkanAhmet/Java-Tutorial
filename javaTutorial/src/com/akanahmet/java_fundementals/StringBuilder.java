package com.akanahmet.java_fundementals;

public class StringBuilder {

    public static void main(String[] args) {

        // 1. Way
        String name="Ahmet";
        String surname="AKAN";
        System.out.println(name+" "+surname);

        // 2. Way
        String result="Ahmet".concat(" AKAN");
        System.out.println(result);

        // 3. Way // Servis,Database, if not known the type of received data

        java.lang.StringBuilder stringBuilder=new java.lang.StringBuilder();
        stringBuilder.append("").append("Ahmet").append(" AKAN").append("");
        String result2=stringBuilder.toString();
        System.out.println(result2);


        // 4. Way (Secure):
        StringBuffer stringBuffer=new StringBuffer();
        stringBuffer.append("").append("Ahmet").append(" AKAN").append("");
        String result3=stringBuilder.toString();
        System.out.println(result3);
    }
}
