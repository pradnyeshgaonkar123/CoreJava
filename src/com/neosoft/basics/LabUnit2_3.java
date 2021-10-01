package com.neosoft.basics;
import java.util.Scanner;

public class LabUnit2_3 {
	public static void main(String[] args) {
		//Find the length of array.
		
		int[] ary = new int[5];
		System.out.println("The size of the array is:"+ary.length);
		
		System.out.println("==========================");
		//Demonstrate one dimensional array.
		int len = 4;
		Scanner sc1=new Scanner(System.in);
		int a[]=new int[len];//declaration    	 
		System.out.print("Enter " + len + " Element to Store in Array :\n");
	        for(int i=0; i<len; i++)
	        {
	           a[i] = sc1.nextInt();
	        }   
	        System.out.print("Elements in Array are :");
	        for(int i=0; i<len; i++)
	        {
	           System.out.print(a[i] + "  ");
	        }  
		
	    System.out.println();
	    System.out.println("==========================");
	    //Demonstrate two dimensional array.
	    
	    int values[][] = {
	    		{1,2,3},{4,5,6},{7,8,9},{10,11,12}
	    };
	    for(int row = 0;row<4;row++) {
	    	for(int cols = 0;cols<3;cols++) {
	    		System.out.print(values[row][cols]+"  ");
	    	}
	    	System.out.println();
	    }
	        
	    System.out.println("=========================="); 
	    //Demonstrate two dimensional array.
	    int[][][] arr = { { { 1, 2 }, { 3, 4 } },{ { 5, 6 }, { 7, 8 } } };
	    for (int i = 0; i < 2; i++) {
	    	for (int j = 0; j < 2; j++) {
	    		for (int k = 0; k < 2; k++) {
	    			System.out.print(arr[i][j][k] + " ");
	    				}
	    		System.out.println();
	    			}
	    	System.out.println();
	    		}
			}
		}

	       

