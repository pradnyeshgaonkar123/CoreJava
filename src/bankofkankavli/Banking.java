package bankofkankavli;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Banking extends Login {
	Account ac;
	Banking bank;
	List<String> a;
	
	Scanner sc = new Scanner(System.in);
	Login l = new Login();

	public void showInitialMenu() throws Exception {
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
		choiceShowInitialMenu(choice);

		// initial menu
	}

	public void choiceShowInitialMenu(int choice) throws Exception {
		switch (choice) {
		case 1:

			registration();
			showInitialMenu();
			break;

		case 2:
			login();
			if (val) {
				showMenu();
			} else {
				showInitialMenu();
			}
		case 3:
			update();
			showInitialMenu();
			break;
		case 4:
			System.out.println("exit");
			break;
		default:
			System.out.println("invalid choice");
			break;
		}

	}

	public void showMenu() throws Exception {
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
		int choice = sc.nextInt();
		choiceShowMenu(choice);
	}

	private void choiceShowMenu(int choice) throws Exception {
		switch (choice) {
		case 1:
			System.out.print("\nEnter amount : ");
			int depositAmount = sc.nextInt();

			deposit(currentUser, depositAmount);
			break;
		case 2:
			System.out.print("\nEnter payee name : ");
			String payeeName = sc.next();
			System.out.print("\nEnter amount : ");
			int amountToPayee = sc.nextInt();
			transfer(currentUser, payeeName, amountToPayee);

			break;

		case 3:
			for (Account account : accounts) {
				if (account.accountNumber == currentUser) {
					if (account.transactions.isEmpty()) {
						System.out.println("No transaction yet!");
					} else {
						if (account.transactions.size() <= 5) {
							for (int i = account.transactions.size() - 1; i >= 0; i--) {
								System.out.println(account.transactions.get(i));
							}
						} else {
							for (int i = account.transactions.size() - 1; i >= account.transactions.size() - 5; i--) {
								System.out.println(account.transactions.get(i));
							}
						}
					}
				}
			}
			this.showMenu();
			break;

		case 4:
			this.showInfo(currentUser);
			this.showMenu();
			break;
		case 5:
			showInitialMenu();
			break;
		default:
			System.out.println("invalid choice");
			break;
		}

	}

	public void deposit(int currentUser, int amount) throws Exception {
		System.out.println();
		for (Account account : accounts) {
			if (currentUser == account.accountNumber) {
				account.balance += amount;
				LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				String depositDay = now.format(format);
				DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
				String depositTime = now.format(format1);
				String s1 = " Rs. " + amount + " credited to your account. Balance - Rs. " + account.balance
						+ " as \n on " + depositDay + " at " + depositTime + ". " + " \n Initial deposit - Rs. "
						+ account.initial_balance + " as on " + account.current_day + " at " + account.current_time;
				account.transactions.add(s1 + "\n");
				this.showMenu();
			}

		}

	}

	public void transfer(int currentUser, String namePayee, int amountToPayee) throws Exception {
		boolean flag = false;
		boolean insufficientBalance = false;
		for (Account account2 : accounts) {
			if (account2.accountNumber == currentUser) {
				if (account2.balance < amountToPayee)
					insufficientBalance = true;
			}
		}
		if (insufficientBalance) {
			System.out.println("Insufficient balance");
			this.showMenu();
		} else {
			for (Account account : accounts) {
				if (account.name.equals(namePayee)) {
					account.balance += amountToPayee;
					LocalDateTime now = LocalDateTime.now();
					DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
					String currentDay = now.format(format);
					DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
					String currentTime = now.format(format1);
					String s1 = " Rs. " + amountToPayee + " credited to your account. Balance - Rs. " + account.balance
							+ " as \n on " + currentDay + " at " + currentTime + ". " + " \n Initial deposit - Rs. "
							+ account.initial_balance + " as on " + account.initial_balance + " at "
							+ account.current_time;
					account.transactions.add(s1 + "\n");
					flag = true;

				}
			}
			if (flag) {
				for (Account account1 : accounts) {
					if (currentUser == account1.accountNumber) {
						account1.balance -= amountToPayee;
						LocalDateTime now = LocalDateTime.now();
						DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
						String currentDay1 = now.format(format);
						DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
						String currentTime1 = now.format(format1);
						String s2 = " Rs. " + amountToPayee + " debited from your account. Balance - Rs. "
								+ account1.balance + " as \n on " + currentDay1 + " at " + currentTime1 + ". "
								+ " \n Initial deposit - Rs. " + account1.initial_balance + " as on "
								+ account1.current_day + " at " + account1.current_time;
						account1.transactions.add(s2 + "\n");
						this.showMenu();

					}

				}
			} else {
				System.out.println("payee does not exists");
				this.showMenu();
			}

		}
	}

	public void showInfo(int currentUser) {
		for (Account account : accounts) {
			if (account.accountNumber == currentUser) {
				System.out.println("\nAccountholder name : " + account.name);
				System.out.println("Accountholder name : " + account.address);
				System.out.println("Accountholder address : " + account.address);
				System.out.println("Account balance : " + account.balance);
			}
		}
	}
}
