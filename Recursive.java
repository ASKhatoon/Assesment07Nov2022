package str;

public class Recursive {
		   public static void main(String args[]){
		      String str1 = "My name is safa, safa is an employee of MM safa is in technology department", str2 = "safa";
		      System.out.println("Count of occurrences of a substring "+str2+" recursively are: "+subsrting_rec(str1, str2));
		   }
		   static int subsrting_rec(String str, String sub){
		      if (str.contains(sub)){
		         return 1 + subsrting_rec(str.replaceFirst(sub, ""), sub);
		      }
		      return 0;
		   }
		}

//5. Input a string and a substring to be searched. Count the number of occurances of the substring in the given string

