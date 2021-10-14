package session;

import java.io.Serializable;

public class SessionTask17 implements Cloneable,Serializable{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String Speedometer;
	String FuelGauge;
	String FuelSupply;
	String DriveType;
	String Starting;
	public SessionTask17(String speedometer, String fuelGauge, String fuelSupply, String driveType, String starting) {
		Speedometer = speedometer;
		FuelGauge = fuelGauge;
		FuelSupply = fuelSupply;
		DriveType = driveType;
		Starting = starting;
	}
	
	protected Object clone() throws CloneNotSupportedException{
		return super.clone();
	}

	public String getSpeedometer() {
		return Speedometer;
	}

	public void setSpeedometer(String speedometer) {
		Speedometer = speedometer;
	}

	public String getFuelGauge() {
		return FuelGauge;
	}

	public void setFuelGauge(String fuelGauge) {
		FuelGauge = fuelGauge;
	}

	public String getFuelSupply() {
		return FuelSupply;
	}

	public void setFuelSupply(String fuelSupply) {
		FuelSupply = fuelSupply;
	}

	public String getDriveType() {
		return DriveType;
	}

	public void setDriveType(String driveType) {
		DriveType = driveType;
	}

	public String getStarting() {
		return Starting;
	}

	public void setStarting(String starting) {
		Starting = starting;
	}
	
	
//		Pulsor pulsor = new Pulsor("digital", "digital", "Fuel Injection", "Chain Drive", "self start");
//		Pulsor pulsor1 = (Pulsor) pulsor.clone();
//		Pulsor pulsor2 = (Pulsor) pulsor.clone();
//		Pulsor pulsor3 = (Pulsor) pulsor.clone();
//		Pulsor pulsor4 = (Pulsor) pulsor.clone();
//		Pulsor pulsor5 = (Pulsor) pulsor.clone();
//		System.out.println(pulsor3.DriveType);

}
