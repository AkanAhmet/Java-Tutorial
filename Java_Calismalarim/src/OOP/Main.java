package OOP;
// Javada tüm class lar, Object classından türer.
// Object sınıfında bulunan toString() tarzı metodları da override edebiliriz^^
// Bir sınıf sadece 1 sınıfı extends edebilir,fakat bir çok interface yi implements edebilir.
public class Main {
    public static void main(String[] args) {
        //  referans      //obje
        Car araba   =  new Car();  // new kelimesi kullanılmazsa Hata verir çalışmaz.
        araba.setAge(30);
        araba.setColor("Red");
        araba.setEngine(45.5f);
        araba.setModel("Renault");
        araba.ShowInfos();

        System.out.println("Color is:\t"+araba.getColor());
        araba.run();
        Car araba2=new Car("Renault");
        Car araba3=araba;
        System.out.println(araba3.getColor());
        Car araba4=null; // null referance

        Toy_Car ty = new Toy_Car("Plastik");
        System.out.println(ty.getColor());
        ty.ShowInfos();
        System.out.println(ty);

    }
}