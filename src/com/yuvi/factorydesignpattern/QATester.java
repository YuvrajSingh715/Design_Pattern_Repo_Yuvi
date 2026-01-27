package com.yuvi.factorydesignpattern;

public class QATester implements Employee {
	
	@Override
	public int salary() {
		System.out.println("QA Tester salary");
		return 34372;
	}

}
