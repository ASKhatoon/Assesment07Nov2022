//25.Write a program that would print the information (name, year of joining, salary, address)
//of three employees by creating a class named 'Employee'. The output should be as follows:
//Name        Year of joining        Address
//Robert            1994                64C- WallsStreat
//Sam                2000                68D- WallsStreat
//John                1999                26B- WallsStreat



package str;

import java.io.IOException;

public class Employee {
	String name;
	String yearOfJoining;
	String address;

	public Employee(String name , String yearOfJoining, String address) {
		this.name= name;
		this.yearOfJoining=yearOfJoining;
		this.address=address;
		
	}

public static void main(String args[]) throws IOException {
		Employee empData[] = new Employee[5];
		empData[0] = new Employee("Name","Year Of Joining","Address");
		empData[1] = new Employee("Robert","1994","64C- WallsStreat");
		empData[2] = new Employee("Sam","2000","68D- WallsStreat");
		empData[3] = new Employee("Jhon","1999"," 26B- WallsStreat");
		

		for (Employee emp : empData) {
			System.out.print(emp.name+"               ");
			System.out.print(emp.yearOfJoining+"                        ");
			System.out.println(emp.address);
		}
	}
}

