package lab;

import java.io.IOException;

public class LabWork11_4 {
	public static void main(String[] args)
    {
        try
        {
            // Command to create an external process
            String command = "C:\\Program Files\\"+
                 "\\Google\\Chrome\\Application\\chrome.exe";
  
            // Running the above command
            Runtime run  = Runtime.getRuntime();
            @SuppressWarnings("unused")
			Process proc = run.exec(command);
        }
  
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
