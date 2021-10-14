package lab;

public class LabWork10_4 {
	public static void main(String[] args) {
		int num1, num2;
		try {
			num1 = 35;
			num2 = 0;
			System.out.println(num1 +" Divided by " + num2+ " is ");
			System.out.println((num1/num2));
		} 
		catch (ArithmeticException e) {
			System.out.println("Cannot divisible by zero");
		}
		finally {
			System.out.println("Finally block will execute always");
		}
	}
}
