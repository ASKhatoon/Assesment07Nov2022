//18
//Assign and print the roll number, phone number and address of two students having
//names "Sam" and "John" respectively by creating two objects of class 'Student'.


package str;

public class Students {
	String roll_No;
	String Name;
	String address;

	public Students(String roll_No , String Name, String address) {
		this.roll_No = roll_No;
		this.Name = Name;
		this.address = address;
	}

	public static void main(String[] args) {
		Students stdData[] = new Students[3];
		stdData[0] = new Students("Sno", "Name","Address");
		stdData[1] = new Students("001", "Sam","USA");
		stdData[2] = new Students("002", "Jhon","UK");
		

		for (Students std : stdData) {
			System.out.print(std.roll_No+"    ");
			System.out.print(std.Name+"    ");
			System.out.println(std.address+"    ");
		}
	}
}

	