package com.jfranceschini.rolodex;

public class PhoneNumber {
	private int countryCode;
	private String areaCode;
	private String number;
	private PhoneNumberType phoneNumberType;
	
	public PhoneNumber(int countryCode, String areaCode, String number, PhoneNumberType phoneNumberType) {
		this.countryCode = countryCode;
		this.areaCode = areaCode;
		this.number = number;
		this.phoneNumberType = phoneNumberType;
	}
	public PhoneNumber() {
		this(0, "555", "363 2090", PhoneNumberType.HOME);
	}
	
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
	@Override
	public String toString() {
		return this.phoneNumberType.getType() + ": " + this.countryCode + " " + this.areaCode + " " + this.number;
	}
	
	
}
