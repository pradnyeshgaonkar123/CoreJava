package com.neosoft.basics;
//Write a Java program to display default value of all primitive data types of
//Java.
public class LabUnit1_2 {
	byte a;
	short b;
	int c;
	long d;
	float e;
	double f;
	char g;
	boolean h;
	public void showDefault() {
		System.out.println("The default values of primitive data types are:");
		System.out.println("Byte :"+a);
		System.out.println("Short :"+b);
		System.out.println("Int :"+c);
		System.out.println("Long :"+d);
		System.out.println("Float :"+e);
		System.out.println("Double :"+f);
		System.out.println("Char :"+g);
		System.out.println("Boolean :"+h);
	}
	public static void main(String[] args) {
		LabUnit1_2 lb = new LabUnit1_2();
		lb.showDefault();
	}
}
