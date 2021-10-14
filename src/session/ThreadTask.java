package session;

public class ThreadTask extends Thread {
	public static void main(String[] args) throws InterruptedException {
		Thread1 t1 = new Thread1();
		Thread2 t2 = new Thread2();

		t1.start(); //t1 is executing
		t1.join();
		System.out.println("\n======================");
		t2.start();
		t2.join();
	}

}


class Thread1 extends Thread{
	public void run() {
		String str = "Java is nice";
		char ch[]=str.toCharArray(); 
		for(int j=ch.length-1;j>=0;j--){  
			System.out.print(ch[j]); 
			try {
				Thread.sleep(2000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
		}
	}
}

class Thread2 extends Thread{
	public void run() {
		String str = "Java is nice";
		char ch[]=str.toCharArray();
		for(int j = 0 ;j<ch.length-1;j++) {
			try {
				Thread.sleep(1000);
			}
			catch(Exception e) {
				System.out.println(e);
			}
			if(j%2==0) {
			System.out.print(ch[j]);
			}
			else {
				System.out.print(' ');
			}
//			if(ch[j] == ' ') {
//				System.out.print(' ');
//			}
		}
//		for( int i=0; i< ch.length-1; i=i+2) {
//			System.out.print(ch[i]);
//			try {
//				Thread.sleep(1000);
//			}
//			catch(Exception e) {
//				System.out.println(e);
//			}
//		}
	}
}