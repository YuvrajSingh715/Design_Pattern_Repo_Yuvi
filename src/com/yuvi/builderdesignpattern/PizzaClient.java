package com.yuvi.builderdesignpattern;

public class PizzaClient {

	public static void main(String[] args) {

		Pizza pizza1 = new Pizza.PizzaBuilder()
				.setRate("250Rs.")
				.setTopping("Capsicum+SweetCorn+Paneer")
				.setSpiceLevel("Tangi")
				.making();
		
		System.out.println(pizza1.getRate());
		System.out.println(pizza1);
		
		
		Pizza pizza2 = Pizza.PizzaBuilder.newPizza()
				.setRate("230Rs.")
				.setTopping("Onion+Olive")
				.making();
		
		System.out.println(pizza2.getRate());
		System.out.println(pizza2);

	}
}
