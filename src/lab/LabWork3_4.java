package lab;

public class LabWork3_4 {
	int	x;
	int	y;
	int i=1;
	public LabWork3_4(int a, int b) {
	this.x = a;
	this.y = b;
	}
	public void displayPoint() {
		System.out.println("value of x is " + x);
		System.out.println("value of y is " + y);
	}
	LabWork3_4 increment() {
		i++;
		return this;
	}
	public static void main(String arg[]) {
		LabWork3_4 point = new LabWork3_4(1,3);
		point.displayPoint();
		LabWork3_4 incremented_value= point.increment();
		System.out.println(incremented_value);
	}
}
