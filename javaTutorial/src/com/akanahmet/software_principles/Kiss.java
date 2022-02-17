package com.akanahmet.software_principles;

import javax.swing.*;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

//Keep It Simple Stupid

public class Kiss {
    private static String path = "kiss.txt";

    //File Writer
    public void utilWriter() {
        //try with resources
        try (BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(path, true))) {
            String value = JOptionPane.showInputDialog("Enter something");
            bufferedWriter.write(value);
            bufferedWriter.flush();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    //File Reader
    public void utilReader() {
        //try with resources
        try (BufferedReader bufferedReader = new BufferedReader(new FileReader(path))) {
            String numberRow = "", sumRow = "";
            while ((numberRow = bufferedReader.readLine()) != null) {
                sumRow += numberRow;
            }
            System.out.println(sumRow);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }


    public static void main(String[] args) {
        Kiss kiss = new Kiss();
        kiss.utilWriter();
        kiss.utilReader();
    }



}