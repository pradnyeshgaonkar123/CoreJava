package lab;
//Write a program to create interface A in this interface we have two
//method meth1 and meth2. Implements this interface in another class
//named MyClass.
public class LabWork6_1 {
	public static void main(String[] args) {
		MyClass obj = new MyClass();
		obj.meth1();
		obj.meth2();
	}
}


interface AB{
	void meth1();
	void meth2();
}
class MyClass implements AB{
	public void meth1() {
		System.out.println("implemented meth1()");
	}
	
	public void meth2() {
		System.out.println("implemented meth2()");
	}
}


