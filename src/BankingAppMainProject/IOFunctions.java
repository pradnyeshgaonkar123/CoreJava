package BankingAppMainProject;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class IOFunctions {
	static void serializeListUser(List<User> accounts) throws IOException {
		FileOutputStream file = new FileOutputStream("Resources/Users.db");
		ObjectOutputStream oos = new ObjectOutputStream(file);
		oos.writeUnshared(accounts);

		oos.close();
		file.close();
	}

	@SuppressWarnings("unchecked")
	static ArrayList<User> deserializeListUser() throws IOException {
		FileInputStream file = new FileInputStream("Resources/Users.db");
		ObjectInputStream ois = new ObjectInputStream(file);

		try {
			return (ArrayList<User>) ois.readUnshared();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} finally {
			ois.close();
		}
		return null;
	}

	static void serializeListTransaction(@SuppressWarnings("rawtypes") HashMap<Integer, List> map) throws IOException {
		FileOutputStream file = new FileOutputStream("Resources/transactions.db");
		ObjectOutputStream oos = new ObjectOutputStream(file);
		oos.writeUnshared(map);

		oos.close();
		file.close();
	}

	@SuppressWarnings({ "unchecked", "rawtypes" })
	static HashMap<Integer, List> deserializeListsTransactions() throws IOException {
		FileInputStream file = new FileInputStream("Resources/transactions.db");
		ObjectInputStream ois = new ObjectInputStream(file);

		try {
			return (HashMap<Integer, List>) ois.readUnshared();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} finally {
			ois.close();
		}
		return null;
	}
	
	static void serializeListAccount(ArrayList<Accounts> ac) throws IOException {
		FileOutputStream file = new FileOutputStream("Resources/account.db");
		ObjectOutputStream oos = new ObjectOutputStream(file);
		oos.writeObject(ac);

		oos.close();
		file.close();
	}

	@SuppressWarnings({ "unchecked" })
	static ArrayList<Accounts> deserializeListsAccount() throws IOException {
		FileInputStream file = new FileInputStream("Resources/account.db");
		ObjectInputStream ois = new ObjectInputStream(file);

		try {
			return (ArrayList<Accounts>) ois.readObject();
		} catch (ClassNotFoundException | IOException e) {
			e.printStackTrace();
		} finally {
			ois.close();
		}
		return null;
	}
}
