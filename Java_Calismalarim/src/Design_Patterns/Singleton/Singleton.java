package Design_Patterns.Singleton;

public class Singleton {

    private static Singleton sg = null;

    private Singleton(){
        System.out.println("Nesne Oluşturuldu");
    }

    public static Singleton getInstance() {

    if(sg == null) {
       synchronized (Singleton.class){  // synchronized = aynı anda 2 thread bu metodu kullanamaz !
        if(sg==null) {
        sg = new Singleton();} } }
    return sg;
     }
}
