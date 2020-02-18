package Problem1;
public class TestAccount {

	public static void main(String[] args) {
		
		// Chapter 9 Programming exercise 
		// exercise 9.7
		// requirements:
		// write a program that creates an Account object to test validity of Account class
			// id is 1122
			// balance is 20000
			// perform withdrawal of 2500
			// perform deposit of 3000
			// print balance, monthly interest rate, and the date created
		
		// required: creates new object of Account type
		Account acc1 = new Account(1122, 20000); 
		System.out.printf("An account with an ID of %d and starting balance of $%.2f has been created.\n\n", acc1.getId(), acc1.getBal());
		double withdraw = 2500;
		// required: performs withdrawal by invoking withdraw method to update balance
		acc1.withdraw(withdraw); 
		System.out.printf("A withdrawal of $%.2f to account %d has been made,\n", withdraw, acc1.getId());
		System.out.printf("creating a new balance of $%.2f.\n\n", acc1.getBal());
		double deposit = 3000;
		// required: performs deposit by invoking deposit method to update balance
		acc1.deposit(deposit); 
		System.out.printf("A deposit of $%.2f to account %d has been made,\n", deposit, acc1.getId());
		System.out.printf("creating a new balance of $%.2f.\n\n", acc1.getBal());
		// required: print the balance
		System.out.printf("The ending balance is $%.2f\n", acc1.getBal()); 
		//  required: prints the interest
		System.out.printf("The monthly interest on the ending balance is $%.2f\n", acc1.getMonthlyInterest()); 
		// required: prints the date created
		System.out.printf("The date the account was created is %s", acc1.getDateCreated()); 
	}

}
