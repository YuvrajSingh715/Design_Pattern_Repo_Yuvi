package com.yuvi.singletondesignpattern;

public enum HTea {
	
	INSTANCE; 
	
	void m1 () {
		System.out.println("this is a method m1 from handle tea class inside the enum");
	}

}
