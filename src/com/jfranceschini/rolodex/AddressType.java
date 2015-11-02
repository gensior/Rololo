package com.jfranceschini.rolodex;

/**
 * AddressType
 * 
 * This is an enum class that enumerates the types of addresses
 * that are possible in the rolodex application. Currently there
 * are only two types, Work and Home.
 * 
 * @author Jesse Franceschini
 *
 */
public enum AddressType {
	/**
	 * This populates the enum with two selections, Work and Home
	 */
	WORK ("Work"), 
	HOME ("Home");
	
	/**
	 * the type is represented as a String
	 */
	private final String type;
	
	/**
	 * Private Constructor Method
	 * 
	 * @param type a String representing the type
	 */
	private AddressType(String type) {
		this.type = type;
	}
	
	// Getter
	public String getType() {
		return this.type;
	}
}
