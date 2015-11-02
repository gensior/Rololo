package com.jfranceschini.rolodex;

/**
 * GenderType
 * 
 * This is an enum class that enumerates the types of genders
 * that are possible in the rolodex application. Currently there
 * are only three types, Male, Female, and Blank.
 * 
 * GenderTypes also have an associated String called title which
 * represents the title that gender typically has (Males - "Mr.",
 * Females - "Ms.", Blank - "").
 * 
 * @author Jesse Franceschini
 *
 */
public enum GenderType {
	/**
	 * This populates the enum with three choices, MALE, FEMALE, and BLANK.
	 */
	MALE("Mr."),
	FEMALE("Ms."),
	BLANK("");
	
	/**
	 * String of the title associated with the gender
	 */
	private final String title;
	
	/**
	 * Private Constructor Method
	 * 
	 * @param title a String of the title
	 */
	private GenderType(String title) {
		this.title = title;
	}
	
	// Getter
	public String getTitle() {
		return this.title;
	}
}
