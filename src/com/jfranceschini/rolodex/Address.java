package com.jfranceschini.rolodex;

/**
 * Address Class
 * 
 * This class stores an address. It also uses the enum class AddressType 
 * to store what type of address this object represents (work or home).
 * 
 * @author Jesse Franceschini
 *
 */
public class Address {
	/**
	 * line1 is a String that stores the first line of the address
	 */
	private String line1;
	/**
	 * line2 is a String that stores the second line of the address
	 */
	private String line2;
	/**
	 * city is a String that stores the city of the address
	 */
	private String city;
	/**
	 * state is a String that stores the state of the address
	 */
	private String state;
	/**
	 * zipCode is an int that stores the zipcode of the address
	 */
	private int zipCode;
	/**
	 * addressType is an enum of AddressType that selects which kind of address it is
	 */
	private AddressType addressType;
	
	/**
	 * Default constructor
	 * 
	 * This is the preferred method of creating an address
	 * 
	 * @param line1 a String of the first line of the address
	 * @param line2 a String of the second line of the address
	 * @param city a String of the city of the address
	 * @param state a String of the state of the address
	 * @param zipCode an int of the zipcode of the address
	 * @param addressType an enum of AddressType that stores what kind of address this is
	 */
	public Address(String line1, String line2, String city, String state, int zipCode, AddressType addressType) {
		this.line1 = line1;
		this.line2 = line2;
		this.city = city;
		this.state = state;
		this.zipCode = zipCode;
		this.addressType = addressType;
	}
	/**
	 * Alternate Constructor
	 * 
	 * Passing in no parameters allows the argument defaults to be used.
	 * They are as follows:
	 * 
	 * line1 "112 Allen Drive"
	 * line2 ""
	 * city "Seattle"
	 * state "WA"
	 * zipCode 98111
	 * addressType AddressType.HOME
	 * 
	 */
	public Address() {
		this("112 Allen Drive", "", "Seattle", "WA", 98111, AddressType.HOME);
	}
	
	// Getters / Setters
	public String getLine1() {
		return line1;
	}
	public void setLine1(String line1) {
		this.line1 = line1;
	}
	public String getLine2() {
		return line2;
	}
	public void setLine2(String line2) {
		this.line2 = line2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getZipCode() {
		return zipCode;
	}
	public void setZipCode(int zipCode) {
		this.zipCode = zipCode;
	}
	public AddressType getAddressType() {
		return addressType;
	}
	public void setAddressType(AddressType addressType) {
		this.addressType = addressType;
	}

	/**
	 * Main method
	 * 
	 * This method allows tests to be run within the class
	 * @param args an array of Strings passed from the command line
	 */
	public static void main(String[] args) {
		Address defaultAddress = new Address();
		System.out.println(defaultAddress.getAddressType().getType());
	}
	
	/**
	 * HashCode Override
	 * 
	 * This method is used to generate a hash code of the object, using the following fields:
	 * 
	 * line1
	 * line2
	 * city
	 * state
	 * zipCode
	 * addressType
	 * 
	 */
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((addressType == null) ? 0 : addressType.hashCode());
		result = prime * result + ((city == null) ? 0 : city.hashCode());
		result = prime * result + ((line1 == null) ? 0 : line1.hashCode());
		result = prime * result + ((line2 == null) ? 0 : line2.hashCode());
		result = prime * result + ((state == null) ? 0 : state.hashCode());
		result = prime * result + zipCode;
		return result;
	}
	
	/**
	 * Equals Override
	 * 
	 * This method is used to test equality between two Address Objects
	 * 
	 * It will return true if the memory location is the same, the object
	 * type is the same, and line1, line2, city, state, zipCode, and
	 * addressType are all the same values.
	 * 
	 * @param obj the Object to be compared to
	 */
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		if (addressType != other.addressType)
			return false;
		if (city == null) {
			if (other.city != null)
				return false;
		} else if (!city.equals(other.city))
			return false;
		if (line1 == null) {
			if (other.line1 != null)
				return false;
		} else if (!line1.equals(other.line1))
			return false;
		if (line2 == null) {
			if (other.line2 != null)
				return false;
		} else if (!line2.equals(other.line2))
			return false;
		if (state == null) {
			if (other.state != null)
				return false;
		} else if (!state.equals(other.state))
			return false;
		if (zipCode != other.zipCode)
			return false;
		return true;
	}
	
	/**
	 * toString Override
	 * 
	 * This method formats the toString output to display the address
	 * attributes on their own lines.
	 * 
	 */
	@Override
	public String toString() {
		return this.addressType.getType() + 
			"\nline1: " + this.line1 +
			"\nline2: " + this.line2 +
			"\ncity: " + this.city +
			"\nstate: " + this.state +
			"\nzipcode: " + this.zipCode;
	}
}
