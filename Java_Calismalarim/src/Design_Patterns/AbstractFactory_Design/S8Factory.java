package Design_Patterns.AbstractFactory_Design;



public class S8Factory implements ITelefonFactory {
    @Override
    public ITelefon getTelefon(String model, String batarya, int en, int boy) {
        return new S8(model,batarya,en,boy);


}}
