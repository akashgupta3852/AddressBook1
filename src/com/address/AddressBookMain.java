package com.address;

public class AddressBookMain {

	private String firstName, lastName, address, city, state;
	private int zip, phoneNo;
	private String emailId;
	
	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public int getZip() {
		return zip;
	}

	public int getPhoneNo() {
		return phoneNo;
	}

	public String getEmailId() {
		return emailId;
	}

	public AddressBookMain(String firstName, String lastName, String address, String city, String state, int zip,
			int phoneNo, String emailId) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNo = phoneNo;
		this.emailId = emailId;
	}
	
	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program");
	}

}
