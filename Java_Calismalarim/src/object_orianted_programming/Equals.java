package object_orianted_programming;

public class Equals {
    public static void main(String[] args) {
        Ayarcheck ayarcheck1 =  new Ayarcheck("Ahmet");
        Ayarcheck ayarcheck2 = new Ayarcheck("Ahmet");
        if(!ayarcheck1.equals(ayarcheck2)) {
            System.out.println("Aynı isimleri vermiş olsakda objeler uniqedir.");
        }
    }
}

class Ayarcheck {
    String name;

    public String getName() {
        return name;
    }

    public Ayarcheck(String name) {
        this.name = name;
    }
}
