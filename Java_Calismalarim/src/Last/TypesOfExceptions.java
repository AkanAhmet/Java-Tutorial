package Last;

//There are 2 types of Exceptions :  Checked  and Unchecked (Runtime)

// Chechked => Program derlenmeden önce derleyici otomaitk bulur.
// Thread.sleep() throws an InterruptedException.
// This is an example of a checked exception. Your code will not compile until you've handled the exception

// Unchecked => when attempting to divide by 0.

class tr implements Runnable {
    @Override
    public void run() {
        System.out.println("Hello");
    }
}

public class TypesOfExceptions {
    public static void main(String[] args) {
        Thread trr = new Thread(new tr());
        try {
            trr.sleep(1000);    // Checked - Try,catch kullanmazsan derleyemezsin.
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

    }

    public int div(int a) {  // Unchecked - Runtime error.
        return a/0;
    }



}
