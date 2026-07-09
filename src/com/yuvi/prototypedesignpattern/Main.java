package com.yuvi.prototypedesignpattern;

public class Main {

	public static void main(String[] args) throws InterruptedException {

		System.out.println("Creating Obeject using prototype design pattern");

		NetworkConnection networkConnection = new NetworkConnection();
		networkConnection.setIp("152.574.4.71");
		networkConnection.loadVeryImportantData();
		System.out.println(networkConnection);

		
		// we want new object of network connection
		try {
			NetworkConnection networkConnection1 = (NetworkConnection) networkConnection.clone();
			NetworkConnection networkConnection2 = (NetworkConnection) networkConnection1.clone();
			System.out.println(networkConnection1);
			System.out.println(networkConnection2);
		} catch (CloneNotSupportedException e) {
			e.printStackTrace();
		}

	}

}
