
import java.text.*;
/**
 * Program: BusinessCustomer
 * Purpose: Business is a subclass of Customer and calculates the abstact method incentives() 
 * Date: 22 June 2021
 * @author Yug Shah
 */
public class BusinessCustomer extends Customer {

	DecimalFormat numFormat = new DecimalFormat("#,##0.00");
	
	private String companyName;
	private int discountRate;
	private double totalPurchases;
	

	/**
	 * 
	 * @param firstName FirstName of the Customer
	 * @param lastName Last name of the Customer
	 * @param customerLevel The type of Customer
	 * @param companyName The company name of the Customer
	 * @param discountRate The discount rate given to the Customer
	 * @param totalPurchases The total amount of purchases by Customer
	 */
	public BusinessCustomer(String firstName, String lastName, String customerLevel, String companyName, int discountRate,
			double totalPurchases) {
		super(firstName, lastName, customerLevel);
		this.companyName = companyName;
		this.discountRate = discountRate;
		this.totalPurchases = totalPurchases;
	}

	/**
	 * 
	 * @return Returns companyName
	 */
	public String getCompanyName() {
		return companyName;
	}

	/**
	 * 
	 * @return Returns discountRate
	 */
	public int getDiscountRate() {
		return discountRate;
	}

	/**
	 * 
	 * @return Returns totalPurchases
	 */
	public double getTotalPurchases() {
		return totalPurchases;
	}

	/**
	 * 
	 * @param name The company name of the Customer
	 */
	public void setCompanyName(String name) {
		this.companyName = name;
	}

	/**
	 * 
	 * @param discountRate The discount rate given to the Customer
	 */ 
	public void setDiscountRate(int discountRate) {
		this.discountRate = discountRate;
	}

	/**
	 * 
	 * @param purchases The total amount of purchases by Customer
	 */
	public void setTotalPurchases(double purchases) {
		this.totalPurchases = purchases;
	}

	/**
	 * 
	 * @return Returns the incentives() calculates as mentioned
	 */
	public double incentives() {

		return this.totalPurchases * (double) (this.discountRate / 100.00);
	}

	/**
	 * 
	 * @return Overrides toString() from Customer superclass
	 */
	@Override
	public String toString() {
		return super.toString() + "\n" + super.CustomerLevel() + " for " + this.companyName
				+ "\nTotal Purchases:      $" + numFormat.format(this.totalPurchases) + "\nDiscount Rate:        "
				+ (this.discountRate) + "%" + "\nDiscount Incentives:  $" + numFormat.format(incentives())
				+ "\nNet Purchase:         $" + numFormat.format((this.totalPurchases - incentives()));
	}
}//end class
