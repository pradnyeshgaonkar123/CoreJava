package session;
import java.util.Scanner;

public class SessionTask1_1 {

public static void main(String args[]) {
    @SuppressWarnings("resource")
	Scanner sc = new Scanner(System.in);
   
    System.out.println("Enter number:");
    int num = sc.nextInt();
    int  reversedNum = 0, remainder;
    
    int originalNum = num;

    while (num != 0) {
      remainder = num % 10;
      reversedNum = reversedNum * 10 + remainder;
      num /= 10;
    }
    

    if (originalNum == reversedNum) {
      System.out.println(originalNum + " is Palindrome.");
    }
    else {
      System.out.println(originalNum + " is not Palindrome.");
    }
  }


}


