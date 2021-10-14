package session;

public class SessionTask4 {
	public static void main(String[] args) {
		Circle circle = new Circle(10);
		circle.area();
		circle.draw();
		System.out.println("====================");
		Triangle triangle = new Triangle(5, 10);
		triangle.area();
		triangle.draw();
		System.out.println("====================");
		Square square = new Square(10);
		square.area();
		square.draw();
		
	}
	
	

}
class Circle{
	int radius;
	final double pi = 3.14;
	public Circle(int radius) {
		super();
		this.radius = radius;
	}
	public void area() {
		System.out.println("Area of a Circle is : "+(pi*radius*radius));
	}
	public void draw() {
		System.out.println("Circle with radius : "+radius );
		
	}
}


class Triangle{
	double base;
	double height;
	
	public Triangle(double base, double height) {
		super();
		this.base = base;
		this.height = height;
	}
	public void area() {
		System.out.println("Area of a Triangle is : "+(0.5*base*height));
	}
	public void draw() {
		System.out.println("Triangle with Base : "+base + " and Height : "+height );
	}
}

class Square{
	double side;
	
	
	public Square(double side) {
		super();
		this.side = side;
	}
	public void area() {
		System.out.println("Area of a Square is : "+(side*side));
	}
	public void draw() {
		System.out.println("Square with side : "+side );
	}
}

