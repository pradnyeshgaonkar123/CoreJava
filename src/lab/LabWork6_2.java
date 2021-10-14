package lab;

public class LabWork6_2 extends NumAddition implements NumSubtraction {
	public void sub(int a, int b) {
		System.out.println(a-b);
	}
	public static void main(String[] args) {
		LabWork6_2 obj = new LabWork6_2();
		obj.add(1,3);
		obj.sub(1,3);
	}
}

class NumAddition{
	public void add(int a, int b) {
		System.out.println(a+b);
	}
}


interface NumSubtraction{
	public void sub(int a, int b);
}