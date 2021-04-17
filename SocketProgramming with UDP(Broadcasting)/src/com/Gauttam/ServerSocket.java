package com.Gauttam;
import java.net.*;
import java.io.*;
import java.util.*;


public class ServerSocket {

    public static void main(String[] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");

        try {
            InetAddress group = InetAddress.getByName("localhost");
            MulticastSocket socket = new MulticastSocket();
            String message = "UDP Multicasting is awesome!";

            DatagramPacket packet = new DatagramPacket(message.getBytes(), message.length(), group, 3456);
            socket.send(packet);
            socket.close();
        } catch (Exception e) { e.printStackTrace(); }
    }

}