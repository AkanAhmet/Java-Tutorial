package com.akanahmet.sample_algorithms;

import java.util.Base64;
import java.util.Scanner;

public class DecoderEncoder {

    // Input from keyboard
    public  String getScannerMethod(){
        Scanner klavye=new Scanner(System.in);
        System.out.println("Please enter a message to encrypt");
        return klavye.nextLine();
    }

    //Encoder
    public  String getEncoderMethod(String data){
        return Base64.getEncoder().encodeToString(data.getBytes());
    }

    //Decoder
    public  void getDecoderMethod(String data){
        String decrypt=new String(Base64.getMimeDecoder().decode(data));
        System.out.println(decrypt);
    }

    public static void main(String[] args) {
        DecoderEncoder decoderEncoder=new DecoderEncoder();
        decoderEncoder.getDecoderMethod(decoderEncoder.getEncoderMethod(decoderEncoder.getScannerMethod()));
    }

}
