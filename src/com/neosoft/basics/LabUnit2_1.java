package com.neosoft.basics;

public class LabUnit2_1 {
	public static void main(String[] args) {
		System.out.println("Increament and decrement operators:");
		int a = 10;
		System.out.println("Numberr is:"+ a);
		a++;
		System.out.println("Increamented value:"+ a);
		a--;
		System.out.println("Decremented value:"+ a);
		
		System.out.println("============================");
		System.out.println("Bitwise Complement Operator:");
		int b = 8;
		System.out.println("number is:" + b); 
		int c = ~b;
		System.out.println("Bitwise complemented value:" + c); 
		
		System.out.println("============================");
		System.out.println("Arithmetic operator:");
		int d = 5, e = 4;
		System.out.println("a:"+ d + " and b:"+ e);
		System.out.println("Addition operator(+)a+b:"+ d + e);
		System.out.println("Subtraction operator(-)a-b:"+ (d-e));
		System.out.println("Multiplication operator(*)a*b:"+ d * e);
		System.out.println("Division operator(/)a/b:"+ d / e);
		System.out.println("Modulo operator(%)a%b:"+ d % e);
		
		System.out.println("============================");
		System.out.println("Relational operator:");
		int f=10, g = 20;
		System.out.println("a : "+f+ "b : "+g);
		System.out.println("== operator:"+ (f==g));
		System.out.println("!= operator:"+ (f!=g));
		System.out.println("<= operator:"+ (f<=g));
		System.out.println(">= operator:"+ (f>=g));
		System.out.println("< operator:"+ (f<g));
		System.out.println("> operator:"+ (f>g));
		
		System.out.println("============================");
		System.out.println("Bitwise operator:");
		int h = 5, i = 7;
		System.out.println("a : "+h+ "b : "+i);
		System.out.println("& operator: " + (h & i));
		System.out.println("| operator: " + (h | i));
		System.out.println("^ operator: " + (h ^ i));
		System.out.println("~ operator: " + (~h));
		
		System.out.println("============================");
		System.out.println("conditional operator:");
		int j = 10;
		System.out.println("Value of:(a==10)?20:30 is"+((a == 1) ? 20:30));
		
		

	}
}
