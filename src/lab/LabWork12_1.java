package lab;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class LabWork12_1 {
	public static byte getInput()[] throws Exception 
	 { 
	 byte inp[ ] = new byte[50]; 
	 System.out.println("enter text.");  
	 for(int i=0; i<50; i++) 
	 { 
	 inp[i] = (byte)System.in.read(); 
	 } 
	 return inp; 
	 } 
	public static void main(String args[])throws Exception 
	 { 
	 byte input[] = getInput(); 
	 OutputStream f = new FileOutputStream("c:/java/temp.txt"); 
	 for(int i=0; i<50; i++) 
	 { 
	 f.write(input [i]); 
	 } 
	 f.close(); 
	 int size; 
	 @SuppressWarnings("resource")
	InputStream f1 = new FileInputStream ("c:/java/temp.txt"); 
	 size = f1.available(); 
	 System.out.println("reading contents of file temp.txt…"); 
	 for(int i=0; i<size; i++) 
	 { 
	 System.out.print((char)f1.read()); 
	 } 
	 f.close(); 
	 }
}
