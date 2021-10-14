package lab;

public class LabWork13_1 implements Runnable{
	Thread t; 
	LabWork13_1() 
	 { 
	 t = new Thread ( this, "Test thread"); 
	 System.out.println (" Child thread :" + t); 
	 t.start(); 
	 } 
	 public void run() 
	 { 
	 try { 
	 for (int i= 5; i<0; i--) 
	 { 
	 System.out.println ("Child thread :" + i); 
	 Thread.sleep (500); 
	 } 
	 }catch (InterruptedException e) { } 
	 System.out.println ("Exiting child thread …" ); 
	 } 
	 public static void main (String args[]) 
	 { 
		 LabWork13_1 i = new LabWork13_1(); 
	 try { 
	 for ( int j=5; j >0; j--) 
	 { 
	 System.out.println ("Main thread :" + j); 
	 Thread.sleep (1000); 
	 } 
	 } catch (InterruptedException e) { } 
	 System.out.println ( "Main thread exiting …"); 
	 }
}

