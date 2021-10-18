package bankofkankavli;

import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Login extends Registration{
	 public int currentUser;
	 public boolean val = false;
	public void login() throws IOException {
		System.out.print("Enter username : ");
		String username1 = sc.next();
		System.out.print("Enter password : ");
		String password1 = sc.next();
		for (Account account : accounts) {
			if (username1.equals(account.username) && password1.equals(account.password)) {
				currentUser = account.accountNumber;
				val = true;
			}

		}
	}
	public void update() throws IOException {
		 for(Account account:accounts) {
			 System.out.println("\nEnter your account number");
			 int currentUser = sc.nextInt();
			 if( currentUser == account.accountNumber ) {
				 	System.out.print("Enter new account number : ");
					account.accountNumber = sc.nextInt();

					System.out.print("Enter new name : ");
					account.name = sc.next();

					System.out.print("Enter new address : ");
					account.address = sc.next();

					boolean res;
					do {
						System.out.print("Enter new contact number [+91-9********7] : ");
						account.contact_number = sc.next();
						if (account.contact_number.matches("\\+\\d{2}\\-\\d{10}")) {
							res = true;
						} else {
							res = false;
							System.out.println("Invalid format!");
						}
					} while (res == false);

					System.out.print("set new username : ");
					account.username = sc.next();

					String pattern;
					boolean flag = false;
					do {
						System.out.print("set new password : ");
						account.password = sc.next();
						pattern = "^(?=.*[0-9])(?=.*[a-z])(?=.*[A-Z])(?=.*[!@#&()–[{}]:;',?/*~$^+=<>]).{8,20}$";
						if (account.password.matches(pattern)) {
							flag = true;
						} else {
							flag = false;
						}
					} while (flag == false);

					System.out.print("Enter new initial deposit : ");
					account.balance = sc.nextInt();
					account.initial_balance = account.balance;

					LocalDateTime now = LocalDateTime.now();
					DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					account.current_time = now.format(format);
					DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
					account.current_day = now.format(format1);
			 }
		 }
	 }
}
