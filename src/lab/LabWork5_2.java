package lab;

public class LabWork5_2 {
	public static void main(String args[]) {
		Bike obj = new Honda2();
		obj.run();
	}
}

abstract class Bike {
	abstract void run();
}

class Honda2 extends Bike {
	void run() {
		System.out.println("running safely");
	}

}