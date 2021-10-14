package session;

import java.io.EOFException;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class PulsorDeSerialization {
	public static void main(String[] args) {
		ObjectInputStream ois = null;
		String inputFile = "Resources/pulsor.db";
		try {
			ois = new ObjectInputStream(new FileInputStream(inputFile));{
				SessionTask17 pulsor = (SessionTask17) ois.readObject();
				System.out.println("Drive Type: "+pulsor.DriveType+"\nFuel Gauge: "+pulsor.FuelGauge+"\nFuel Supply: "+pulsor.FuelSupply+"\nSpeedometer: "+pulsor.Speedometer+"\nStarting: "+pulsor.Starting);
			}
		}
		catch(EOFException e) {
			System.out.println("Its ens of the record");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		finally{
			if(ois!=null) {
				try {
					ois.close();
				}catch(IOException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
