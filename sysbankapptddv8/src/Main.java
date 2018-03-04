import java.util.Scanner;

import customer.Customer;

public class Main {

	public static void main(String[] args) {
		
		String gitTest = "Det funkade!";
		String gitTest_eclipse = "Det funkade!";
		String gitTest_eclipse_2 = "Det funkade!";
		float balance = 100;
		Scanner scanner = new Scanner(System.in);
		int switchCaseInt = 0;
		
		Customer newCustomer = new Customer(100, "Kjell");
		
		while (true) {
			
			System.out.println("Hello, welcome to your bank. What option would you like to choose?");
			
			switchCaseInt = scanner.nextInt();
			
			switch (switchCaseInt) {
			case 1: System.out.println("You have " + newCustomer.getAccountBalance() + " SEK");
				break;
			case 2: System.out.println("Test");
				break;
			}
			
			
			
			
		}
		
		

		

	}

}
