package OOP;
//Büyük bir projede her yerden erişilmesini istediğimiz(static) değiştirilmesini istemediğimiz(final)
//değerler için public static final kullanırız.
class students{

     final int sondeger=15; // finalin değeri ya tanımlanırken yada constructor içinde verilebilir sadece.
    public static int ogr_sayisi=0; // Static , objeden bağımsızdır, classa bağımlıdır, program başında bir kez oluşturulur.
                                    // Değeri korunur. Static değişkenlere sınıfisminden direk erişilebilir.

        public students() {
            ogr_sayisi++;
        }
}

public class Static_Final {
    public static void main(String[] args) {
        students st1 = new students();
        students st2 = new students();
        students st3 = new students();
        System.out.println(students.ogr_sayisi);
    }
}
