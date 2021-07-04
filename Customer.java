
/**
 * Program: Customer
 * Purpose: Customer is an abstract superclass, it also had a abstract method incentives()
 * Date: 22 June 2021
 * @author Yug Shah
 */
public abstract class Customer {

	private String firstName;
	private String lastName;
	private String customerID;
	private String customerLevel;

	/**
	 * 
	 * @param firstName First Name of Customer
	 * @param lastName Last Name of Customer
	 * @param customerLevel The type of Customer
	 */
	public Customer(String firstName, String lastName, String customerLevel) {
		this.firstName = firstName;
		this.lastName = lastName;
		this.customerLevel = customerLevel;
		setCustomerID();
	}

	/**
	 * 
	 * @return Returns firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}

	/**
	 * 
	 * @return Returns lastName
	 */
	public String getLastName() {
		return this.lastName;
	}

	/**
	 * 
	 * @return Returns customerID
	 */
	public String getCustomerID() {
		return this.customerID;
	}

	/**
	 * 
	 * @return Returns customerLevel
	 */
	public String CustomerLevel() {
		return this.customerLevel;
	}

	/**
	 * 
	 * @param firstName First Name of Customer
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	/**
	 * 
	 * @param lastName Last Name of Customer
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	/**
	 * Assigns the customerID with the first 4 letter of the last name following with the 4 digit
	 * random number
	 */
	private void setCustomerID() {
		String fourCust = "";
		int randNum = (int) (10000 + Math.random() * 99999);

		if (this.lastName.length() == 1) {
			fourCust = this.lastName.toUpperCase().substring(0, 1) + "XXX";
		}
		if (this.lastName.length() == 2) {
			fourCust = this.lastName.toUpperCase().substring(0, 2) + "XX";
		}
		if (this.lastName.length() == 3) {
			fourCust = this.lastName.toUpperCase().substring(0, 3) + "X";
		}
		if (this.lastName.length() == 4 || this.lastName.length() > 4) {
			fourCust = this.lastName.toUpperCase().substring(0, 4);
		}

		this.customerID = fourCust + "-" + randNum;
	}

	/**
	 * 
	 * @param customerLevel The type of Customer
	 */
	public void setCustomerLevel(String customerLevel) {
		this.customerLevel = customerLevel;
	}

	/**
	 * 
	 * @return incentives() is a abstract method which must be 
	 * initiated in the sub-classes not in the superclass
	 */
	public abstract double incentives();

	/**
	 * 
	 * @return toString()
	 */
	public String toString() {
		return getCustomerID() + ", " + this.firstName + " " + this.lastName;
	}

}//end class