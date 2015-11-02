package com.jfranceschini.rolodex;

public enum GenderType {
	MALE("Mr."),
	FEMALE("Ms."),
	BLANK("");
	
	private final String title;
	
	private GenderType(String title) {
		this.title = title;
	}
	
	public String getTitle() {
		return this.title;
	}
}
