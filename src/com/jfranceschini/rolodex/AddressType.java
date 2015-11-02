package com.jfranceschini.rolodex;

public enum AddressType {
	WORK ("Work"), 
	HOME ("Home");
	
	private final String type;
	
	private AddressType(String type) {
		this.type = type;
	}
	
	public String getType() {
		return this.type;
	}
}
