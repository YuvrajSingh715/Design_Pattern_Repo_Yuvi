package com.yuvi.abstractfactorydesignpattern;

public class DeerFactory extends AnimalAbstractFactory {

	@Override
	public Animal createAnimal() {
		return new Deer();
	}

}
