package bankofkankavli;

import java.util.ArrayList;

public class Account  {
	int accountNumber=0;
	 String name;
	 String address;
	 String contact_number;
	 String username;
	 String password;
	 int balance;
	 String current_time;
	 String current_day;
	 public int initial_balance;
	 ArrayList<Account> accounts = new ArrayList<Account>();
	 ArrayList<String> transactions= new ArrayList<String>();
	 
	 
	



	public Account(int accountNumber, String name, String address, String contact_number, String username,
			String password, int balance, String current_time, String current_day, int initial_balance) {
		super();
		this.accountNumber = accountNumber;
		this.name = name;
		this.address = address;
		this.contact_number = contact_number;
		this.username = username;
		this.password = password;
		this.balance = balance;
		this.current_time = current_time;
		this.current_day = current_day;
		this.initial_balance = initial_balance;
	}






	@Override
	public String toString() {
		return "Account [account_number= "+accountNumber+", name=" + name + ", address=" + address + ", contact_number=" + contact_number
				+ ", username=" + username + ", password=" + password + ", balance=" + balance + ", current_time="
				+ current_time + ", current_day=" + current_day + ", initial_balance=" + initial_balance + "]";
	}
	
	
	
}
