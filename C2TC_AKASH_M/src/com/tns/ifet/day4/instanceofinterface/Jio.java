package com.tns.ifet.day4.instanceofinterface;

public class Jio implements Phone {

	@Override
	public void call() {
		System.out.println("Calling using Jio");
	}

	@Override
	public void sms() {
		System.out.println("Messaging using Jio");

	}

}