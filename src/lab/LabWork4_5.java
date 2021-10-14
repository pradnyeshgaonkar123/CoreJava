package lab;

public class LabWork4_5 {
	public static void main(String[] args) {
		Cat cat = new Cat();
		cat.printColor();
	}
}

class Animal{
	String color = "white";
}

class Cat extends Animal{
	String color = "black";
	void printColor() {
		System.out.println("Cat color is : "+color);
		System.out.println("Animal color is : "+super.color);
	}
}