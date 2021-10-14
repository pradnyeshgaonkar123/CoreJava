package session;

public class SessionTask5 {
	private int acc_balance;
	public  int amount;
	public int balance;
	
	public SessionTask5(int acc_balance) {
		super();
		this.acc_balance = acc_balance;
	}

	public void withdraw(int amt) {
		amount = amt;
		try {
//			System.out.println("Enter amount: ");
//			amount = sc.nextInt();
			if(amount>acc_balance)
				throw new WithDrawException("Insufficient amount");
			else 
				System.out.println("Fine");
				acc_balance =acc_balance -amount;
		}
		catch(WithDrawException e) {
			System.out.println(e);
		}
	}
	
	public void showBalance() {
		System.out.println("balance : "+acc_balance);
	}
	
	
	public static void main(String[] args) {
		SessionTask5 ac = new SessionTask5(25000);//initial balance set
		ac.withdraw(30000); 		//handle exception --> Insufficient balance
	    ac.withdraw(20000); 		//fine
	    ac.showBalance();		//Balance: 5000
		ac.withdraw(10000); 		//handle exception --> Insufficient balance
		ac.showBalance();	
	
	}
}

class WithDrawException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String msg;

	public WithDrawException(String msg) {
		super();
		this.msg = msg;
	}
	public String toString() {	
		return msg;
	}
	
}