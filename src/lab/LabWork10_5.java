package lab;

import java.io.FileWriter;
import java.io.IOException;

public class LabWork10_5 {
	public static void main(String[] args) throws IOException  {
		FileWriter file = new FileWriter("../COREJAVA/Resources/sample.txt");
		file.write("pradnyesh");
		file.close();
	}
}
