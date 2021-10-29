package BankingAppMainProject;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;



public class Accounts {
	int accountNumber;
	String name;
	 int initial_balance;
	 int balance;
	 String currentTime;
	 String currentDay;
	
	
	List<String> transactions= new ArrayList<String>();
	@SuppressWarnings("rawtypes")
	HashMap<Integer, List> map = new HashMap<Integer,List>();
	public Accounts(int accountNumber, String name, int initial_balance, int balance,String currentTime, String currentDay) {
		this.accountNumber = accountNumber;
		this.name = name;
		this.initial_balance = initial_balance;
		this.balance = balance;
		this.currentTime = currentTime;
		this.currentDay = currentDay;
	}

	@Override
	public String toString() {
		return "Transactions [accountNumber=" + accountNumber + ", name=" + name + ", initial_balance="
				+ initial_balance + ", balance=" + balance + "]";
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

	public int getInitial_balance() {
		return initial_balance;
	}

	public void setInitial_balance(int initial_balance) {
		this.initial_balance = initial_balance;
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

	public List<String> getTransactions() {
		return transactions;
	}

	public void setTransactions(List<String> transactions) {
		this.transactions = transactions;
	}

	@SuppressWarnings("rawtypes")
	public HashMap<Integer, List> getMap() {
		return map;
	}

	public void setMap(@SuppressWarnings("rawtypes") HashMap<Integer, List> map) {
		this.map = map;
	}

	
	
	
	
}
