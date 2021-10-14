package lab;
import java.util.Scanner;
//call by reference
public class LabWork3_3_1 {
	int number;
	
	int incrementNumber(int number) {
		return ++number;
	}
	
	public static void main(String[] args) {
		LabWork3_3_1 obj1 = new LabWork3_3_1();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);  
		System.out.println("Enter number:");
		int entered_num = sc.nextInt();
		int incremented_num = obj1.incrementNumber(entered_num);
		System.out.println("Entered number:"+entered_num);
		System.out.println("Incremented number:"+incremented_num);
	}
}
