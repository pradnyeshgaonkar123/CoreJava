package lab;

public class LabUnit2_2 {
	public static void main(String[] args) {
		System.out.println("if statement");
		int a=10,b=10;
		System.out.println("a: "+a+ " b: "+b);
		if(a>b) {
			System.out.println("a is greater");
		}
		else if(a<b) {
			System.out.println("b is greater");

		}
		else {
			System.out.println("both are equal");
		}
		
		System.out.println("=========================");
		System.out.println("switch statement");
		int month = 3;
		switch(month) {
		case 1:
			System.out.println("January");
			break;
		case 2:
			System.out.println("February");
			break;
		case 3:
			System.out.println("March");
			break;
		case 4:
			System.out.println("April");
			break;
		}
		
		System.out.println("=========================");
		System.out.println("For loop");
		for(int i=1; i<=10; i++) {
			System.out.println(i);
		}
		
		System.out.println("=========================");
		System.out.println("while loop");
		int num = 10;
		while(num >= 1) {
			System.out.println(num);
			num--;
		}
		
		System.out.println("=========================");
		System.out.println("Do while loop");
		int table = 2,j = 1;
		do {
			System.out.println(table*j);
			j++;
		}while(j<=10);
	}
}
