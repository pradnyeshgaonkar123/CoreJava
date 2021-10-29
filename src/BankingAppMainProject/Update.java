package BankingAppMainProject;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.stream.Collectors;

public class Update extends Registration{
	public void update() throws IOException {
		users = IOFunctions.deserializeListUser();
		//accounts = IOFunctions.deserializeListsAccount();
		 for(User account: users) {
			 System.out.println("\nEnter your account number");
			 int currentUser = sc.nextInt();
			 if( currentUser == account.accountNumber) {
				 	System.out.print("Enter new account number : ");
					account.accountNumber = sc.nextInt();

					System.out.print("Enter new name : ");
					account.name = sc.next();

					System.out.print("Enter new address : ");
					account.address = sc.next();

					boolean res;
					do {
						System.out.print("Enter new contact number [+91-9********7] : ");
						account.contactNumber = sc.next();
						if (account.contactNumber.matches("\\+\\d{2}\\-\\d{10}")) {
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
					account.initialBalance = account.balance;

					LocalDateTime now = LocalDateTime.now();
					DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					account.currentTime = now.format(format);
					DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
					account.currentDay = now.format(format1);
					FileOutputStream file = new FileOutputStream("Resources/Users.db");
					ObjectOutputStream oos = new ObjectOutputStream(file);
					
					oos.writeUnshared(account);
					accounts.stream().filter(t->t.accountNumber==currentUser).collect(Collectors.summingInt(st -> st.balance));
					oos.close();
					file.close();
					accounts.add(new Accounts(account.accountNumber,account.name,account.initialBalance,account.balance,account.currentTime, account.currentDay));
					IOFunctions.serializeListUser(users);
					//IOFunctions.serializeListAccount(accounts);
			 }
		 }
	 }
}
