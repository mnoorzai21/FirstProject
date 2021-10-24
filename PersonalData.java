import java.util.Scanner;

public class PersonalData {

	public static void main(String[] args) {
		
		Scanner scnr = new Scanner(System.in);
		
		System.out.println("What is your first name?");
		String name = scnr.nextLine();
		System.out.println("What is your last name?");
		String lastName = scnr.nextLine();
		
		System.out.println("Hi " + name +" "+ lastName + " Welcome to Java programing.");
		
		System.out.println("How old are you?");
		int age = scnr.nextInt();
		System.out.println("You are " + age + " years old.");
		 
		System.out.println("How much money would you linke to make a year as a developer?");
		double salary = scnr.nextDouble();
		
		System.out.println("I wish you get $" + salary + " per year.\nAnd have a wonderful day.");
		
	}

}
