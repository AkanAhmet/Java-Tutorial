package design_patterns.creational_design_patterns.Factory_Design;

// Model sayısı arttıkça ELSE - IF sayısıda artacak, bu sorunu abstractfactory çözer
public class TelefonFabrikası {

    public static ITelefon getTelefon(String model, String batarya, int en, int boy) {

        ITelefon iTelefon = null;

        if("s8".equalsIgnoreCase(model)) {
            iTelefon = new S8(model , batarya , en, boy);
        }else if("note8".equalsIgnoreCase(model)) {
            iTelefon = new Note8(model , batarya , en, boy);
        }else {
            throw new RuntimeException("Geçerli model bulunamadı !");  }

        return iTelefon;
    }
}
