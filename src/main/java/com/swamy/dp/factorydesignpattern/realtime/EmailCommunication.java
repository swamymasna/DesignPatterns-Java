package com.swamy.dp.factorydesignpattern.realtime;

public class EmailCommunication implements Communication{

	@Override
	public void process(Employee employee) {
		System.out.println(employee.getEmpName()+ " Communcated via " + employee.getEmail() );
	}
}
