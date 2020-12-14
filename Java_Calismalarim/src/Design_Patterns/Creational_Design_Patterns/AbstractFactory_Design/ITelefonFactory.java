package Design_Patterns.Creational_Design_Patterns.AbstractFactory_Design;



public interface ITelefonFactory {
    ITelefon getTelefon(String model, String batarya, int en, int boy);
}
