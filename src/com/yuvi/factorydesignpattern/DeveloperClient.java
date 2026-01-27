package com.yuvi.factorydesignpattern;

public class DeveloperClient {
	
	public static void main(String[] args) {
		
		Employee employee1 = EmployeeFactory.getEmployee("ANDROID DEVELOPER");
		int salary = employee1.salary();
		System.out.println("salary : "+ salary);
		
		Employee employee2 = EmployeeFactory.getEmployee("WEB DEVELOPER");
		System.out.println("salary : " + employee2.salary());
		
		Employee employee3 = EmployeeFactory.getEmployee("QA Tester");
		System.out.println("salary : " + employee3.salary());
		
	}

}
