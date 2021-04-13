package com.Gauttam;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class ClientSocket {

	public static void main(String[] args) throws IOException {

		DatagramSocket ds = new DatagramSocket();

		Scanner sc = new Scanner(System.in);
		
		byte bt[] = new byte[1024];

		String str = "";
		while (!str.equals("Bye")) {

			System.out.println("Enter massage :");
			str = sc.nextLine();

			InetAddress add = InetAddress.getByName("localhost");

			DatagramPacket dp = new DatagramPacket(str.getBytes(), str.length(), add, 3002);

			ds.send(dp);

			

			DatagramPacket dp1 = new DatagramPacket(bt, bt.length);

			ds.receive(dp1);

			String str1 = new String(dp1.getData());

			System.out.println("Server massage :" + str1);
		}
		ds.close();

	}

}
