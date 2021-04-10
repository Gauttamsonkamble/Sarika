package com.Gauttam;

import java.io.IOException;
import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

public class ServerSocket {

	public static void main(String[] args) throws IOException {
		
		DatagramSocket ds = new DatagramSocket(3002);
		
		System.out.println("Server is waiting");
		
		byte bt[] = new byte[1024];
		
		DatagramPacket dp = new DatagramPacket(bt, 1024);
		
		ds.receive(dp);
		
		String str = new String(dp.getData(),0,dp.getLength());
		
		System.out.println("Client massage :"+str);
		
		ds.close();

	}

}
