package lab;

public class LabWork8_2 {
	private double db_num;
	private long lg_num;

	public LabWork8_2(double db_num, long lg_num) {
		super();
		this.db_num = db_num;
		this.lg_num = lg_num;
	}

	public boolean isZero() {
		if (db_num == 0.0)
			return true;
		else
			return false;
	}

	public boolean isPositive() {
		if (db_num > 0.0)
			return true;
		else
			return false;
	}

	public boolean isNegative() {
		if (db_num < 0.0)
			return true;
		else
			return false;
	}

	public boolean isOdd() {
		if (db_num % 2 != 0.0)
			return true;
		else
			return false;
	}

	public boolean isEven() {
		if (db_num % 2 == 0.0)
			return true;
		else
			return false;
	}

	public boolean isPrime() {
		int num = (int) lg_num;
		boolean flag = true;
		for (int i = 2; i < num / 2; i++) {
			if (num % i == 0) {
				flag = false;
				break;
			}
		}
		if (flag)
			return true;
		else
			return false;
	}

	public boolean isAmstrong() {
		if (db_num == 0.0)
			return true;
		else
			return false;
	}

	public double getFactorial() {
		double d = 1;
		for (int i = 1; i < lg_num; i++)
			d *= i;
		return d;
	}

	public double getSqrt() {
		double d;
		d = (double) lg_num;
		d = Math.sqrt(d);
		return d;
	}

	public double getSqr() {
		double d;
		d = (double) lg_num;
		d = d * d;
		return d;
	}

	public double sumDigits() {
		double d = 0;
		while (lg_num > 9) {
			d += lg_num % 10;
			lg_num = lg_num / 10;
		}
		d += lg_num;
		return d;
	}

	public int getReverse(int num1) {
		int rev = 0;
		int num = num1;
		while (num != 0) {
			int rem = (int)num % 10;
			rev = rev * 10 + rem;
			num = num / 10;
		}
		return rev;
	}

	public String dispBinary() {
		return Long.toBinaryString(lg_num);
	}

	public static void main(String[] args) {
		double num1 = 50d;
		long num2 = 24;
		;
		LabWork8_2 num = new LabWork8_2(num1, num2);
		System.out.println("the given numbers are " + num1 + " and " + num2);
		System.out.println("isZero : " + num.isZero());
		System.out.println("isPositive : " + num.isPositive());
		System.out.println("isNegative : " + num.isNegative());
		System.out.println("isOdd : " + num.isOdd());
		System.out.println("isEven : " + num.isEven());
		System.out.println("isPrime : " + num.isPrime());
		System.out.println("isArmstrong : " + num.isAmstrong());
		System.out.println("getFactorial : " +num.getFactorial());
		System.out.println("getSqrt : " +num.getSqrt());
		System.out.println("getSqr : " + num.getSqr());
		System.out.println("sumDigits : " + num.sumDigits());
		System.out.println("getReverse : " + num.getReverse(123));
		System.out.println("getBinary : "+num.dispBinary());
	}

}
