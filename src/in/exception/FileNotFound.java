package in.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;

public class FileNotFound {


	
	 public static void main(String args[])
	    {
	      
	            try {
					FileInputStream fis = new FileInputStream("C:/Users/gadea/OneDrive/Desktop/Rohit/Java/File.txt");
					 System.out.println("file found");
				} catch (FileNotFoundException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
	           
	      
	       
	    }
	
}
