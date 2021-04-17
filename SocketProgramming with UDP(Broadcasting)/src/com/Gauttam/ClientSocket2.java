package com.Gauttam;
import java.io.*;
import java.net.*;
import java.util.*;

public class ClientSocket2 {

    public static void main(String [] args) {
        System.setProperty("java.net.preferIPv4Stack", "true");

        try {
            InetAddress group = InetAddress.getByName("localhost");
            MulticastSocket mSocket = new MulticastSocket(3456);
            mSocket.joinGroup(group);

            int i = 0;
            while(i < 10) {
                byte[] buffer = new byte[100];
                DatagramPacket packet = new DatagramPacket(buffer, buffer.length);
                mSocket.receive(packet);

                System.out.println(new String(buffer));
                i++;
            }
            mSocket.close();
            System.out.println("Closed Socket");
        } catch (Exception e) {e.printStackTrace();}
    }

}