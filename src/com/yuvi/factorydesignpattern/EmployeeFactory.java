package com.yuvi.factorydesignpattern;

public class EmployeeFactory {

	public static Employee getEmployee(String empType) {

		if (empType.trim().equalsIgnoreCase("ANDROID DEVELOPER")) {

			return new AndroidDeveloper();

		} else if (empType.trim().equalsIgnoreCase("WEB DEVELOPER")) {

			return new WebDeveloper();

		} else if (empType.trim().equalsIgnoreCase("QA TESTER")) {
			
			return new QATester();

		} else {
			return null;
		}
	}
}
