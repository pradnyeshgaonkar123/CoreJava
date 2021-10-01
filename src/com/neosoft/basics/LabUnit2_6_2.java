package com.neosoft.basics;
import java.util.Scanner;

public class LabUnit2_6_2 {
	public static void main(String[] args) {
		int number, digit, sum = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter number:");
		number = sc.nextInt();
		while(number>0) {
			digit = number%10;
			sum=sum+digit;
			number=number/10;
		}
		System.out.println("sum of digits: "+sum);
	}

}
