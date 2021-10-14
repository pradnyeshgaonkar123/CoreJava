package lab;

public class LabWork4_4 extends Car {
	public static void main(String[] args) {
		Car car = new Car();
		car.run();
	}
}
class Vehicle{
	void run() {
		System.out.println("vehicle is running...");
	}
}

class Car extends Vehicle{
	void run() {
		System.out.println("car is running...");
	}
}