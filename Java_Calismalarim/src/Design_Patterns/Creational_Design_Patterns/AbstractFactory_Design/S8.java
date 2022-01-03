package design_patterns.creational_design_patterns.AbstractFactory_Design;




public class S8 implements ITelefon {

    public S8(String model, String batarya, int en, int boy) {
        this.model = model;
        this.batarya = batarya;
        this.en = en;
        this.boy = boy;
    }

    private String model;
    private String batarya;
    private int en;
    private int boy;

    @Override
    public String getModel() {;
        return null;
    }

    @Override
    public String getBatarya() {
        return null;
    }

    @Override
    public int getEn() {
        return 0;
    }

    @Override
    public int getBoy() {
        return 0;
    }

    @Override
    public String toString() {
        return "S8{" +
                "model='" + model + '\'' +
                ", batarya='" + batarya + '\'' +
                ", en=" + en +
                ", boy=" + boy +
                '}';
    }
}
