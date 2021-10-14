package lab;
import java.lang.NegativeArraySizeException;
import java.util.Scanner;

public class LabWork10_1 {
	public static int size;
	public static void main(String[] argd) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		try {
			System.out.println("Enter array size : ");
			size = sc.nextInt();
			int[] ary = new int[size];
			for(int i=0;i<ary.length; i++) {
				ary[i] = sc.nextInt();
			}
			System.out.println("Array elements are: ");
			for(int i=0;i<ary.length; i++) {
				System.out.print(ary[i]);
			}
		}	
		catch(NegativeArraySizeException e) {
			System.out.println(e+"\n You entered size : "+size);		}
		System.out.println("This will print  after try catch block");
		
	}
	
	
}
