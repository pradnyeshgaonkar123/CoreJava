package BankingAppMainProject;

import java.io.IOException;

public class Login extends Registration {

	static public int currentUser;
	public boolean val = false;

	public void loginMethod() throws IOException {
		System.out.print("Enter username : ");
		String username = sc.next();
		System.out.print("Enter password : ");
		String password = sc.next();
		users = IOFunctions.deserializeListUser();
		for (User ac : users) {
			if (username.equals(ac.getUsername()) && password.equals(ac.getPassword())) {
				currentUser = ac.accountNumber;
				val = true;
				System.out.println("login successful");
			}
		}
	}

}