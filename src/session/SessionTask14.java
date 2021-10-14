package session;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.FileReader;
import java.io.FileWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.io.File;


public class SessionTask14 {
	public static void main(String[] args) throws IOException {
		String copied = null;
		File file1 = new File("Resources/File1.txt");
		File file2 = new File("Resources/File2.txt");
		if(file1.exists()) {
		BufferedReader br1 = new BufferedReader(new FileReader(file1));
		copied = br1.readLine();
		br1.close();
		}
		else {
			System.out.println("File does not exists");
		}
		
		BufferedReader br3 = new BufferedReader(new FileReader(file2));
		String copied1 = br3.readLine();
		String test = "java";
		if(copied1.contains(test)) {
		BufferedWriter br2 = new BufferedWriter(new FileWriter(file2,true));
		br2.newLine();
		br2.write(copied);
		br2.close();
		}
		int count =0;
		
		String copied2 = br3.readLine();
		String input = copied2;
		String[] words = input.split("\\s+");
	      for (int i=0; i<words.length; i++) {
	         count++;
	      }

		if (input == null || input.isEmpty()) {
			System.out.println("Zero word copied"); 
		}
		Path path = Paths.get("Resources/File2.txt");
		int lines = (int) Files.lines(path).count();
		System.out.println("words length : "+count);
		System.out.println("No of lines : "+lines);

		br3.close();
	}
}
