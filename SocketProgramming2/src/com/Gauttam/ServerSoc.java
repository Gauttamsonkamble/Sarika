package com.Gauttam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class ServerSoc {

	public static void main(String[] args) throws IOException {

		System.out.println("Server is waiting to client");
		ServerSocket ss = new ServerSocket(9001);

		Socket s = ss.accept();

		System.out.println("Connection Established");

		DataInputStream dis = new DataInputStream(s.getInputStream());
		
		DataOutputStream dio = new DataOutputStream(s.getOutputStream());
		
		Scanner sc = new Scanner(System.in);

		String clientMassage = "", serverMassage = "";

		clientMassage = dis.readUTF();

		System.out.println("client Message :" + clientMassage);
		
		System.out.println("Enter Massage :");
		serverMassage =sc.nextLine();
		
		dio.writeUTF(serverMassage);
		
		dio.flush();

		ss.close();

	}

}
