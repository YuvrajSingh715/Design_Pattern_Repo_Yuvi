package com.yuvi.singletondesignpattern;

public class HCoffee {
	
	private static HCoffee coffee;

//---------------------------handle the breaking of singleton----------------------------\\
	// constructor
	private HCoffee() {
	             if (coffee != null) {
	            	 throw new RuntimeException("You are trying to break singleton pattern.");
	             }
			}

	public void m2() {
		System.out.println("this is simple method.");
	}

// ---------------------------handle the breaking of singleton----------------------------\\

	
	// Lazy way of creating singleton object with thread safety
	public static HCoffee getCoffee() {

//			System.out.println("Thread can access this sysout");

		synchronized (IdliB.class) {
			if (coffee == null) {
				coffee = new HCoffee();
			}
			return coffee;
		}   
	}

}
