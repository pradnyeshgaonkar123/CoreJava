package session;

import java.util.Scanner;

public class SessionTask13 {
	int stdid;
	String stname;
	SubjectNames subject;
	int marks;
	public SessionTask13(int stdid, String stname, SubjectNames subject, int marks) {
		super();
		this.stdid = stdid;
		this.stname = stname;
		this.subject = subject;
		this.marks = marks;
	}




	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		SessionTask13 obj1 = new SessionTask13(1, "ram", SubjectNames.valueOf("JAVA"), 100);
		SessionTask13 obj2 = new SessionTask13(2, "shyam", SubjectNames.valueOf("CPP"), 88);
		SessionTask13 obj3 = new SessionTask13(3, "lav", SubjectNames.valueOf("C"), 99);
		SessionTask13 obj4 = new SessionTask13(4, "kush", SubjectNames.valueOf("PYTHON"), 98);
		SessionTask13 obj5 = new SessionTask13(5, "yashh", SubjectNames.valueOf("JAVA"), 98);
		System.out.println("Enter subject:");
		String sub = sc.nextLine();
		SessionTask13[] names = {obj1, obj2, obj3, obj4,obj5};
		for(SessionTask13 value: names ) {
			if(value.subject.toString().equalsIgnoreCase(sub)) {
				System.out.println(value.stname);
			}
		}
		

	}
	
}
