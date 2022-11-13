package Assignments;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FileCopy 
{
   public static void main(String[] args) throws IOException 
   {
//	  
      File fsrc=new File("C:\\training\\source.txt");         //File Descriptor for source file
      
      File fdes=new File("C:\\training\\target.txt");        //File Descriptor for destination file
      
      FileReader fr=new FileReader(fsrc);          //Creation of file reader object 
      
      BufferedReader br=new BufferedReader(fr);  //Creation of buffer reader object
      
      FileWriter fw= new FileWriter(fdes);      //Creation of file writer object 
      
      String s="Iam Safa";
     
      while((s=br.readLine())!=null)             //Copying Content to the new file
      {
         fw.write(s);
         fw.write("\n");
         fw.flush();
      }
      System.out.println(" Copied Successfully");
         fw.close();
   }

}
