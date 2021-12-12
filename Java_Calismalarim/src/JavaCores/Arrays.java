package JavaCores;
// String ->  java.lang.String
public class Arrays {
    public static void main(String[] args) {
        int[] array;
        array=new int[10];
        array[0] = 100;

        byte[] anArrayOfBytes;
        short[] anArrayOfShorts;
        long[] anArrayOfLongs;
        float[] anArrayOfFloats;
        double[] anArrayOfDoubles;
        boolean[] anArrayOfBooleans;
        char[] anArrayOfChars;
        String[] anArrayOfStrings = new String[5];
        anArrayOfStrings[0]="ahmet";
        anArrayOfStrings[1]="akan";

        int[] anArray = {
                100, 200, 300,
                400, 500, 600,
                700, 800, 900, 1000
        };

        // Multidimensional array=>
        String[][] arrays={{"ahmet","gamze","burak"},{"duman","boncuk","zıpzıp"}};
        System.out.println(arrays[0][0]+"->"+arrays[1][0]);
        System.out.println(arrays[0][1]+"->"+arrays[1][1]);
        System.out.println(arrays[0][2]+"->"+arrays[1][2]);

        //Copying Arrays =>
        char[] copyFrom = {'d', 'e', 'c', 'a', 'f', 'f', 'e',
                'i', 'n', 'a', 't', 'e', 'd'};

        char[] copyTo = java.util.Arrays.copyOfRange(copyFrom, 2, 9);

        System.out.println(new String(copyTo));

        // Array Functions =>
        //Arrays.sort() --- Arrays.binarySearch();(Dizi sıralı olmalı) ---
        //Arrays.equals() --- Arrays.copyOf() --- Arrays.fill() ---Arrays.toString() ---

        }
    }

