package ExceptionsAndThreads;

// There is 2 ways to use Threads.
class th1 extends Thread{
    @Override
    public void run() {
        System.out.println("İlk Thread");
    }
}
class th2 extends Thread{
    @Override
    public void run() {
        System.out.println("İkinci Thread");
    }
}

class SecondWay implements Runnable {  // The preferred way is this.
    @Override
    public void run() {
        System.out.println("Second way thread one.");
    }


}
public class Threads {

    public static void main(String[] args) {

        th1 tr1 = new th1();
        th2 tr2 = new th2();

        Thread secondway = new Thread(new SecondWay());
        secondway.setPriority(10);


            tr1.start();
            try {
            tr1.sleep(1000); }
            catch(Exception e) {
                System.out.println(e);
            }
            tr2.setPriority(6);  // Priority 0 ile 10 arasındadır, default olarak 5 gelir.
            tr2.start();
            secondway.start();

    }

}
