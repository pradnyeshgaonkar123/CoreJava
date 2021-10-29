package BankingAppMainProject;


import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Scanner;

public class Registration extends MainApp{
	Scanner sc = new Scanner(System.in);
	ArrayList<User> users = new ArrayList<>();
	ArrayList<Accounts> accounts = new ArrayList<Accounts>();	
	//ArrayList<String> transactions = new ArrayList<>();
	public void registration() throws Exception {
		IOFunctions.serializeListUser(users);
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
		String accountOpenDay = now.format(format);
		DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
		String accountOpenTime = now.format(format1);
	    //int bal = accounts.stream().filter(tr->tr.accountNumber==Login.currentUser).collect(Collectors.summingInt(st -> st.balance));
		User user = new User(accountNumber, name, address, contactNumber, username, password, balance, accountOpenTime,
				accountOpenDay, initialBalance);
		users.add(user);
		accounts.add(new Accounts(accountNumber,name,initialBalance,balance,accountOpenTime, accountOpenDay));
		IOFunctions.serializeListUser(users);
		//IOFunctions.serializeListAccount(accounts);
	
		
	}

}
