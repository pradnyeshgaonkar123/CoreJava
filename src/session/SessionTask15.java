package session;
import java.io.*;
import java.util.Scanner;

public class SessionTask15 {
	public static String[] copied_email_address;
	public static void main(String[]  email_address)throws IOException {
		@SuppressWarnings({ "unused", "resource" })
		Scanner sc = new Scanner(System.in);
		File file1 = new File("Resources/emails.txt");
		File file2 = new File("Resources/domain.txt");
		//System.out.println("Enter email addresses:");
		BufferedWriter br1 = new BufferedWriter(new FileWriter(file1));
		
		int j = 0;
		String regex = "^(.+)@(.+)$";
		while(j<5) {
			if(email_address[j].matches(regex)) {
				br1.write(email_address[j]);
				br1.newLine();
			}
			j++;
		}
		
		br1.close();
		copied_email_address = new String[5];
		BufferedWriter br2 = new BufferedWriter(new FileWriter(file2));
		BufferedReader br3 = new BufferedReader(new FileReader(file1));
		String line;
		int i = 0;
		while((line=br3.readLine())!=null) {
			copied_email_address[i] = line;
			i++;
		}
		int k=0;
		try {
		while(k<5) {
//			String domain = email_address[k] .substring(email_address[k] .indexOf("@") + 1);
			String[] temp;
			String delimiter = "@";
			if(copied_email_address[k]!=null) {
				temp= copied_email_address[k].split(delimiter);
				br2.write(temp[1]);
			}
			
			k++;
			br2.newLine();
			}
		}
		catch(Exception e) {
			System.out.println(e);
		}
		br2.close();
		br3.close();
	

		
		
	}
}
