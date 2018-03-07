package bankServices;
import customer.Customer;

public class BankServices {
	
	private float balanceOut = 0;
	private Customer bankCustomer;
	
	
	
	
		
	public BankServices(float balanceOut, Customer bankCustomer) {
		// super();
		this.balanceOut = balanceOut;
		this.bankCustomer = bankCustomer;
	}

	float checkBalance (float balanceIn) {	
		
		balanceOut = balanceIn;
				
		return balanceOut;
	}
	
	float removeBalance (float balanceIn, float balanceToBeRemoved) {
		
		balanceOut = balanceIn - balanceToBeRemoved;
		
		
		
		return balanceOut;
	}

	public float getBalanceOut() {
		return balanceOut;
	}

	public void setBalanceOut(float balanceOut) {
		this.balanceOut = balanceOut;
	}

	public Customer getBankCustomer() {
		return bankCustomer;
	}

	public void setBankCustomer(Customer bankCustomer) {
		this.bankCustomer = bankCustomer;
	}
	
	
	
	
	
}
