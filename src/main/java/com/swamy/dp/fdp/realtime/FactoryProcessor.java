package com.swamy.dp.fdp.realtime;

public class FactoryProcessor {

	public Communication getCommunication(String input) {
		if(input.equalsIgnoreCase("Mobile")) {
			return new MobileCommunication();
		}
		else if(input.equalsIgnoreCase("Email")) {
			return new EmailCommunication();
		}
		return null;
	}
}
