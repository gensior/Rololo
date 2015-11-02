package com.jfranceschini.rolodex;

/**
 * Contact Information Class
 * 
 * This class stores contact information in the rolodex. It makes use of the
 * Address, PhoneNumber, and GenderType classes.
 * 
 * The firstName and lastName attributes are immutable.
 * The title attribute is derived from the title associated with the
 * GenderType selection.
 * 
 * @author Jesse Franceschini
 *
 */
public class ContactInformation {
	/**
	 * String of the first name of the contact
	 */
	private String firstName;
	/**
	 * String of the last name of the contact
	 */
	private String lastName;
	/**
	 * Address instance to store the address of the contact
	 */
	private Address address;
	/**
	 * PhoneNumber instance to store the phone number of the contact
	 */
	private PhoneNumber phoneNumber;
	/**
	 * GenderType enum selection to store the gender of the contact
	 */
	private GenderType gender;
	/**
	 * String of the title of the contact, derived from the GenderType
	 */
	private String title;
	
	/**
	 * isRelated Static Method
	 * 
	 * Static method used to determine if two contacts are related to each other
	 * based on if their last names are equal.
	 * 
	 * @param contact1 the first ContactInformation object to compare
	 * @param contact2 the second ContactInformation object to compare
	 * @return a boolean of true if the contacts are related, false if they are not
	 */
	public static boolean isRelated(ContactInformation contact1, ContactInformation contact2) {
		return (contact1.getLastName().equals(contact2.getLastName()));
	}
	/**
	 * isRoomates Static Method
	 * 
	 * Static method used to determine if two contacts are roommates based on
	 * if their addresses are equal. Makes use of the custom equals method in
	 * the address class.
	 * 
	 * @param contact1 the first ContactInformation object to compare
	 * @param contact2 the second ContactInformation object to compare
	 * @return a boolean of true if the contacts are roommates, false if they are not
	 */
	public static boolean isRoomates(ContactInformation contact1, ContactInformation contact2) {
		return (contact1.getAddress().equals(contact2.getAddress()));
	}
	
	/**
	 * Constructor Method
	 * 
	 * This is the preferred method of creating a ContactInformation instance.
	 * 
	 * @param firstName a String of the contact's first name
	 * @param lastName a String of the contact's last name
	 * @param address an Address object of the contact's address
	 * @param phoneNumber a PhoneNumber object of the contact's phone number
	 * @param gender a GenderType selection of the contact's gender
	 */
	public ContactInformation(String firstName, String lastName, Address address, PhoneNumber phoneNumber, GenderType gender) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.address = address;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.title = gender.getTitle();
	}
	/**
	 * Alternate Constructor Method
	 * 
	 * This method allows default values to be pased to the default constructor.
	 * The default values are as follows:
	 * 
	 * firstName "Randy"
	 * lastName "Snuffleupagus"
	 * address new Address()
	 * phoneNumber new PhoneNumber()
	 * gender GenderType.BLANK
	 */
	public ContactInformation() {
		this("Randy", "Snuffleupagus", new Address(), new PhoneNumber(), GenderType.BLANK);
	}

	// Getters / Setters
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
	
	/**
	 * toString Override
	 * 
	 * This allows the attributes in ContactInformation to be displayed
	 * on their own lines.
	 */
	@Override
	public String toString() {
		return "Contact Information:" + 
				"\nFirst Name: " + this.firstName +
				"\nLast Name: " + this.lastName + 
				"\nAddress: " + this.address.toString() +
				"\nPhone: " + this.phoneNumber.toString();
	}
}
