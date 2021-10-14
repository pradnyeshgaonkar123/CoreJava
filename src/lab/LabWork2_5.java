package lab;

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
		System.out.println("================");
		String k = "1", l = " ", s = "1"; 
		 int m = 0; 
		 int n = 5; 
		 for (int i = 0; i < n; i++) 
		 { 
		 for (int j = 1; j < m; j++) 
		 { 
			 if(j==1) {
				 s+="";
			 }
		l+= "0"; 
		 } 
		 System.out.println (k + l + s ); 
		 l = ""; 
		 m += 2; 
		 }
		
	}
}
