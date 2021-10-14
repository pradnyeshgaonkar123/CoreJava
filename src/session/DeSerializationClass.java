package session;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.Arrays;


public class DeSerializationClass {
	static int[] salArray = new int[10];
	public static int getLargest(int[] a, int total){  
		Arrays.sort(a);  
		return a[total-1];  
		}  
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		String inputFile = "Resources/emp.db";	
		
		
		try {
			ois = new ObjectInputStream(new FileInputStream(inputFile));
			int i=0;
			while(i<5) {
				SessionTask16 employee = (SessionTask16) ois.readObject();
				if(employee.getDno() == 10) {
					System.out.print("Employee ID: "+employee.getEsal()+" Name: "+employee.getEname()+" Salary: "+employee.getEsal()+" Department No: "+employee.getDno()+"\n");
				}
				salArray[i]=employee.getEsal();
				i++;
			}
			System.out.println("Max salary: "+getLargest(salArray,salArray.length));  
		}
		catch(EOFException e) {
			System.out.println("Its ens of the record");
		
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			if(ois!=null) {
				try {
					ois.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
