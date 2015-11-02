package com.jfranceschini;

import java.util.ArrayList;
import java.util.List;

import com.jfranceschini.rolodex.Address;
import com.jfranceschini.rolodex.AddressType;
import com.jfranceschini.rolodex.ContactInformation;
import com.jfranceschini.rolodex.GenderType;
import com.jfranceschini.rolodex.PhoneNumber;
import com.jfranceschini.rolodex.PhoneNumberType;

/**
 * RoloDexDriver
 * 
 * Makes use of the Address
 * @author abacus
 *
 */
public class RoloDexDriver {
	public static void main(String[] args) {
		// Construct Address
	    Address address1 = new Address();
	    Address frontStreetAddress = new Address("78 Front Street", "Blue House on the corner", "Houston", "Texas", 39321, AddressType.HOME);
	    Address westernAve = new Address("892 Western Ave", "", "Vancouver", "WA", 38382, AddressType.HOME);
	    Address collegeAve = new Address("892 College Ave", "", "State College", "CO", 88372, AddressType.WORK);

	    // Construct phone numbers
	    PhoneNumber phoneNumber = new PhoneNumber();
	    PhoneNumber jasonBusinessPhone = new PhoneNumber(3, "206", "333 6323", PhoneNumberType.BUSINESS);
	    PhoneNumber billMobilePHone = new PhoneNumber(8, "610", "982 1563", PhoneNumberType.MOBILE);
	    PhoneNumber susanHomePhone = new PhoneNumber(990, "", "9823 1563", PhoneNumberType.HOME);

	    ContactInformation firstEntry = new ContactInformation();

	    // Test defaults
	    System.out.println("++++ TEST DEFAULTS ++++");
	    System.out.println(firstEntry.toString() + "\n");
	    System.out.println(address1.toString() + "\n");
	    System.out.println(phoneNumber.toString() + "\n");

	    ContactInformation jasonBourne = new ContactInformation("Jason", "Bourne", frontStreetAddress,
	        jasonBusinessPhone, GenderType.BLANK);
	    ContactInformation williamWallace = new ContactInformation("Bill", "Wallace", westernAve, billMobilePHone, GenderType.MALE);
	    ContactInformation susanActress = new ContactInformation("Susan", "Surandon", collegeAve,
	        susanHomePhone, GenderType.FEMALE);

	    List<ContactInformation> contacts = new ArrayList<>();
	    contacts.add(jasonBourne);
	    contacts.add(williamWallace);
	    contacts.add(susanActress);

	    // Go through list of contacts
	    for (ContactInformation contactInformation : contacts) {
	      System.out.println(contactInformation.toString());
	      System.out.println("\n");
	    }

	    // BONUS SECTION
	    // Test Relation
	    System.out.println("Relation Test");
	    ContactInformation sallyBourne = new ContactInformation("Sally", "Bourne", frontStreetAddress,
	        jasonBusinessPhone, GenderType.BLANK);
	    if (ContactInformation.isRelated(jasonBourne, williamWallace)) {
	      System.out.println("Surely you must be kidding");
	    } else {
	      System.out.println("No relation.");
	    }
	    if (ContactInformation.isRelated(jasonBourne, sallyBourne)) {
	      System.out.println("They are brother and sister.");
	    }
	    // Test Roommates
	    System.out.println("Roommate test");
	    ContactInformation scubaSteve = new ContactInformation("Scuba", "Steve", address1, phoneNumber, GenderType.MALE);
	    // Passing the roommate test
	    if (ContactInformation.isRoomates(firstEntry,  scubaSteve)) {
	    	System.out.println("They are roommates.");
	    } else {
	    	System.out.println("If you're seeing this, something is wrong.");
	    }
	    // failing the roommate test
	    if (!ContactInformation.isRoomates(jasonBourne,  williamWallace)) {
	    	System.out.println("They are not roommates.");
	    }
	    
	    // ADD CODE HERE TO TEST isRoomates method
	    System.out.println("End Ouput");
	    
	    /* If you would like to add more tests enter them here */
	}
}
