package lab;

public class LabWork6_3 {
	public static void main(String[] args) {
		Arithmatic obj = new Arithmatic();
		obj.square(5);
	}
}


interface Test{
	public void square(int num);
}

class Arithmatic implements Test{
	public void square(int num) {
		System.out.println("Square of "+num + " is : "+(num*num));
	}
}
