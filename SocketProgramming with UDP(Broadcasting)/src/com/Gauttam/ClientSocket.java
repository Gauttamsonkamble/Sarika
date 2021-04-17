package com.Gauttam;
import java.io.*;
import java.net.*;
import java.util.*;

public class ClientSocket {

    @SuppressWarnings("deprecation")
	public static void main(String [] args) throws IOException,ArrayIndexOutOfBoundsException {
        
//    	String group = args[1];
    	
    	MulticastSocket mc = new MulticastSocket(6000);
    	
    	mc.joinGroup(InetAddress.getByName("226.4.5.6"));
    	
    	byte bt[] = new byte[1024];
    	
    	DatagramPacket dp = new DatagramPacket(bt, bt.length);
    	
    	mc.receive(dp);
    	
    	String str = new String(dp.getData(),0,dp.getLength()); 
    	
    	System.out.println(str);
    	
    	mc.close();
    }

}