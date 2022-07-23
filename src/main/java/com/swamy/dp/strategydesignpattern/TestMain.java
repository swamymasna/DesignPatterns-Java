package com.swamy.dp.strategydesignpattern;

public class TestMain {

	public static void main(String[] args) {
		
//		PaymentProcessor processor = new PaymentProcessor();
//		processor.setPaymentService(new ZetaCard());
		
		PaymentProcessor processor = new PaymentProcessor(new DebitCard());
		boolean billStatus = processor.doPayment(4809.04);
		
		if(billStatus) {
			System.out.println("Paid Successfully");
		}
		else {
			System.out.println("Not Paid Bill Amount...???");
		}
	}
}
