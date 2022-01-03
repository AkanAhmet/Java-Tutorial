package exceptions_and_threads;

// There is 2 ways to use Threads.
class ThreadOne extends Thread{
    @Override
    public void run() {
        System.out.println("First Thread");
    }
}
class ThreadTwo extends Thread{
    @Override
    public void run() {
        System.out.println("Second Thread");
    }
}

class SecondWay implements Runnable {  // The preferred way is this.
    @Override
    public void run() {
        System.out.println("Second way to implement the thread.");
    }

    /*The Callable interface is similar to Runnable, in that both are designed for classes whose instances are potentially executed by another thread. 
    /A Runnable, however, does not return a result and cannot throw a checked exception. */


}
public class Threads {

    public static void main(String[] args) {

        Thread threadOne = new ThreadOne();
        Thread threadTwo = new ThreadTwo();

        Thread secondway = new Thread(new SecondWay());
        secondway.setPriority(10);


            threadOne.start();
            try {
            Thread.sleep(1000); }
            catch(Exception e) {
                System.out.println(e);
            }
            threadTwo.setPriority(6);  // Priority 0 ile 10 arasındadır, default olarak 5 gelir.
            threadTwo.start();
            secondway.start();

    }

}
