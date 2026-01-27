package com.yuvi.abstractfactorydesignpattern;

public class Deer implements Animal{

	@Override
	public String speed() {
		System.out.println("Strenghts: Alert, fast, and survives through awareness and agility.");
		return "Speed: 80km/h";
	}

	@Override
	public String name() {
		return "Animal Name: DEER";
	}

}
