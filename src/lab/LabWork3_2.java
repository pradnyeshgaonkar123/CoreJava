package lab;

public class LabWork3_2 {
	String message;
	
	public LabWork3_2(String msg) {
		this.message = msg;
	}
	
	public void displayMessage() {
		System.out.println(message);
	}
	public static void main(String[] args) {
		LabWork3_2 obj1 = new  LabWork3_2("First message");
		obj1.displayMessage();
	}
}
