package lab;

public class LabWork14_2 extends Thread {
	 
	 String tname; 
	 Thread t; 
	 
	 LabWork14_2(String s) 
	 { 
	 tname = s; 
	 t = new Thread(this, s); 
	 System.out.println ("New thread :" + t); 
	 t.start(); 
	 } 
	 public void run() 
	 { 
	 try 
	 { 
	 for(int i = 5; i > 0; i--) 
	 { 
	 System.out.println (tname + ":" + i ); 
	 Thread.sleep (500) ; 
	 } 
	 } catch (InterruptedException e) { } 
	 System.out.println(tname + "exiting…."); 
	 } 
	 } 
	class ThreadMethod2 
	 { 
	 public static void main(String args[]) 
	 { 
		 LabWork14_2 m1 =new LabWork14_2("one"); 
		 LabWork14_2 m2 = new LabWork14_2 ("two"); 
	 System.out.println("Thread m1 is alive :" + m1.t.isAlive()); 
	 System.out.println ("Thread m2 is alive:" + m1.t.isAlive()); 
	 try { 
	 System.out.println ("Waiting for thread to finish …."); 
	 m1.t.join(); 
	 m2.t.join(); 
	 } catch (InterruptedException e) { } 
	 System.out.println(" Thread m1 is alive :" + m1.t.isAlive()); 
	 System.out.println(" Thread m2 is alive :" + m2.t.isAlive()); 
	 System.out.println (" Main thread exiting …"); 
	 }
}
