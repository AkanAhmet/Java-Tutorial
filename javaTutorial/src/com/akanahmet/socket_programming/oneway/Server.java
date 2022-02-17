package com.akanahmet.socket_programming.oneway;

import java.io.DataInputStream;
import java.net.ServerSocket;

// Server must be ready before running client.
// Socket uses String variables
// Object --> String --> primitive

public class Server {

    public static void main(String[] args) {

        int port = 7777; // port
        String clientValue; // receives request from client
        int stringToInteger;
        System.out.println("Server ready");
        try (DataInputStream dataInputStream = new DataInputStream(new ServerSocket(port).accept().getInputStream())) {
            clientValue = dataInputStream.readUTF();
            stringToInteger = Integer.valueOf(clientValue);
            System.out.println("Square root of " + stringToInteger + " ="  + Math.sqrt(stringToInteger));

        } catch (Exception e) {
            e.printStackTrace();
        }


    }

}
