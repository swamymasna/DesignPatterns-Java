package com.swamy.dp.strategydesignpattern;

public class DebitCard implements IPaymentService{

	@Override
	public boolean payBillAmt(Double billAmt) {
		System.out.println("Paid 'DebitCard' Bill Amount : " + billAmt);
		return true;
	}
}
