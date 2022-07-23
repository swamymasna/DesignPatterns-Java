package com.swamy.dp.fdp.realtime;

public class EmailCommunication implements Communication{

	@Override
	public void process(Employee employee) {
		System.out.println(employee.getEmpName()+ " Communcated via " + employee.getEmail() );
	}
}
