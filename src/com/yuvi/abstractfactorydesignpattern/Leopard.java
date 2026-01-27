package com.yuvi.abstractfactorydesignpattern;

public class Leopard implements Animal{
	
	@Override
	public String speed() {
		System.out.println("Strenghts: Powerful, patient, and strikes with perfect timing.");
		return "Speed: 60km/s";
	}
	
	@Override
	public String name() {
		return "Animal Name: LEOPARD";
	}

}
