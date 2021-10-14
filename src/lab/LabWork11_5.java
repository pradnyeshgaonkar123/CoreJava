package lab;

import java.lang.reflect.Method;
import java.lang.reflect.Modifier;

public class LabWork11_5 {
	 public static void main(String a[])throws ClassNotFoundException 
	 { 
	 @SuppressWarnings("rawtypes")
	 Class c = Class.forName("Lang"); 
	 Method m[] = c.getDeclaredMethods(); 
	 for(int i =0; i < m.length; i++) 
	 { 
	 int mo = m[i].getModifiers(); 
	 if (Modifier.isPublic(mo)) 
	 System.out.println(m[i].getName()); 
	 } 
	 } 
}
