package in.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class FileReaderEx {
	

	public static void main(String[] args)   {

		FileReaderEx.fileCheck();
		
	}
	
	static void  fileCheck()  {

        try {
            FileReader  fileReader = new FileReader("C:/Users/gadea/OneDrive/Desktop/Rohit/Java/Rohit.txt");
			System.out.println("file Found");
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }


	 }

}
