
import java.text.*;
/**
 * Program: CustomerTester
 * Purpose: CustomerTester is the driver class and test the Customer methods
 * Date: 22 June 2021
 * @author Yug Shah
 */
public class CustomerTester {
	/**
	 * 
	 * @param args Main Method
	 */
	public static void main(String[] args) {

		//Introduction to the Program
		System.out.println("Welcome to the Customer Tester!");
		System.out.println("---------------------------------------------------------------------------------------");
		System.out.println("This program will instantiate objects of the Customer heirarchy and test their methods");
		System.out.println("---------------------------------------------------------------------------------------");

		//Making a Customer type Array for the size of 3 
		Customer[] customerArray = new Customer[3];

		//Creating Customer Objects
		Customer BusinessCustomer = new BusinessCustomer("Mike", "Holmes", "Business Customer", "Home Depot", 10,
				3105.50);
		Customer RetailCustomer = new RetailCustomer("Dev", "Gelda", "Retail Customer", 11200.00);
		Customer PreferredCustomer = new PreferredCustomer("Wei", "Ping", "Preferred Customer", 6456.85, 5);

		//Filling the customerArray with the Customer Objects
		customerArray[0] = BusinessCustomer;
		customerArray[1] = RetailCustomer;
		customerArray[2] = PreferredCustomer;
		DecimalFormat numFormat = new DecimalFormat("#,##0.00");

		//Printing the toString() method for all the Customer Objects
		for (int i = 0; i < customerArray.length; ++i) 
		{
			System.out.println(customerArray[i].toString());
		}//end for

		System.out.println("");

		//Printing the Name and Incentives
		for (int i = 0; i < customerArray.length; ++i) 
		{
			System.out.println(customerArray[i].getFirstName() + " " + customerArray[i].getLastName()
					+ " earns a discount incentives of $" + numFormat.format(customerArray[i].incentives()));
		}//end for

		//Creating 3 new Objects
		BusinessCustomer BusinessCustomer2 = new BusinessCustomer("Tristan", "Lee", "Business Customer", "Starbucks",
				15, 9875.25);
		RetailCustomer RetailCustomer2 = new RetailCustomer("Carlos", "Beltran", "Retail Customer", 3100.50);
		PreferredCustomer PreferredCustomer2 = new PreferredCustomer("Arti", "Patel", "Preferred Customer", 10450.00,
				10);
		
		//Printing the toString() method
		System.out.println("\n" + BusinessCustomer2.toString());
		System.out.println(RetailCustomer2.toString());
		System.out.println(PreferredCustomer2.toString());

		//Using the setters for new information
		BusinessCustomer2.setTotalPurchases(8895.00);
		BusinessCustomer2.setDiscountRate(12);

		RetailCustomer2.setTotalPurchases(100500.00);

		PreferredCustomer2.setLastName("Patel-Ruhil");
		PreferredCustomer2.setTotalPurchases(14987.24);
		PreferredCustomer2.setCashBackRate(13);
		
		//Printing the new information with the toString() method
		System.out.println("\n" + BusinessCustomer2.toString());
		System.out.println(RetailCustomer2.toString());
		System.out.println(PreferredCustomer2.toString());

	}//end main
}//end class
