
/**
 * Program: PreferredCustomer
 * Purpose: PreferredCustomer is a subclass of RetailCustomer and calculates the abstact method incentives() 
 * Date: 22 June 2021
 * @author Yug Shah
 */
public class PreferredCustomer extends RetailCustomer {

	private int cashbackRate;

	/**
	 * 
	 * @param firstName First Name of Customer
	 * @param lastName Last Name of Customer
	 * @param customerLevel The type of Customer
	 * @param totalPurchases The total amount of purchases by the Customer
	 * @param cashbackRate The percentage of cashback received by the Customer
	 */
	public PreferredCustomer(String firstName, String lastName, String customerLevel, double totalPurchases,
			int cashbackRate) {
		super(firstName, lastName, customerLevel, totalPurchases);
		this.cashbackRate = cashbackRate;

	}

	/**
	 * 
	 * @return Returns the CashbackRate
	 */
	public int getCashBackRate() {
		return cashbackRate;
	}

	/**
	 * 
	 * @param cashBack The percentage of cashback received by the Customer
	 */
	public void setCashBackRate(int cashBack) {
		this.cashbackRate = cashBack;
	}

	/**
	 * 
	 * @return Returns the incentives() calculates as per the description
	 */
	public double incentives() {
		return (super.getTotalPurchases() * (double) (super.findDiscountRate() / 100.00)
				+ (super.incentives() * (double) (this.cashbackRate / 100.00)));
	}

	/**
	 * 
	 * @return Overrides toString() method from RetailCustomer SuperClass
	 */
	@Override
	public String toString() {
		return super.toString() + "\n" + "Cashback Rate:        " + this.cashbackRate + "%";
	}

}//end class
