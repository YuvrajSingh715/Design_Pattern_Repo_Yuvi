package com.yuvi.singletondesignpattern;

import java.lang.reflect.Constructor;

public class BCTest {

//------------------Break the singleton Design Pattern for coffee class--------------------\\

	public static void main(String[] args) throws Exception {

		HCoffee c1 = HCoffee.getCoffee();
		System.out.println("hashCode of c1 = " + c1.hashCode());
		c1.m2();

		Constructor<HCoffee> constructor = HCoffee.class.getDeclaredConstructor();
		constructor.setAccessible(true);
		HCoffee c2 = constructor.newInstance();
		System.out.println("hashCode of c2 = " + c2.hashCode());

//--------------------------Break the singleton Design Pattern----------------------------\\

	}

}
