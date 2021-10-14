package lab;

public class LabWork8_1 {
	private int x;
	private int y;
	public LabWork8_1() {
		System.out.println("This is from Point costructor");
	}
	public LabWork8_1(int x, int y) {
		this.x = x;
		this.y = y;
	}
	public void setX(int x_value) {
		this.x = x_value;
	}
	public void getX() {
		System.out.println("Value of x is : "+x);
	}
	public void setY(int y_value) {
		this.y = y_value;
	}
	public void getY() {
		System.out.println("Value of y is : "+y);
	}
	public void setXY(int x_value, int y_value){
		this.x = x_value;
		this.y = y_value;
	}
	public void addition() {
		System.out.println("Addition is : "+(x+y));
	}
	public static void main(String[] args) {
		new LabWork8_1();
		LabWork8_1 p2 = new LabWork8_1(5,7);
		p2.setX(3);
		p2.getX();
		p2.setY(8);
		p2.getY();
		p2.setXY(10, 20);
		p2.addition();
	}
	
}
