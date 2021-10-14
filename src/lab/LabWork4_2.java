package lab;

public class LabWork4_2 {
	int roomno;
	String roomtype;
	String roomarea;
	String ACmachine;
	
	public void setData(int roomno, String roomtype, String roomarea, String ACmachine) {
		this.roomno = roomno;
		this.roomtype = roomtype;
		this.roomarea = roomarea;
		this.ACmachine = ACmachine;
	}
	public void displayData() {
		System.out.println("Room number : "+roomno);
		System.out.println("Room type : "+roomtype);
		System.out.println("Room area : "+roomarea);
		System.out.println("AC Availablity : "+ACmachine);
		System.out.println("=====================");
	}
	
	public static void main(String[] args) {
		LabWork4_2 r1 = new LabWork4_2();
		LabWork4_2 r2 = new LabWork4_2();
		r1.setData(1, "single","rural", "yes");
		r1.displayData();
		
		r2.setData(1, "double","urban", "yes");
		r2.displayData();
	}
	
}
