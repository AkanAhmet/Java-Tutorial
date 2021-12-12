package JavaCores;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

// Dosya işlemlerinde try-catch kullanılır.

public class File_Operations {

    //File CREATE=>
    public static void main(String[] args) {
        try {
            File myObj = new File("filename.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
             } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
     //   ---------------------------------------------------------------//
        // File WRITE=>
        try {
            FileWriter myWriter = new FileWriter("filename.txt");
            myWriter.write("Files in Java might be tricky, but it is fun enough!");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
//        import java.util.Formatter;
//
//        public class MyClass {
//            public static void main(String[ ] args) {
//                try {
//                    Formatter f = new Formatter("C:\\sololearn\\test.txt");
//                    f.format("%s %s %s", "1","John", "Smith \r\n");
//                    f.format("%s %s %s", "2","Amy", "Brown");
//                    f.close();
//                } catch (Exception e) {
//                    System.out.println("Error");
//                }
//            }


        //   ---------------------------------------------------------------//
        // File READ=>
        try {
            File myObj = new File("filename.txt");
            Scanner myReader = new Scanner(myObj);
            while (myReader.hasNextLine()) {
                String data = myReader.nextLine();
                System.out.println(data);
            }
            myReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        // READ word by word =>  ITERATOR KULLANILIR
//        try {
//            File x = new File("C:\\sololearn\\test.txt");
//            Scanner sc = new Scanner(x);
//            while(sc.hasNext()) {
//                System.out.println(sc.next());
//            }
//            sc.close();
//        } catch (FileNotFoundException e) {
//            System.out.println("Error");
//        }

        //   ---------------------------------------------------------------//
        // File DELETE=>

        File myObj = new File("filename.txt");
        if (myObj.delete()) {
            System.out.println("Deleted the file: " + myObj.getName());
        } else {
            System.out.println("Failed to delete the file.");
        }

        //   ---------------------------------------------------------------//
        // FOLDER DELETE=>
        File myObj2 = new File("C:\\Users\\MyName\\Test");
        if (myObj2.delete()) {
            System.out.println("Deleted the folder: " + myObj2.getName());
        } else {
            System.out.println("Failed to delete the folder.");
        }


    }
}
