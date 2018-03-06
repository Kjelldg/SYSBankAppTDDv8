package customer;
import java.util.Date;
import java.text.*;

public class Customer {
	
	float accountBalance;
	
	double interestPercent = 1.67;
	Date creationYear = new Date();
	SimpleDateFormat yearFormat = 
			new SimpleDateFormat ("yyyy.MM.dd");
	
	String firstName;
	
	
	public Customer(float accountBalance, String firstName) {
		// super();
		this.accountBalance = accountBalance;
		this.firstName = firstName;
	}
	
	public double interestCalculationYears (double accountBalance) {
		double interestCalculation = 0;
		interestCalculation = accountBalance * interestPercent;
		
		
		
		return interestCalculation;
	}


	
	
	public double getInterestPercent() {
		return interestPercent;
	}




	public void setInterestPercent(double interestPercent) {
		this.interestPercent = interestPercent;
	}




	public float getAccountBalance() {
		return accountBalance;
	}


	public void setAccountBalance(float accountBalance) {
		this.accountBalance = accountBalance;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	
	
}
