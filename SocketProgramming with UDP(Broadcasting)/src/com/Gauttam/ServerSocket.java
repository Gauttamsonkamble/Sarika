package com.Gauttam;

import java.net.*;
import java.io.*;
import java.util.*;

public class ServerSocket {

	public static void main(String[] args) throws IOException {
//		String group = "227.4.5.6";

		MulticastSocket mc = new MulticastSocket();

		String msg = "Hello";

		DatagramPacket dp = new DatagramPacket(msg.getBytes(), msg.length(), InetAddress.getByName("227.4.5.6"), 6000);

		mc.send(dp);
		mc.close();
	}

}