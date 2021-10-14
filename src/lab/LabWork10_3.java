package lab;

public class LabWork10_3 extends Super {
	void show() {
		System.out.println("Child class");
	}
	public static void main(String[] args) {
		try{
			Super s = new LabWork10_3();
			s.show();
		}
		catch(Exception e) {
			
		}
	}
}
class Super{
	void show() throws Exception{
		System.out.println("Parent class");
	}
}