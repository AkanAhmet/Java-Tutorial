package ExceptionsAndThreads;

//There are 2 types of Exceptions :  Checked  and Unchecked (Runtime)

// Chechked => Program derlenmeden önce derleyici otomatik bulur.
// Thread.sleep() throws an InterruptedException.
// This is an example of a checked exception. Your code will not compile until you've handled the exception

// Unchecked => when attempting to divide by 0.

class ThreadExample implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello");
    }
}

public class TypesOfExceptions {
    public static void main(String[] args) {
        Thread threadOne = new Thread(new ThreadExample());
        try {
            Thread.sleep(1000); 
            threadOne.start();   // Checked - Try,catch kullanmazsan derleyemezsin.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public int div(int a) {  // Unchecked - Runtime error.
        return a/0;
    }

}
