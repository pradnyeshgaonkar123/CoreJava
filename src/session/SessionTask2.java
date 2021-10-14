package session;

import java.util.Scanner;

public class SessionTask2 {
	int stdid;
	String name;
	String course;
	int marks;

	public SessionTask2(int stdid, String name, String course, int marks) {
		this.stdid = stdid;
		this.name = name;
		this.course = course;
		this.marks = marks;
	}

	public void showDetails() {// out method(instance behavior
		System.out.println("ID : " + stdid + "  name : " + name + "  course : " + course + "  marks : " + marks);
	}

	public static void main(String[] args)
	{
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int i = 0;
		String name;
		int id;
		String course;
		int marks;
		SessionTask2[] arry = new SessionTask2[5];
		while(i<5) {
		System.out.println("enter id:");
		id = sc.nextInt();
		System.out.println("enter name:");
		name = sc.nextLine();
		System.out.println("enter course");
		course = sc.nextLine();
		System.out.println("enter marks:");
		marks=sc.nextInt();
		System.out.println("=========================");
		arry[i] = new SessionTask2(id,name,course,marks);
		
		i++;
		}
		String test = "bca";
		for(int k=0;k<5;k++) {
			if(arry[k].course.equalsIgnoreCase(test) && arry[k].marks>60)
				arry[k].showDetails();
		}
	}
}
