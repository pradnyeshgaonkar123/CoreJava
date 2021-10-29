package BankingAppMainProject;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.HashMap;
import java.util.List;
import java.util.Scanner;

import java.util.stream.Collectors;



public class Banking extends Login{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
	//ArrayList<String> transactions= new ArrayList<String>();
	boolean insufficientBalance = false;
	boolean flag;
	public void showInitialMenu() throws Exception{
		System.out.println("----------------");
		System.out.println("BANK OF KANKAVLI");
		System.out.println("----------------");

		System.out.println("");
		System.out.println("1. Register account.");
		System.out.println("2. Login.");
		System.out.println("3. Update accounts.");
		System.out.println("4. Exit.");
		System.out.print("Enter your choice :");
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		int choice = sc.nextInt();
		choiceShowInitialMenu(choice);
	 	}

		
		public void choiceShowInitialMenu(int choice) throws Exception {
		
		switch(choice) {
		case 1:
			registration();
			showInitialMenu();
			break;

		case 2:
			loginMethod();
			if (val) {
				showMenu();
			} 
			else {
				System.out.println("Invalid credentials");
				showInitialMenu();
			}
			break;
		case 3:
			new Update().update();
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
	public void choiceShowMenu(int choice) throws Exception {
		switch (choice) {
		case 1:
			System.out.print("\nEnter amount : ");
			int depositAmount = sc.nextInt();
			//accounts = deserializeList();
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
			@SuppressWarnings("rawtypes") HashMap<Integer, List> map = IOFunctions.deserializeListsTransactions();
			map.entrySet().stream().filter( e -> e.getKey() == currentUser).forEach(f->{
				if(f.getKey().equals(null))
					System.out.println("No Transactions yet");
				else
					System.out.println(f.getValue());
			});;
		
			
//			for (User account : Main) {
//				if (account.accountNumber == currentUser) {
//					if (account.transactions.isEmpty()) {
//						System.out.println("No transaction yet!");
//					} else {
//						if (account.transactions.size() <= 5) {
//							for (int i = account.transactions.size() - 1; i >= 0; i--) {
//								System.out.println(account.transactions.get(i));
//							}
//						} else {
//							for (int i = account.transactions.size() - 1; i >= account.transactions.size() - 5; i--) {
//								System.out.println(account.transactions.get(i));
//							}
//						}
//					}
//				}
//			}
			this.showMenu();
			break;
		case 4:
			showInfo(currentUser);
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
		
		//accounts = deserializeList();
		accounts.forEach(ac-> {
			if (currentUser == ac.accountNumber) {
				ac.balance += amount;
				LocalDateTime now = LocalDateTime.now();
				DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
				String depositDay = now.format(format);
				DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
				String depositTime = now.format(format1);
				String s1 = " Rs. " + amount + " credited to your account. Balance - Rs. " + ac.balance
						+ " as \n on " + depositDay + " at " + depositTime + ". " + " \n Initial deposit - Rs. "
						+ ac.initial_balance + " as on " + ac.currentDay + " at "+ ac.currentTime;
				ac.transactions.add(s1 + "\n");
				ac.map.put(currentUser,ac.transactions);
				try {
					IOFunctions.serializeListTransaction(ac.map);
					this.showMenu();
				} catch (Exception e) {
					e.printStackTrace();
				}
				
				
			}
		});

	}


	public void transfer(int currentUser, String namePayee, int amountToPayee) throws Exception {
		boolean flag = false;
		accounts.stream().filter(ob -> ob.accountNumber == currentUser).forEach(i ->{
			if(i.balance < amountToPayee)
				insufficientBalance = true;
		});
		if (insufficientBalance) {
			System.out.println("Insufficient balance");
			this.showMenu();
		} else {
			for (Accounts ac : accounts) {
				if(ac.name.equals(namePayee)){
					ac.balance += amountToPayee;
					LocalDateTime now = LocalDateTime.now();
					String currentDay = now.format(DateTimeFormatter.ofPattern("dd-MM-yyyy"));
					String currentTime = now.format(DateTimeFormatter.ofPattern("HH:mm:ss"));
					String s1 = " Rs. " + amountToPayee + " credited to your account. Balance - Rs. " + ac.balance
							+ " as \n on " + currentDay + " at " + currentTime + ". " + " \n Initial deposit - Rs. "
							+ ac.initial_balance + " as on " + ac.currentDay + " at "
							+ ac.currentTime;
					ac.transactions.add(s1+ "\n");
					flag = true;
					ac.map.put(currentUser,ac.transactions);
					
						IOFunctions.serializeListTransaction(ac.map);
				}
				}
			if (flag) {
				
				for (Accounts account1 : accounts) {
					if (currentUser == account1.accountNumber) {
						account1.balance -= amountToPayee;
						LocalDateTime now = LocalDateTime.now();
						DateTimeFormatter format = DateTimeFormatter.ofPattern("dd-MM-yyyy");
						String currentDay1 = now.format(format);
						DateTimeFormatter format1 = DateTimeFormatter.ofPattern("HH:mm:ss");
						String currentTime1 = now.format(format1);
						String s2 = " Rs. " + amountToPayee + " debited from your account. Balance - Rs. "
								+ account1.balance + " as \n on " + currentDay1 + " at " + currentTime1 + ". "
								+ " \n Initial deposit - Rs. " + account1.initial_balance + " as on " +account1.currentDay+" on "+ account1.currentDay;
						account1.transactions.add(s2+ "\n");
						account1.map.put(currentUser,account1.transactions);
						IOFunctions.serializeListTransaction(account1.map);
//						IOFunctions.serializeListTransaction(account1.transactions);
						this.showMenu();

					}

				}
			} else {
				System.out.println("payee does not exists");
				this.showMenu();
			}

		}
	}
	public void showInfo(Integer currentUser) throws IOException {
		users = IOFunctions.deserializeListUser();
		int balance = accounts.stream().filter(tr->tr.accountNumber==currentUser).collect(Collectors.summingInt(st -> st.balance));
		users.forEach(ac -> {
			if(currentUser.equals(ac.getAccountNumber())) {
				System.out.println("\nAccountholder name   : " + ac.getName());
				System.out.println("Accountholder address : "+ac.getAddress());
				System.out.println("Accountholder contact : "+ac.getContactNumber());
				System.out.println("Accountholder balance : " + balance);

			}
			else {
				System.out.println("not found");
		}
		});
	}
}
