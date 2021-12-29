package Design_Patterns.Creational_Design_Patterns.Singleton_Design;

class Threads implements Runnable{
    @Override
    public void run() {
        SingletonPattern singleton = SingletonPattern.getInstance();
        
    }
}

public class SingletonWithThreads {

    public static void main(String[] args) {
        Thread thread1 = new Thread(new Threads());
        Thread thread2 = new Thread(new Threads());
        thread1.start();
        thread2.start();
        BruteForce.force();

    }
}

class BruteForce {
    public static void force() {
        SingletonPattern.getInstance();
    }
}
