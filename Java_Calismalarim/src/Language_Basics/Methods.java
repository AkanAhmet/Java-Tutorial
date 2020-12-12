package Language_Basics;

public class Methods {

    // OVERLOADİNG Example=> parametre sayısı,tipi ve return tipi değişebilir.
    // Kullanıcının tamsayı yerine ondalıklı sayı girdiği durumlarda hata ile karşılaşılmaması için önlem niteliğinde..
    public static int toplama(int sayi1, int sayi2) {
        int sonuc = sayi1 + sayi2;
        return sonuc;
    }

    public static double toplama(double sayi1, double sayi2) {
        double sonuc = sayi1 + sayi2;
        return sonuc;
    }
//-------------------------------------------------------------------------------------------------------------------------
    //RECURSIVE METHOD =>

    public static int factorial (int num) {
        if(num == 1) {
            return 1;
        }
        return num * factorial(num-1);

    }
    public static void main(String[] args) {
        System.out.println(toplama(5,6));
        System.out.println(toplama(3.78,6.54));
        System.out.println(factorial(5));

    }
}
