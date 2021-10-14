package session;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.List;

public class SerializationClass {

	public static void main(String[] args) {
		List<SessionTask16> employees = new ArrayList<SessionTask16>();
		ObjectOutputStream oos = null;
		String outputFile = "Resources/emp.db";		
		try {
			oos = new ObjectOutputStream(new FileOutputStream(outputFile));
			employees.add(new SessionTask16(1,"Pradnyesh",20000,1));
			employees.add(new SessionTask16(2,"Yash",10000,10));
			employees.add(new SessionTask16(3,"Ramesh",30000,13));
			employees.add(new SessionTask16(4,"Yogesh",15000,11));
			employees.add(new SessionTask16(5,"Vedesh",5000,13));
			
			for(SessionTask16 employee: employees) {
				oos.writeObject(employee);
			}
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			if(oos!=null) {
				try {
					oos.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
