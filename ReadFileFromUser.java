package Assignments;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.util.Scanner;

public class ReadFileFromUser {

	public static void main(String[] args) {

		 String file, line, content="";
	      Scanner scan = new Scanner(System.in);
	      
	      System.out.print("Enter the Name of File: ");
	      file = scan.nextLine();
	      
	      try
	      {
	         FileReader fr = new FileReader(file);
	         BufferedReader br = new BufferedReader(fr);
	         
	         for(line=br.readLine(); line!=null; line=br.readLine())
	             content = content + line + "\n";
	          br.close();
	          System.out.println(br);
	          
	          FileWriter fw = new FileWriter(file, true);
	            fw.write(content);
	            fw.close();
	            System.out.println("\n File exist");
	            
	            System.out.println("Length of the file is : "+file.length());
	            
	            String fileType = file.toString();
	            int index = fileType.lastIndexOf('.');
	            if(index > 0) {
	            	String extension = fileType.substring(index + 1);
	            	System.out.println("File Type is : "+extension);
	            }
//	            boolean bool = Files.isReadable(file);
//	            if(bool) {
//	               System.out.println("readable");
//	            } else {
//	               System.out.println("not readable");
//	            }
//	            bool = Files.isWritable(file);
//	            if(bool) {
//	               System.out.println("writable");
//	            } else {
//	               System.out.println("not writable");
//	            }
	      }
	          catch (IOException ioe)
	         {
	             System.out.println("\nSomething went wrong!");
	             System.out.println("Exception: " +ioe);
	          }
	      
	}
	}



