package com.swamy.dp.factorydesignpattern.realtime;

import java.util.ArrayList;
import java.util.List;

public class FactoryMain {

	public static void main(String[] args) {

		List<Employee> employees = employees();
		FactoryProcessor factoryProcessor = new FactoryProcessor();
		
		// Communication processor;

		// for (Employee employee : employees) {
		// processor = factoryProcessor.getCommunication(employee.getModeOfContact());
		// processor.process(employee);
		// }

		System.out.println("\nUsing Java8 ForEach + Lambda Expression---\n");
		employees.forEach(employee -> {
			factoryProcessor.getCommunication(employee.getModeOfContact()).process(employee);
		});
	}

	private static List<Employee> employees() {
		List<Employee> emps = new ArrayList<>();
		emps.add(new Employee("Swamy", "Email", "swamy@gmail.com", "8099131384"));
		emps.add(new Employee("Kiran", "Mobile", "kiran@gmail.com", "7799131384"));
		emps.add(new Employee("Ntr", "Email", "ntr@gmail.com", "8899131384"));

		return emps;
	}
}
