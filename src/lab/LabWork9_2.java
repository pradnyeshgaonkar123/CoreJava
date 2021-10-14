package lab;

public class LabWork9_2 extends Box{
	int height;

	public LabWork9_2(int length, int breadth, int height) {
		super(length, breadth);
		this.height = height;
	}
	public int volume() {
		return (super.area()*height);
	}
	public static void main(String[] args) {
		LabWork9_2 b = new LabWork9_2(10,20, 30);
		System.out.println("Area of Box is : "+b.area());
		System.out.println("Volume of Box3D is : "+b.volume());	
	}
	
}


class Box{
	int length;
	int breadth;
	public Box(int length, int breadth) {
		super();
		this.length = length;
		this.breadth = breadth;
	}
	public int area() {
		return (length * breadth);
	}
	
}