package Design_Patterns.AbstractFactory_Design;

import Design_Patterns.Factory_Design.TelefonFabrikası;
// Burada factoryninde interfacesi var her model için ayrı factory açılır.

public class TelefonBayi {
    public static void main(String[] args) {

        S8Factory s8Factory = new S8Factory();
        ITelefon s8 = s8Factory.getTelefon("S8","2600MAH",4,7);
        System.out.println(s8Factory);

        Note8Factory note8Factory = new Note8Factory();
        ITelefon note8 = note8Factory.getTelefon("note8","3000MAH",5,8);
        System.out.println(note8Factory);


    }
}
