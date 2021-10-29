package BankingAppMainProject;

import java.io.Serializable;

public class User implements Serializable {
	
	private static final long serialVersionUID = 1L;
	int accountNumber=0;
	 String name;
	 String address;
	 String contactNumber;
	 String username;
	 String password;
	 int balance;
	 String currentTime;
	 String currentDay;
	 public int initialBalance;
		 




	public User(int accountNumber, String name, String address, String contact_number, String username,
			String password, int balance, String current_time, String current_day, int initial_balance) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.address = address;
		this.contactNumber = contact_number;
		this.username = username;
		this.password = password;
		this.balance = balance;
		this.currentTime = current_time;
		this.currentDay = current_day;
		this.initialBalance = initial_balance;
	}

	

	@Override
	public String toString() {
		return "User [account_number= "+accountNumber+", name=" + name + ", address=" + address + ", contact_number=" + contactNumber
				+ ", username=" + username + ", password=" + password + ", balance=" + balance + ", current_time="
				+ currentTime + ", current_day=" + currentDay + ", initial_balance=" + initialBalance + "]";
	}



	public int getAccountNumber() {
		return accountNumber;
	}



	public void setAccountNumber(int accountNumber) {
		this.accountNumber = accountNumber;
	}



	public String getName() {
		return name;
	}



	public void setName(String name) {
		this.name = name;
	}



	public String getAddress() {
		return address;
	}



	public void setAddress(String address) {
		this.address = address;
	}



	public String getContactNumber() {
		return contactNumber;
	}



	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}



	public String getUsername() {
		return username;
	}



	public void setUsername(String username) {
		this.username = username;
	}



	public String getPassword() {
		return password;
	}



	public void setPassword(String password) {
		this.password = password;
	}



	public int getBalance() {
		return balance;
	}



	public void setBalance(int balance) {
		this.balance = balance;
	}



	public String getCurrentTime() {
		return currentTime;
	}



	public void setCurrentTime(String currentTime) {
		this.currentTime = currentTime;
	}



	public String getCurrentDay() {
		return currentDay;
	}



	public void setCurrentDay(String currentDay) {
		this.currentDay = currentDay;
	}



	public int getInitialBalance() {
		return initialBalance;
	}



	public void setInitialBalance(int initialBalance) {
		this.initialBalance = initialBalance;
	}


	


}
