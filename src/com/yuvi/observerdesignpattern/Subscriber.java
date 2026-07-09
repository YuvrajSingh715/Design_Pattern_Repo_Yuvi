package com.yuvi.observerdesignpattern;

public class Subscriber implements Observer {

	String name;
	
	Subscriber(String name){
		this.name = name;
	}
	
	@Override
	public void notified(String title) {

		System.out.println("Hi "+this.name+" >> New video uploaded : "+title);
		
	}

}
