package object_orianted_programming;

class Machine {
    public void start() {
        System.out.println("Original");
    }
}
public class AnonymousClass {
    public static void main(String[] args) {

        Machine m = new Machine() { // Küme parantazi açıp metodu değiştirip parantazi kapatıp ; koyuyoruz.
            @Override
            public void start() {
                System.out.println("Metodu değiştirdik");
            }
        }; // Start metodu sadece m nesnesi için değişti. Yeni oluşturulacak nesnelerde orjinal start() çalışacak;

            m.start();

        Machine o = new Machine();
        o.start();
    }
}