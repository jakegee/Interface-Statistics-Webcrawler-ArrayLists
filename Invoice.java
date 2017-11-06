/**
 * @author Jacob Smith
 * A program to get an invoice amount, linked with an interface
 */
public class Invoice implements Measurable { // Includes the interface Measurable for getMeasure

	private String accountNumber;
	private String sortCode;
	private double amount;
	
	public Invoice(String accountNumber, String sortCode, double amount) { // Constructor
		this.accountNumber = accountNumber;
		this.sortCode = sortCode;
		this.amount = amount;
		
	}

	private double getAmount() { // getter for amount
		return amount;
	}
	
	@Override
	public String toString() { // simple toString used from the source
		return "Invoice [accountNumber=" + accountNumber + ", sortCode=" + sortCode + ", amount=" + amount + "]";
	}

	@Override
	public double getMeasure() { // Links back to the interface 
		return getAmount(); // return statement for the amount
	}
}
