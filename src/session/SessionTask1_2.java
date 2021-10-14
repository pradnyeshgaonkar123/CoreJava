package session;

public class SessionTask1_2 {
	public static void main(String[] args) {
		int i,j,k,count=1;
		for(i=1;i<=4;i++) {
			for(j=4;j>=i;j--) {
				System.out.print(" ");
			}
			for(k=1;k<=i;k++) {
		       System.out.print(count+" ");
		       count++;
			}
			
			System.out.println();
		}
	}
}
