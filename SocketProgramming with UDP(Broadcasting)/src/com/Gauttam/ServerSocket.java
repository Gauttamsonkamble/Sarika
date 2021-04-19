package com.Gauttam;

import java.net.*;
import java.io.*;
import java.util.*;

public class ServerSocket {

	public static void main(String[] args) throws IOException {
		
		try
		{
			
		
		InetAddress group = InetAddress.getByName("225.4.5.6");
		MulticastSocket mc = new MulticastSocket();

		String msg = "Hello";

		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), group, 3456);

		mc.send(dp);
		mc.close();
		
		}
		catch (Exception e) {
			e.printStackTrace();
		}
	}

}