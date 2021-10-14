package lab;

public class LabWork4_3 extends B {
	public static void main(String[] args) {
		LabWork4_3 obj = new LabWork4_3();
		obj.showA();
		obj.showB();
	}
}
class A{
	public void showA() {
		System.out.println("This is from class A");
	}
}

class B extends A{
	public void showB() {
		System.out.println("This is from class B");
	}
}