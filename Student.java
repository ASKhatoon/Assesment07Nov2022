//17
//Create a class named 'Student' with String variable 'name' and integer variable 'roll_no'.
//Assign the value of roll_no as '2'and that of name as "John" by creating an object of 
//the class Student.



package str;

public class Student {
	private String rollNo;
   private 	String Name;
	
   Student(String rno, String Nm){
	   rollNo = rno;
	   Name = Nm ;  
   }
   public static void main(String []args) {
	   
	   Student std = new Student("2","Jhon");
	   
	   System.out.println("Student Roll_No : "+std.rollNo);
	   System.out.println("Student Name : "+std.Name);
   }
}