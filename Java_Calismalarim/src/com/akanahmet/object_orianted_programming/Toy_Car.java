package com.akanahmet.object_orianted_programming;
// Inheritance çoçuk sınıflar, ata sınıfın özelliklerini alır. Copy - paste den kurtuluruz.
// Super , Base class -> Subclass
// Override => Base sınıftan miras aldığın metodları özelleştirmeye ,değiştirmeye yarar.
public class Toy_Car extends Car {

    private String matter;

    public Toy_Car(String matter){
            this.matter= matter;
    }

    @Override
    public String toString() {
        return ("Object sınıfındaki toString metodunu override ettim");
        //return super.toString();
    }

    @Override  // Car' da ki ne ek olarak, maddesini de yazdırdık.
    public void ShowInfos() {
      super.ShowInfos();
        System.out.println("Maddesi=\t"+matter);

    }

    public String getMatter() {
        return matter;
    }

    public void setMatter(String matter) {
        this.matter = matter;
    }
}
