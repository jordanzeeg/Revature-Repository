package conn.java.demo;

public class Person {
	private String name;
	private byte age;
	private boolean hasPassport;
	private char gender;
	private float salary;
	private boolean isWorking;
	private String phoneNumber;
	public Person() {
		name ="";
		age =0;
		hasPassport = false;
		gender = 'M';
		salary = 0.00f;
		isWorking = false;
		phoneNumber = "";
	}
	public Person(byte a, char g) {
		name ="";
		hasPassport = false;
		age = a;
		gender = g;
		salary = 0.00f;
		isWorking = false;
		phoneNumber = "";
	}
	public Person(String n, byte a, char g, String phone) {
		name =n;
		hasPassport = false;
		age = a;
		gender = g;
		phoneNumber = phone;
		salary = 0.00f;
		isWorking = false;
	}
	public String getName() {
		return name;
	}
	public byte getAge() {
		return age;
	}
	public boolean getHasPassport() {
		return hasPassport;
	}
	public char getGender() {
		return gender;
	}
	public float getSalary() {
		return salary;
	}
	public boolean getIsWorking() {
		return isWorking;
	}
	public String getPhoneNumber() {
		return phoneNumber;
	}
	public void setName(String s) {
		name = s;
	}
	public void setAge(byte a)
	{
		age = a;
	}
	public void setGender(char g) {
		switch(g) {
		case 'M':
			gender =g;
			break;
		case 'F':
			gender =g;
			break;
		default:
			System.out.println("Input not recognized, gender not set. Recommend use of either M or F");
			break;
		}
	}
	public void setSalary(float s) {
		salary = s;
	}
	public void setIsWorking(boolean w) {
		isWorking = w;
	}
	public void setPhoneNumber(String p) {
		phoneNumber = p;
	}
	public void PersonInfo() {
		System.out.println("name: " + getName());
		System.out.println("age: " + getAge());
		System.out.println("gender: " + getGender());
		System.out.println("has Passport: " + getHasPassport());
		System.out.println("salary: " + getSalary());
		System.out.println("is Working: " + getIsWorking());
		System.out.println("phone Number: " + getPhoneNumber());
		
	}
}
