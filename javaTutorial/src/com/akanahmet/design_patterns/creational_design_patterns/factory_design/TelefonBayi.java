package com.akanahmet.design_patterns.creational_design_patterns.factory_design;

public class TelefonBayi {
    public static void main(String[] args) {

        ITelefon s8 = TelefonFabrikası.getTelefon("S8","2600MAH",4,7);
        ITelefon note8 = TelefonFabrikası.getTelefon("note8","3000MAH",5,8);

        System.out.println("S8 için telefon özellikleri :");
        System.out.println(s8.toString());

        System.out.println("Note8 için telefon özellikleri :");
        System.out.println(note8.toString());


    }
}
