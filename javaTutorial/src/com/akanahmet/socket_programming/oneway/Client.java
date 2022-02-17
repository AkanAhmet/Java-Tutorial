package com.akanahmet.socket_programming.oneway;

import javax.swing.*;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;

public class Client {
    public static void main(String[] args) {
        String number;
        String ipAddres = "localhost"; // 127.0.0.1

        int port = 7777; //port
        try (DataOutputStream dataOutputStream = new DataOutputStream(new Socket(ipAddres, port).getOutputStream())) {
            number = JOptionPane.showInputDialog("Please enter a number to find square root");
            dataOutputStream.writeUTF(number);
        } catch (IOException io) {
            System.err.println("Error occured");
            io.printStackTrace();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
