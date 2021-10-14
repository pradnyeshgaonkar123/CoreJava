package session;
import java.util.Scanner;

public class SessionTask1_3 {
	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int a[] = new int[10];
		int i, j, temp;
		System.out.println("enter 5 array elements : ");
		for(i = 0; i < 5; i++) {
			a[i] = sc.nextInt();
		}
			
	 
		
		for(i = 0; i < 5; i++) {
			for(j = i+1;j < 5; j++) {
				if(a[i]>a[j]) {
					temp = a[i];
					a[i]=a[j];
					a[j]=temp;
					
				}
			}
		}
		for(i = 0; i < 5; i++) {
				System.out.print(a[i]+" ");
		}
		
	}
}
