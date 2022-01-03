package java_fundementals;

public class Data_Types {
    public static void main(String[] args) {

        // Referance data types => Array, Class, Interface
        //  Primitive  data types =>

        byte mybyte; 
        mybyte =  120; //-128 ile +127 arası değer alır. Büyüklüğü 8 bit tir.
        short myshort; myshort= 25105; //32768 ile +32767 arası değer alır.Büyüklüğü 16 bit tir.
        char mychar; mychar='A'; mychar= 65; // Harfin Unicode harf karşılığını tutar. Büyüklüğü 16 bit tir. "ASCII TABLE"
        int myint; myint= 150999; //-2.147.483.648 ile 2.147.483.647 arası değer alır. Büyüklüğü 32 bit tir. TAMSAYI
        long mylong; mylong= 30815138278L; //-9,223,372,036,854,775,808 arası 9,223,372,036,854,775,807 değer alır.
        // Büyüklüğü 64 bit tir. Sayının sonuna 'L' eki getirilmelidir,yoksa int olarak algılanır. TAMSAYI
        float myfloat; myfloat= 3.14F;//1.4×10^-45 ile 3.4×10^38 arası değer alır. Büyüklüğü 32 bit tir.Sonuna 'F' getirilir. Reel Sayı.
        double mydouble; mydouble= 2.719929797956D;//4.9×10^-324 ile 1.8×10^308 arası değer alır. Büyüklüğü 64 bit tir.Sonuna 'D' getirilir. Reel Sayı.
        boolean myboolean; myboolean= true; // true veya false değerlerini alabilir, koşullarda kullanılır.
    }
}
/*     Using Underscore: long creditCardNumber = 1234_5678_9012_3456L;

         Data Type             Default Value (for fields)
        byte	                           0
        short	                           0
        int	                               0
        long	                           0L
        float	                           0.0f
        double	                           0.0d
        char	                         '\u0000'
        String (or any object)  	      null
        boolean	                          false
        --------------------------------------------------------------
        // The number 26, in decimal
        int decVal = 26;
        //  The number 26, in hexadecimal
        int hexVal = 0x1a;
        // The number 26, in binary
        int binVal = 0b11010;

 */