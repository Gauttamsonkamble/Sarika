package com.Gauttam;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.util.Scanner;

public class ServerSocket {

	public static void main(String[] args) throws IOException {

		DatagramSocket ds = new DatagramSocket(3002);

		System.out.println("Server is waiting");

		String str1 = "";

		while (!str1.equals("Bye")) {

			byte bt[] = new byte[1024];

			DatagramPacket dp = new DatagramPacket(bt, 1024);

			ds.receive(dp);

			String str = new String(dp.getData(), 0, dp.getLength());

			System.out.println("Client massage :" + str);

			Scanner sc = new Scanner(System.in);

			System.out.println("Enter massage :");
			str1 = sc.nextLine().trim();

			InetAddress add = dp.getAddress();

			DatagramPacket dp1 = new DatagramPacket(str1.getBytes(), str.length(), add, dp.getPort());
			
			ds.send(dp1);
		}
		ds.close();

	}

}
