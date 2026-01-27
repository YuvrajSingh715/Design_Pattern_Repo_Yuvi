package com.yuvi.abstractfactorydesignpattern;

public class LeopardFactory extends AnimalAbstractFactory {

	@Override
	public Animal createAnimal() {
		return new Leopard();
	}

}
