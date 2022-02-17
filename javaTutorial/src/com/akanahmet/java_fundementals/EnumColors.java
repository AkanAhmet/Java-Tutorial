package com.akanahmet.java_fundementals;

public enum EnumColors {

    BLUE(1,"blue"),GREEN(2,"green"),ORANGE(3,"orange");

    private final int colorId;
    private final String colorName;
    public int getColorId() {
        return colorId;
    }

    public String getColorName() {
        return colorName;
    }



    private EnumColors(int colorId, String colorName) {
        this.colorId = colorId;
        this.colorName = colorName;
    }
}

class EnumTest {
    public static void main(String[] args) {

        EnumColors colors=EnumColors.BLUE;
        System.out.println(colors);

        String  colors2 = EnumColors.BLUE.toString();
        System.out.println(colors2.toLowerCase());
        System.out.println("************************");
        System.out.println(colors.getColorId());

    }
}
