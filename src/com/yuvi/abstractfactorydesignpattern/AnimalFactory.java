package com.yuvi.abstractfactorydesignpattern;

public class AnimalFactory {

	public static Animal getAnimal(AnimalAbstractFactory factory) {
		return factory.createAnimal();
	}
	
}
 