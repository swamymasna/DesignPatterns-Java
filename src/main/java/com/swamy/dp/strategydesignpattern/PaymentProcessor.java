package com.swamy.dp.strategydesignpattern;

public class PaymentProcessor {

	private IPaymentService paymentService = null;
	
//	public void setPaymentService(IPaymentService paymentService) {
//		this.paymentService = paymentService;
//	}
	
	public PaymentProcessor(IPaymentService paymentService) {
		this.paymentService = paymentService;
	}
	
	public boolean doPayment(Double billAmt) {
		return paymentService.payBillAmt(billAmt);
	}


}

