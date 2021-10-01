package com.neosoft.basics;

public class LabWork2_5 {
	public static void main(String[] args) {
		for(int i=1;i<=5;i++) {
			for(int j=1;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		for(int i=5;i>=0;i--) {
			for(int j =i;j<=5;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
