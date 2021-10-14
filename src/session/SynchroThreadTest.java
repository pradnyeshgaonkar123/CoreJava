package session;

import session.SharedResources.MyThread;

public class SynchroThreadTest extends Thread{
	public static void main(String[] args) {
		SharedResources thread = new SharedResources();
		MyThread thread1 =thread.new MyThread(thread, 2,5);
		thread1.start();
		MyThread thread2 =thread.new MyThread(thread, 3,7);
		thread2.start();
		
	}
}
class SharedResources{
	
	void doPrint(int a,int b) {
		synchronized (this) {
			for(int i = a;i<=(a+b);i++) {
				System.out.println(i);
				try {
					Thread.sleep(1000);
				}
				catch (InterruptedException e) {
					e.printStackTrace();
			}
		}
			
	}
			
}
class MyThread extends Thread{
	SharedResources s;
	public MyThread(SharedResources s) {
		this.s=s;
	}
	int i;
	int j;
	
	
	public MyThread(SharedResources s, int i, int j) {
		super();
		this.s = s;
		this.i = i;
		this.j = j;
	}


	public void run() {
		s.doPrint(i,j);
	}
}
}