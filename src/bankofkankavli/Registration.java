package bankofkankavli;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration {
	Scanner sc = new Scanner(System.in);

	ArrayList<Account> accounts = new ArrayList<Account>();
 public void registration() throws Exception {
	 System.out.print("Enter account number : ");
		int accountNumber = sc.nextInt();

		System.out.print("Enter name : ");
		String name = sc.next();

		System.out.print("Enter address : ");
		String address = sc.next();

		boolean res;
		String contactNumber;
		do {
			System.out.print("Enter contact number [+91-9********7] : ");
			contactNumber = sc.next();
			if (contactNumber.matches("\\+\\d{2}\\-\\d{10}")) {
				res = true;
			} else {
				res = false;
				System.out.println("Invalid format!");
			}
		} while (res == false);

		System.out.print("set username : ");
		String username = sc.next();

		String password;
		String pattern;
		boolean flag = false;
		do {
			System.out.print("set password : ");
			password = sc.next();
			pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
			if (password.matches(pattern)) {
				flag = true;
			} else {
				flag = false;
			}
		} while (flag == false);

		System.out.print("Enter initial deposit : ");
		int balance = sc.nextInt();
		int initialBalance = balance;

		LocalDateTime now = LocalDateTime.now();
		DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
		String currentDay = now.format(format);
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		String currentTime = now.format(format1);

		Account ac = new Account(accountNumber, name, address, contactNumber, username, password, balance, currentTime,
				currentDay, initialBalance);
		accounts.add(ac);

 }
 
}

