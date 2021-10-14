package lab;

public class Fibonacci {
	int fibo(int n) {
		if(n<=1) 
			return n;
		return fibo(n-1)+fibo(n-2);
	}
	public static void main(String[] args) {
		Fibonacci f = new Fibonacci();
		int n = 5;
		System.out.println(n+"th Fibonacci series is "+f.fibo(n));
	}
}
