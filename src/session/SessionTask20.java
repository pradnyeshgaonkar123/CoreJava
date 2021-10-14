package session;

import java.util.Scanner;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class SessionTask20 {
	public static void main(String[] args) {
		BankingMenu menu = new BankingMenu();
		menu.showInitialMenu();

	}
}

class BankingMenu {
	public void showInitialMenu() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("----------------");
		System.out.println("BANK OF KANKAVLI");
		System.out.println("----------------");

		System.out.println("");
		System.out.println("1. Register account.");
		System.out.println("2. Login.");
		System.out.println("3. Update accounts.");
		System.out.println("4. Exit.");
		System.out.print("Enter your choice :");
		int choice = sc.nextInt();
		Registration regi = new Registration();
		// initial menu
		switch (choice) {
		case 1:
			regi.register();
			regi.verify();
			break;

		case 2:
			regi.loginMethod();
			break;
		case 3:
			regi.update();
			regi.verify();
			break;
		case 4:
			System.exit(0);
			break;
		default:
			System.out.print("Invalid choice");
			new BankingMenu().showInitialMenu();
			break;
		}
	}

	int flag = 0;

	public void showMenu() {
		System.out.println("-------------");
		System.out.println("W E L C O M E");
		System.out.println("-------------");

		System.out.println("");
		System.out.println("1. Deposit.");
		System.out.println("2. Transfer.");
		System.out.println("3. Last 5 transactions.");
		System.out.println("4. User information.");
		System.out.println("5. Log out.");

		System.out.println("\nEnter your choice : ");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		userInformation user = new userInformation();
		Payee payee = new Payee();
		Banking bank = new Banking();

		int choice1 = sc.nextInt();

		switch (choice1) {
		case 1:
			bank.deposit();
			showMenu();
			break;
		case 2:

			if (payee.payeeInfo()) {
				flag = 1;
			}
			if (flag == 1)
				payee.transfer();
			else
				System.out.println("Payee does not exists");

			showMenu();
			break;
		case 3:
			if (Banking.count == -1) {
				System.out.println("No transaction yet!");
			} else {
				for (int i = 0; i <= 5; i++) {
					if (Banking.transaction_history[i] != null) {
						System.out.println(Banking.transaction_history[i]);
					}
				}
			}
			showMenu();
			break;
		case 4:
			user.showUserrInformation();
			showMenu();
			break;
		case 5:
			BankingMenu menu = new BankingMenu();
			menu.showInitialMenu();
			break;
		default:
			System.out.println("Invalid choice");
			showMenu();
			break;
		}
	}

}

class MyException extends Exception {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public MyException(String msg) {
		super(msg);
		this.msg = msg;
	}

	@Override
	public String toString() {
		return "Invalid password condition";
	}
}

class Registration {
	static String name;
	static String address;
	static String contact_number;
	static String username;
	static String password;
	static int balance;
	static String current_time;
	static String current_day;
	static public int initial_balance;

	public void register() {
		@SuppressWarnings("resource")
		Scanner obj = new Scanner(System.in);
		System.out.print("\nEnter name : ");
		name = obj.nextLine();

		System.out.print("Enter address : ");
		address = obj.nextLine();

		boolean res;
		do {
			System.out.print("Enter contact number [+91-7777777777] : ");
			contact_number = obj.nextLine();
			if (contact_number.matches("\\+\\d{2}\\-\\d{10}")) {
				res = true;
			} else {
				res = false;
				System.out.println("Invalid format!");
			}
		} while (res == false);

		System.out.print("set username : ");
		username = obj.nextLine();

		System.out.print("set password : ");
		password = obj.nextLine();

		System.out.print("Enter initial deposit : ");
		balance = obj.nextInt();
		initial_balance = balance;
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		current_day = now.format(format);
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		current_time = now.format(format1);

	}

	public boolean verify() {
		boolean flag = false;
		try {

			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			String pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
			if (password.matches(pattern)) {
				new BankingMenu().showInitialMenu();
				flag = true;

			} else if (password.matches(pattern) != true) {
				System.out.println("Set again : ");
				password = sc.nextLine();
				if (password.matches(pattern)) {
					new BankingMenu().showInitialMenu();
					flag = true;
				} else {
					System.out.println("WARNING!!!");
					System.out.println("Please close the app and start again..");

				}
			} else {
				throw new MyException("Invalid password conditionn");
			}
		} catch (MyException e) {
			System.out.println(e.getMessage());
		}
		return flag;

	}

	public void loginMethod() {
		String flag = "not success";

		try {
			if(username == null && password == null) {
				System.out.println("First register your account!");
				register();
			}
			else {
			do {
				@SuppressWarnings("resource")
				Scanner sc = new Scanner(System.in);
				System.out.print("\nEnter username : ");
				String userName = sc.nextLine();

				System.out.print("Enter password : ");
				String passWord = sc.nextLine();

				if (userName.equals(username) && passWord.equals(password)) {
					flag = "success";
					BankingMenu menu = new BankingMenu();
					menu.showMenu();
				} else {
					flag = "not success";
					System.out.println("Invalid credentials");
				}
			} while (flag != "success");
			}
		} catch (Exception e) {
			System.out.println(e);
		}
		

	}

	public void update() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter new name : ");
		name = sc.nextLine();

		System.out.print("Enter new address :  ");
		address = sc.nextLine();

		System.out.print("Enter new contact_numcer : ");
		contact_number = sc.nextLine();

		System.out.print("Set new username : ");
		username = sc.nextLine();

		System.out.print("Set new password : ");
		password = sc.nextLine();
	}

}

class userInformation extends Registration {
	public void showUserrInformation() {
		System.out.println("\nAccountholder name : " + name);
		System.out.println("Accountholder address : " + address);
		System.out.println("Accountholder contact : " + contact_number);

	}
}

class Banking extends userInformation {
	static int deposit;
	static int[] depositArray = new int[50];
	static String formatDateTime;
	static String time;
	static String[] formatDateTimeArray = new String[5];
	static String[] timeArray = new String[5];
	static int[] balanceArray = new int[20];
	static int transaction_counter = 0;
	static String[] transaction_history = new String[50];
	static int count = -1;

	public void deposit() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount");
		deposit = sc.nextInt();
		depositArray[transaction_counter] = deposit;
		balance = balance + deposit;
		// count for counting transaction history
		count++;
		balanceArray[transaction_counter] = balance;
		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		formatDateTimeArray[transaction_counter] = now.format(format);

		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		timeArray[transaction_counter] = now.format(format1);

		System.out.println();
		transaction_counter++;
//		
//		try {
//            Thread.sleep(1000);
//        }
//
//        catch (InterruptedException e) {
//
//            e.printStackTrace();
//        }

//	public void showTransaction() {
		for (int i = 0; i < transaction_counter; i++) {
			transaction_history[count] = " Rs. " + depositArray[i] + " credited to your account. Balance - Rs. "
					+ balanceArray[i] + " as \n on " + timeArray[i] + " at " + formatDateTimeArray[i] + ". \n"
					+ " Initial deposit - Rs. " + initial_balance + " as on " + current_day + " at " + current_time;

		}
	}
}

class Payee extends Banking {
	static String payeename;
	static boolean user_exists = false;
	static int debit_transaction_counter = 0;

	public boolean payeeInfo() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("\nEnter payee username : ");
		payeename = sc.nextLine();
		user_exists = true;
		return true;
	}

	static int amount_to_payee;
	static int[] amount_to_payeeArray = new int[20];
	static int remaining_amount;

	public void transfer() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter amount : ");
		amount_to_payee = sc.nextInt();
		amount_to_payeeArray[debit_transaction_counter] = amount_to_payee;
		if (amount_to_payee > balance) {
			System.out.println("Insufficient balance! ");
		} else {
			balance = balance - amount_to_payee;
			count++;
			balanceArray[debit_transaction_counter] = balance;
			debit_transaction_counter++;
		}

//	public void showDebitTransaction() {
		for (int i = 0; i < debit_transaction_counter; i++) {
			LocalDateTime now = LocalDateTime.now();
			DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
			String current_day1 = now.format(format);
			DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
			String current_time1 = now.format(format1);
//			if (transaction_counter != 0) {
			transaction_history[count] = " Rs. " + amount_to_payeeArray[i]
					+ " debited from your account. Balance - Rs. " + balanceArray[i] + " as \n on " + current_time1
					+ " at " + current_day1 + ". " + " \n Initial deposit - Rs. " + initial_balance + " as on "
					+ current_day + " at " + current_time;
//			} else {
//				System.out.println("Rs. " + amount_to_payeeArray[i] + " debited from your account. Balance - Rs. "
//						+ balanceArray[i] + " as on " + current_day1 + " at " + current_time1 + ".");
//				System.out.println(
//						" Initial deposit - Rs. " + initial_balance + " as on " + current_day + " at " + current_time);
//			}
//			try {
//	            Thread.sleep(1000);
//	        }
//	        catch (InterruptedException e) {
//	            e.printStackTrace();
//	        }
		}

	}
}
