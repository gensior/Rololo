package com.jfranceschini.rolodex;

/**
 * PhoneNumberType
 * 
 * This is an enum class that enumerates the types of phone numbers
 * that are possible in the rolodex application. Currently there
 * are only three types, Mobile, Home, and Busines.
 * 
 * @author Jesse Franceschini
 *
 */
public enum PhoneNumberType {
	/**
	 * This populates the enum with three choices, MOBILE, HOME, and BUSINESS.
	 */
	MOBILE("Mobile"),
	HOME("Home"),
	BUSINESS("Business");
	
	/**
	 * String of the phone number type
	 */
	private final String type;
	
	/**
	 * Private Constructor Method
	 * 
	 * @param type a String of the type
	 */
	private PhoneNumberType(String type) {
		this.type = type;
	}
	
	// Getter
	public String getType() {
		return this.type;
	}
}
