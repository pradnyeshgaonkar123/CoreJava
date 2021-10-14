package lab;

public class LabWork6_4 {
	public void display() {
		System.out.println("Display() from outer class");
	}
	class Inner{
		public void display() {
			System.out.println("Display() from inner class");
		}
	}
	public static void main(String[] args) {
		LabWork6_4 outer = new LabWork6_4();
		outer.display();
		Inner inner = outer.new Inner();
		inner.display();
	}
}
