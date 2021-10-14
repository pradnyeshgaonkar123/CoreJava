package lab;
//Write a program to demonstrate static variables, methods, and blocks
public class LabWork4_1 {
	static int x = 10;
	static int y;
	static void add() {
		System.out.println("Addition is : "+(x+y));
	}
	static {
		System.out.println("Running static initialization block");
		y = x + 50;
	}
	public static void main(String[] args) {
		add();
	}
}
