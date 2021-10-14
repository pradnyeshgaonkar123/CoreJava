package lab;

public class LabWork9_1 extends ChildClass {
	float f = l;
	public void methodM() {
		System.out.println("Float f = "+f);
	}
	public static void main(String[] args) {
		ParentClass p = new ParentClass();
		p.methodM();
		ChildClass c = new ChildClass();
		c.methodM();
		LabWork9_1 l = new LabWork9_1();
		l.methodM();
	}
}
class ParentClass{
	public int i = 100;
	public void methodM() {
		System.out.println("Int i = "+i);
	}
}
class ChildClass extends ParentClass{
	public long l  = i;
	public void methodM() {
		System.out.println("Long l = "+l);
	}
}