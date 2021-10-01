package com.neosoft.basics;

public class SimpleObject {
	String message;
	
	public SimpleObject(String msg) {
		this.message = msg;
	}
	
	public void displayMessage() {
		System.out.println(message);
	}
	public static void main(String[] args) {
		SimpleObject obj1 = new  SimpleObject("First message");
		obj1.displayMessage();
	}
}
