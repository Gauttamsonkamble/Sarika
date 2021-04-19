package com.Gauttam;
import java.io.*;
import java.net.*;
import java.util.*;

public class ClientSocket {

   
	public static void main(String [] args) throws IOException,ArrayIndexOutOfBoundsException {
        
		try
		{
			
		
		InetAddress group =InetAddress.getByName("225.4.5.6");
    	
    	MulticastSocket mc = new MulticastSocket(3456);
    	
    	mc.joinGroup(group);
    	
    	byte bt[] = new byte[1024];
    	
    	DatagramPacket dp = new DatagramPacket(bt, bt.length);
    	
    	mc.receive(dp);
    	
    	System.out.println(new String(bt));
    	
    	mc.close();
    	
		}
		catch (Exception e) {
			e.printStackTrace();
		}
    }

}