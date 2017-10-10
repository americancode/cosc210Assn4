/**
 * COSC 210-001 Assignment 4
 * Customer.java
 * 
 * This class represents a customer with the associated
 * contact information
 * 
 * @author Nathaniel Churchill
 *
 */
public class Customer {
	//attributes
	private String name;
	private String address;
	private String city;
	private String state;
	private String zip;
	private String phoneNumber;
	
	//constructor
	public Customer(String name, String address, String city, String state, 
			String zip, String phoneNumber) {
		super();
		this.name = name;
		this.address = address;
		this.city = city;
		this.state = state;
		this.zip = zip;
		this.phoneNumber = phoneNumber;
	}
	
	//getters
	public String getName() {
		return name;
	}

	public String getAddress() {
		return address;
	}

	public String getCity() {
		return city;
	}

	public String getState() {
		return state;
	}

	public String getZip() {
		return zip;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}
}
