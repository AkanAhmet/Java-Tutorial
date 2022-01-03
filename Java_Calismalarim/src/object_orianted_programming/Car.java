package object_orianted_programming;

//Access Modifiers=>
// public = Her yerden erişim.
// private = Sadece aynı sınıf içerisinden erişim.
// protected = Paket içerisinden erişim ve paket dışından Kalıtımla (Inheritance) erişim.
// no modifier(default) = Sadece aynı Paket içerisinden erişim.
// ENCAPSULATION => fields için private kullanılır(Değişkenler) ve getter-setter metodları kullanılır.
// Değerlere dolaylı yoldan erişilir.Daha güvenli mesela araba kapı sayısı 1 ve 3 olamaz bunu set metodunda kontrol ettirebilirsin.
public class Car{

        private String color;  // Bunlara Fields denir
        private String model;
        private float engine;
        private int age;

  public Car(){   // Constructor -> Kurucu Method. Sınıftan nesne oluşturulduğunda çalışır.
      System.out.println("Yeni bir araç üretildi.");
    //  Bir sınıf üst sınıfı extends ederse üst sınıfın constructorunu çağırmış olur!
      //However, the constructor of the superclass is called when the subclass is instantiated.
  }

  public Car(String model){ // Buda constructor.
      this.model=model;
      System.out.println(model+ "  bir araç üretildi.");
  }

  public void ShowInfos() {
      System.out.println("Renk=\t"+color);
      System.out.println("Model=\t"+model);
      System.out.println("Motor=\t"+engine);
      System.out.println("Yaş=\t"+age);

  }
  public void setColor(String color) {
      this.color=color;
  }

  public String getColor() {
      return color;
  }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getEngine() {
        return engine;
    }

    public void setEngine(float engine) {
        this.engine = engine;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public void run() {
        System.out.println("Car is running");
    }
}