package Design_Patterns.AbstractFactory_Design;



public class Note8Factory implements ITelefonFactory {
    @Override
    public ITelefon getTelefon(String model, String batarya, int en, int boy) {
        return new Note8(model,batarya,en,boy);


    }}
