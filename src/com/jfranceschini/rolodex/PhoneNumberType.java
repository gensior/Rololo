package com.jfranceschini.rolodex;

public enum PhoneNumberType {
	MOBILE("Mobile"),
	HOME("Home"),
	BUSINESS("Business");
	
	private final String type;
	
	private PhoneNumberType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
