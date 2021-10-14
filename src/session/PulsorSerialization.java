package session;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;


public class PulsorSerialization {
	public static void main(String[] args) {
		ObjectOutputStream oos = null;
		String outputFile = "Resources/pulsor.db";
		try {
			oos =  new ObjectOutputStream(new FileOutputStream(outputFile));
			SessionTask17 pulsor = new SessionTask17("digital", "digital", "Fuel Injection", "Chain Drive", "self start");
			SessionTask17 pulsors1 = (SessionTask17) pulsor.clone();
			SessionTask17 pulsors2 = (SessionTask17) pulsor.clone();
			SessionTask17 pulsors3 = (SessionTask17) pulsor.clone();
			SessionTask17 pulsors4 = (SessionTask17) pulsor.clone();
			SessionTask17 pulsors5 = (SessionTask17) pulsor.clone();
			oos.writeObject(pulsors1);
			oos.writeObject(pulsors2);
			oos.writeObject(pulsors3);
			oos.writeObject(pulsors4);
			oos.writeObject(pulsors5);
		}
		
		catch (Exception e) {
			e.printStackTrace();
		}
		finally {
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
