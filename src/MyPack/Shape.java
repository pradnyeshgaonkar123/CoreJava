package MyPack;

public class Shape {
	
	public void shapeMethod() {
		System.out.println("This from Shape class");
	}
	public static void main(String[] args) {
		Shape shape = new Shape();
		shape.shapeMethod();
	}
}
