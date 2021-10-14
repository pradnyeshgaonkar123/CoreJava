package lab;
//Write a program for reuse class. For this program use the above ‘room
//class’ program
public class House {
	LabWork4_2 r;
	void createHouse() {
		r = new LabWork4_2();
	}
	void setHouse(){
		r.setData(1, "single","rural", "yes");
	}
	void displayHouse() {
		r.displayData();
	}
	public static void main(String[] args) {
		House h = new House();
		h.createHouse();
		h.setHouse();
		h.displayHouse();
	}
}
