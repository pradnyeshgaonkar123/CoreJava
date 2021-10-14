package lab;

public class LabWork10_6 {
	public static void main(String[] args) {
		try {
			int b=5;
			if(b==5)
				throw new MyException("b should not be 5");
		}
		catch(MyException m) {
			System.out.println(m);
			System.out.println(m.getMessage());
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
		return "My Exception : "+msg;
	}
}

