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
		
		System.out.println("Enter massage :");
		String str = sc.nextLine();
		
		InetAddress add = InetAddress.getByName("localhost");
		
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),add,3002);
		
		ds.send(dp);
		ds.close();

	}

}
