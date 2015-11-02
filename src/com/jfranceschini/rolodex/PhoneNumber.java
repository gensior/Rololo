package com.jfranceschini.rolodex;

/**
 * Phone Number Class
 * 
 * This class stores information about a phone number
 * 
 * @author Jesse Franceschini
 *
 */
public class PhoneNumber {
	/**
	 * An int of the country code in the phone number
	 */
	private int countryCode;
	/**
	 * A String of the area code in the phone number
	 */
	private String areaCode;
	/**
	 * A String of the number in the phone number
	 */
	private String number;
	/**
	 * A PhoneNumberType enum of the type of phone number this object represents
	 */
	private PhoneNumberType phoneNumberType;
	
	/**
	 * Constructor Method
	 * 
	 * This is the preferred way of constructing a phone number
	 * 
	 * @param countryCode an int of the country code
	 * @param areaCode a String of the area code
	 * @param number a String of the number
	 * @param phoneNumberType a PhoneNumbeType enum selection of the type of phone number
	 */
	public PhoneNumber(int countryCode, String areaCode, String number, PhoneNumberType phoneNumberType) {
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.number = number;
		this.phoneNumberType = phoneNumberType;
	}
	/**
	 * Alternate Constructor Method
	 * 
	 * Usage of this method results in the defaults being used:
	 * 
	 * countryCode 0
	 * areaCode "555"
	 * number "363 2090"
	 * phoneNumberType PhoneNumberType.HOME
	 * 
	 */
	public PhoneNumber() {
		this(0, "555", "363 2090", PhoneNumberType.HOME);
	}
	
	// Getters / Setters
	public int getCountryCode() {
		return countryCode;
	}
	public void setCountryCode(int countryCode) {
		this.countryCode = countryCode;
	}
	public String getAreaCode() {
		return areaCode;
	}
	public void setAreaCode(String areaCode) {
		this.areaCode = areaCode;
	}
	public String getNumber() {
		return number;
	}
	public void setNumber(String number) {
		this.number = number;
	}
	public PhoneNumberType getPhoneNumberType() {
		return phoneNumberType;
	}
	public void setPhoneNumberType(PhoneNumberType phoneNumberType) {
		this.phoneNumberType = phoneNumberType;
	}
	
	/**
	 * Main method used for testing the class
	 * 
	 * @param args array of Strings passed from the command line
	 */
	public static void main(String[] args) {
		PhoneNumber phoneNumber = new PhoneNumber();
	    System.out.println(phoneNumber.toString());
		PhoneNumber jasonBusinessPhone = new PhoneNumber(3, "206", "333 6323", PhoneNumberType.BUSINESS);
	    System.out.println(jasonBusinessPhone.toString());
	    PhoneNumber billMobilePhone = new PhoneNumber(8, "610", "982 1563", PhoneNumberType.MOBILE);
	    System.out.println(billMobilePhone.toString());
	    PhoneNumber susanHomePhone = new PhoneNumber(990, "", "9823 1563", PhoneNumberType.HOME);
	    System.out.println(susanHomePhone.toString());
	}
	
	/**
	 * toString Override
	 * 
	 * Allows the phone number attributes to be printed out on one line
	 */
	@Override
	public String toString() {
		return this.phoneNumberType.getType() + ": " + this.countryCode + " " + this.areaCode + " " + this.number;
	}
	
	
}
