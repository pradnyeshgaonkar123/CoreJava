package lab;
import java.util.InputMismatchException;
import java.util.Scanner;

public class LabWork10_2 {
	public static void main(String[] args) {
		try {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int size;
		System.out.println("Enter array Size : ");
		size = sc.nextInt();
		int[] ary = new int[size];
		System.out.println("Enter array elements : ");
		for(int i=0;i<ary.length;i++) {
			ary[i] = sc.nextInt();
		}
		int num;
		System.out.println("Enter another array element : ");
		num = sc.nextInt();
		ary[size+1] = num;
		}
		catch(ClassCastException e) {
			System.out.println("Unresolved compilation"+ e);
		}
		catch(InputMismatchException e) {
			System.out.println("Input mismatch "+e);
		}
		catch(OutOfMemoryError e) {
			System.out.println("Out of memory"+e.getMessage());
		}
		catch( NegativeArraySizeException e) {
			System.out.println("Arraay size can't be negative "+e );
		}
		catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("Array index out of bounds "+ e);
		}
		finally {
			System.out.println("This statement will executes always");
		}
		
		
		
	}
}
