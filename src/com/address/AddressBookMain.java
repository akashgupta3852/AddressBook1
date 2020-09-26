package com.address;
import java.util.*;

public class AddressBookMain {
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the first name:");
		String firstName=sc.next();
		System.out.println("Enter the last name:");
		String lastName=sc.next();
		System.out.println("Enter the address:");
		sc.nextLine();
		String address=sc.nextLine();
		System.out.println("Enter the city:");
		String city=sc.nextLine();
		System.out.println("Enter the state:");
		String state=sc.nextLine();
		System.out.println("Enter the zip:");
		int zip=sc.nextInt();
		System.out.println("Enter the phoneNo:");
		long phoneNo=sc.nextLong();
		System.out.println("Enter the email:");
		String emailId=sc.next();
		
		ContactPerson personDetails=new ContactPerson(firstName,lastName,address,city,state,zip,phoneNo,emailId);
		System.out.println(personDetails);
	}

}
