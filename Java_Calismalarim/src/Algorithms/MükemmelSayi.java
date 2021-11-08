package Algorithms;

import static java.lang.Math.*;

public class MükemmelSayi {

    void mükemmelSayi(int x) {
        if(x>=100 && x <=999) {
        int temp=x;
        int birlik= temp %10;
        temp/=10;
        int onluk = temp%10;
        temp/=10;
        int yüzlük = temp;

            if((pow(birlik,3)+ pow(onluk,3) +pow(yüzlük,3) == x)) {
                System.out.println(x + "  Mükemmel Sayıdır.");

            }}    }

    public static void main(String[] args) {
            MükemmelSayi mükemmelSayi = new MükemmelSayi();
            for(int i=0;i<1000;i++)
                mükemmelSayi.mükemmelSayi(i);

    }
}
