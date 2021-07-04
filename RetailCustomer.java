
import java.text.*;
/** 
 * Program: RetailCustomer
 * Purpose: RetailCustomer is a subclass of Customer and calculates the abstract method incentives() 
 * Date: 22 June 2021
 *  @author Yug Shah
 */
public class RetailCustomer extends Customer {

	private double totalPurchases;
	DecimalFormat numFormat = new DecimalFormat("#,##0.00");

	/**
	 * 
	 * @param firstName First Name of the Customer
	 * @param lastName Last Name of the Customer
	 * @param customerLevel The type of Customer
	 * @param totalPurchases The total amount of purchases by the Customer
	 */
	public RetailCustomer(String firstName, String lastName, String customerLevel, double totalPurchases) {
		super(firstName, lastName, customerLevel);
		this.totalPurchases = totalPurchases;

	}

	/**
	 * 
	 * @return totalPurchases 
	 */
	public double getTotalPurchases() {
		return totalPurchases;
	}

	/**
	 * 
	 * @param purchases 
	 * The amount of purchases by the Customer
	 */
	public void setTotalPurchases(double purchases) {
		this.totalPurchases = purchases;
	}

	/**
	 * 
	 * @return Returns the discountRate according to the totalPurchases
	 */
	public int findDiscountRate() {
		int discRate = 0;

		if (totalPurchases > 10000) {
			return discRate = 15;
		}
		if (totalPurchases > 5000) {
			return discRate = 10;
		}
		if (totalPurchases > 1000) {
			return discRate = 5;
		}

		return discRate;
	}

	/**
	 * 
	 * @return Returns the incentives() calculates as per the description
	 */
	@Override
	public double incentives() {

		return (this.totalPurchases) * (double) (findDiscountRate() / 100.00);
	}

	/**
	 * 
	 * @return Overrides toString() method from Customer SuperClass
	 */
	@Override
	public String toString() {

		return "\n" + super.toString() + "\n" + super.CustomerLevel() + "\nTotal Purchases:      $"
				+ numFormat.format(this.totalPurchases) + "\nDiscount Rate:        " + findDiscountRate() + "%"
				+ "\nDiscount Incentives:  $" + numFormat.format(incentives()) + "\nNet Purchase:         $"
				+ numFormat.format((this.totalPurchases - incentives()));
	}
}//end class
