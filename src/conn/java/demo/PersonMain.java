package conn.java.demo;


//Also Create “PersonMain.java” program and write code for following operations:
//a) Create an object of Person class and specify person details through constructor.
//b): Modify  to accept phone number of a person. 
//Create a new method to implement the same and also define method for displaying persondetails.
//c): Modify the above program, to accept only ‘M’ or ‘F’ as gender field values. Use Enumeration for implementing the same

public class PersonMain {
	public static void main(String[] arg) {
	Person Joe = new Person();
	Person Dave = new Person("Dave", (byte) 26, 'M', "(800)588-2300");

	Dave.PersonInfo();
	Joe.PersonInfo();
}
}
