package com.jfranceschini.rolodex;

public class ContactInformation {
	private String firstName;
	private String lastName;
	private Address address;
	private PhoneNumber phoneNumber;
	private GenderType gender;
	private String title;
	
	public static boolean isRelated(ContactInformation contact1, ContactInformation contact2) {
		return (contact1.getLastName().equals(contact2.getLastName()));
	}
	public static boolean isRoomates(ContactInformation contact1, ContactInformation contact2) {
		return (contact1.getAddress().equals(contact2.getAddress()));
	}
	
	public ContactInformation(String firstName, String lastName, Address address, PhoneNumber phoneNumber, GenderType gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.title = gender.getTitle();
	}
	public ContactInformation() {
		this("Randy", "Snuffleupagus", new Address(), new PhoneNumber(), GenderType.BLANK);
	}

	public Address getAddress() {
		return address;
	}
	public void setAddress(Address address) {
		this.address = address;
	}
	public PhoneNumber getPhoneNumber() {
		return phoneNumber;
	}
	public void setPhoneNumber(PhoneNumber phoneNumber) {
		this.phoneNumber = phoneNumber;
	}
	public GenderType getGender() {
		return gender;
	}
	public void setGender(GenderType gender) {
		this.gender = gender;
	}
	public String getFirstName() {
		return firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public String getTitle() {
		return title;
	}
	
	@Override
	public String toString() {
		return "Contact Information:" + 
				"\nFirst Name: " + this.firstName +
				"\nLast Name: " + this.lastName + 
				"\nAddress: " + this.address.toString() +
				"\nPhone: " + this.phoneNumber.toString();
	}
}
