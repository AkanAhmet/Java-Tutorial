package Design_Patterns.AbstractFactory_Design;



public interface ITelefonFactory {
    ITelefon getTelefon(String model, String batarya, int en, int boy);
}
