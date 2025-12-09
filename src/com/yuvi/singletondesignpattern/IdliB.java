package com.yuvi.singletondesignpattern;

public class IdliB {

	private static IdliB idli;

	// constructor
	private IdliB() {

	}
	

	// Lazy way of creating singleton object with thread safety
	public static IdliB getIdli() {

//		System.out.println("Thread can access this sysout");

		synchronized (IdliB.class) {
			if (idli == null) {
				idli = new IdliB();
			}
			return idli;
		}
	}

}
