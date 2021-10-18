package lab;

import java.io.File;

public class LabWork11_1 {
	public static void main(String[] args) {
		File file = new File("d:\\SAMPLE", "abc.txt");
		System.out.println("file name : "+file.getName());
		System.out.println("   path :" + file.getPath());
		System.out.println("Absolute path :" + file.getAbsolutePath());
		System.out.println(file.exists()?"file exists":"file does not exists");
		System.out.println(file.isFile()? "file is an ordinary file" 
				 : "file may be a named pipe") ;
		System.out.println(file.isDirectory() ? "file is a directory" 
				 :"file is not a directory");
	}
}
