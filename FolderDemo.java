package Assignments;

import java.io.File;
import java.io.IOException;

public class FolderDemo {

	public static void main(String[] args) throws IOException {
		
		File f1 = new File("C:\\MyFolder");
		File f2 = new File("C:\\MyFolder\\test.txt");

		
		f1.mkdir();
		f2.createNewFile();
	
	}
}		
		