package com.yuvi.abstractfactorydesignpattern;

public class AnimalClient {
	
	public static void main(String[] args) {
		
		Animal a1 = AnimalFactory.getAnimal(new DeerFactory());
		System.out.println(a1.name());
		System.out.println(a1.speed());
		
		Animal a2 = AnimalFactory.getAnimal(new LeopardFactory());
		System.out.println(a2.name());
		System.out.println(a2.speed());
		
	}

}