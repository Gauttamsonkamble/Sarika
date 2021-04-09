package com.Gauttam;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.Scanner;

public class ClientSoc {

	public static void main(String[] args) throws UnknownHostException, IOException {

		System.out.println("Client Has started");
		Socket s = new Socket("localhost", 9001);

		DataOutputStream dout = new DataOutputStream(s.getOutputStream());

		DataInputStream dis = new DataInputStream(s.getInputStream());

		Scanner sc = new Scanner(System.in);

		System.out.println("Enter message :");

		String msg = sc.nextLine();

		dout.writeUTF(msg);

		String servermsg = dis.readUTF();

		System.out.println("Server Massage :" + servermsg);

		dout.flush();
		dout.close();
		s.close();

	}

}
