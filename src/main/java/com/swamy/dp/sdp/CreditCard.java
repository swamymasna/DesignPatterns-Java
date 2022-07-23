package com.swamy.dp.sdp;

public class CreditCard implements IPaymentService{

	@Override
	public boolean payBillAmt(Double billAmt) {
		System.out.println("Paid 'CreditCard' Bill Amount : " + billAmt);
		return true;
	}
}
