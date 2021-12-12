package Design_Patterns.Creational_Design_Patterns.Singleton_Design;

class threaddeneme implements Runnable{
    @Override
    public void run() {
        Singleton sg = Singleton.getInstance();
    }
}

public class SingeltonDeneme {

    public static void main(String[] args) {
        Thread th1 = new Thread(new threaddeneme());
        Thread th2 = new Thread(new threaddeneme());
        th1.start();
        th2.start();
        deneme.dene();

    }
}

class deneme {
    public static void dene() {
        Singleton.getInstance();
    }
}
