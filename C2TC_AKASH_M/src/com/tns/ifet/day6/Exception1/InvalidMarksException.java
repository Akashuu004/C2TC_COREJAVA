//Program to define User defined exception class
package com.tns.ifet.day6.Exception1;

public class InvalidMarksException extends Exception{

	public InvalidMarksException() {
		super();
	}

	public InvalidMarksException(String message) {
		super(message);
	}

	
}