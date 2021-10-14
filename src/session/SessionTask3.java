package session;

public class SessionTask3 {
	public static void main(String[] args) {
		Project pr1 = new Project(1, "Mobile App for Project management", "Pune");
		Project pr2 = new Project(2, "E-Commerce Web App", "Pune");
		Employee emp1 = new Employee(1, "Ram", 30000, pr1);
		Employee emp2 = new Employee(2, "Yash", 20000, pr1);
		Employee emp3 = new Employee(3, "Kush", 10000, pr2);
		Employee emp4 = new Employee(4, "Lav", 26000, pr2);
		
		for(Employee em : new Employee[] {emp1, emp2, emp3, emp4}) {
			if(em.project.pname == "E-Commerce Web App" && em.esal>25000) {
				System.out.println(em);
			}
		}
	}
	

}
class Employee{
	int eid;
	String ename;
	int esal;
	Project project;
	public Employee(int eid, String ename, int esal, Project project) {
		this.eid = eid;
		this.ename = ename;
		this.esal = esal;
		this.project = project;
	}
	@Override
	public String toString() {
		return "Employee [eid=" + eid + ", ename=" + ename + ", esal=" + esal + ", project=" + project + "]";
	}
	
	
}

class Project{
	int pid;
	String pname;
	String plocation;
	public Project(int pid, String pname, String plocation) {
		this.pid = pid;
		this.pname = pname;
		this.plocation = plocation;
	}
	@Override
	public String toString() {
		return "Project [pid=" + pid + ", pname=" + pname + ", plocation=" + plocation + "]";
	}
	
	
}
