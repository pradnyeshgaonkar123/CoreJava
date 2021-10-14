package lab;
import MyPack.Shape;
class LabWork8_3 {
	public void circleMethod() {
		System.out.println("This is from circle class");
	}
	public static void main(String[] args) {
		LabWork8_3 circle = new LabWork8_3();
		circle.circleMethod();
		Shape shape = new Shape();
		shape.shapeMethod();
		}
}
