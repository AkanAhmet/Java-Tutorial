package Design_Patterns.Singleton;

class threaddeneme implements Runnable{
    @Override
    public void run() {
        Singleton sg = Singleton.getInstance();
    }
}

public class Singelton_Deneme {

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
