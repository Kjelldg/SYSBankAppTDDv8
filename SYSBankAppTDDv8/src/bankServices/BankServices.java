package bankServices;

public class BankServices {
	
	float balanceOut = 0;
	
		
	float checkBalance (float balanceIn) {
		
		
		balanceOut = balanceIn;
				
		return balanceOut;
	}
	
	float removeBalance (float balanceIn, float balanceToBeRemoved) {
		
		balanceOut = balanceIn - balanceToBeRemoved;
		
		
		
		return balanceOut;
	}
	
	
}
