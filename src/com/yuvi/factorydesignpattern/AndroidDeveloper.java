package com.yuvi.factorydesignpattern;


public class AndroidDeveloper implements Employee{

	@Override
	public int salary() {
		System.out.println("Android Developer salary");
		return 58800;
	}

}