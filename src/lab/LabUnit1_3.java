package lab;
import java.util.Scanner;
// Write a program check two strings are equal or not.
public class LabUnit1_3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc  = new Scanner(System.in);
		System.out.println("Enter first string:");
		String str1 = sc.nextLine();
		
		System.out.println("Enter second string:");
		String str2 = sc.nextLine();
		
		if(str1.equals(str2)) {
			System.out.println("Equal strings");
		}
		else {
			System.out.println("Unequal strings");
		}
	}

}
