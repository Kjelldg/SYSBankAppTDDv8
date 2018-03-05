package customer;

public class Customer {
	
	float accountBalance;
	double interest = 1.67;
	String firstName;
	
	
	public Customer(float accountBalance, String firstName) {
		// super();
		this.accountBalance = accountBalance;
		this.firstName = firstName;
	}


	
	
	public double getInterest() {
		return interest;
	}




	public void setInterest(double interest) {
		this.interest = interest;
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
