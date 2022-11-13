//3. Prompt the user to input the list of languages known separated by commas (e.g. English,Hindi,Marathi,Telegu,Gujarati)
//Display the output as follows
//	Languages Known:
//	1. English
//	2. Hindi
//	3. Marathi
//	4. Telegu
//	5. Gujarati 

package str;

import java.io.*;

public class SplitString {

	public static void main(String[] args) {
		String str = new String("English,Hindi,Marathi,Telegu,Gujarati");
		System.out.println("Languages known : ");

		for (String retval : str.split(",")) {
			System.out.println(retval);
		}
	}

}
