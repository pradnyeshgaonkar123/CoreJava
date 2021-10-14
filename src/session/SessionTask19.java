package session;

import java.util.*;
import java.io.*;
public class SessionTask19 {

	public static void main(String[] args) throws IOException {
		final String VALID_EMAIL_ADDRESS_REGEX = "^[A-Za-z0-9+_.-]+@(.+)$";
		final String VALID_PHONE_REGEX = "\\+\\d{2}\\-\\d{10}";
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		ArrayList<Studentss> students = new ArrayList<Studentss>();
		
		for(int i=0; i<5; i++) {
			System.out.println("Enter name : ");
			String name = br.readLine();
			System.out.println("Enter id : ");
			int id = Integer.parseInt(br.readLine());
			String mail, phone;
			while(true) {
				System.out.println("Enter email : ");
				mail = br.readLine();
				if(!mail.matches(VALID_EMAIL_ADDRESS_REGEX))	{
					System.out.println("Invalid email");
				}else {
					break;
				}
			}
			while(true) {
				System.out.println("Enter phone number : ");
				phone = br.readLine();
				if(phone.matches(VALID_PHONE_REGEX)) {
					break;
				}else {
					System.out.println("Invalid phone");
				}
			}
			
			students.add(new Studentss(id, name, phone, mail));
		}
		
		// students whose phone starts with 98
		Iterator<Studentss> itr = students.iterator();
		System.out.println("Students whose mobile number starts with 98");
		while(itr.hasNext()) {
			Studentss st = itr.next();
			if(st.mobile.startsWith("98")) {
				st.display();
			}
		}
		System.out.println();
		
		itr = students.iterator();
		System.out.println("Students whose email is gmail");
		int notGmail = 0;
		while(itr.hasNext()) {
			Studentss st = itr.next();
			if(st.email.contains("gmail")) {
				st.display();
			}
			else {
				notGmail++;
			}
		}
		
		System.out.println("Total people who does not have gmail accounts = "+notGmail);
	}

}

class Studentss{
	int id;
	String name;
	String mobile;
	String email;
	public Studentss(int id, String name, String mobile, String email) {
		super();
		this.id = id;
		this.name = name;
		this.mobile = mobile;
		this.email = email;
	}
	
	public void display() {
		System.out.println("ID : "+this.id+" Name : "+this.name+" Phone : "+this.mobile+" Email : "+this.email);
	}
}