package com.Gauttam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

import com.sun.org.apache.xpath.internal.operations.Equals;

public class ClientSoc {

	public static void main(String[] args) throws UnknownHostException, IOException {

		System.out.println("Client Has started");
		Socket s = new Socket("localhost", 9001);

		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		DataInputStream dis = new DataInputStream(s.getInputStream());
		Scanner sc = new Scanner(System.in);

		String clientMassage = "", serverMassage = "";
		
		
			while(!clientMassage.equals("Bye"))
			{
				System.out.println("Enter message :");

				clientMassage = sc.nextLine();

				dout.writeUTF(clientMassage);

				serverMassage = dis.readUTF();

				System.out.println("Server Massage : " + serverMassage);
			}
			

		

		
		dout.flush();
		dout.close();
		s.close();

	}

}
