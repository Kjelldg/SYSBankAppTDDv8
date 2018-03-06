import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Date;
import java.text.*;

import customer.Customer;

public class Main {

	public static void main(String[] args) {
		

		float balance = 100;
		Scanner scanner = new Scanner(System.in);
		int switchCaseInt = 0;
		
		Date creationYear = new Date();
		SimpleDateFormat yearFormat = 
				new SimpleDateFormat ("yyyy");
		
		System.out.println(yearFormat.format(creationYear));
		
		
		
		Customer newCustomer = new Customer(200, "Kjell");
		
		while (true) {
			
			System.out.println("Hello, welcome to your bank. What option would you like to choose?");
			
			switchCaseInt = scanner.nextInt();
			
			switch (switchCaseInt) {
			case 1: System.out.println("You have " + newCustomer.getAccountBalance() + " SEK");
				break;
			case 2: System.out.println("Test");
				break;
			case 3: System.out.println(newCustomer.getAccountBalance() + newCustomer.interestCalculationYears(newCustomer.getAccountBalance(), 4));
				break;
			}
			
			
			
			
		}
		
		

		

	}

}
