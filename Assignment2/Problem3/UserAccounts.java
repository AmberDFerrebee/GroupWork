package Problem3;
import Problem3.Account;
import java.util.*;

/*
 * @author Red Team 
 * Sam Allen 
 * Zachary Clevenger 
 * Amber Ferrebee 
 * Angela Johnson
 * Bethanie Munkres
 */
public class UserAccounts {
	public static void main(String[] args) {
		// class defines an array of 8 accounts as an instance variable
		Account[] userAccountsArray = new Account[8];
		/*
		 * write a loop that creates 8 accounts with ids 0 through 7 and initial balance
		 * of $50 for each account. Store these accounts in the array.
		 */
		for (int i = 0; i < userAccountsArray.length; i++) {
			userAccountsArray[i] = new Account(i, 50.0);
		}
		
		// Start user input and output 
		
		// boolean variable to test for while loop
		boolean startOver = false;
		do {
			// Create scanner object to store user input for account id selection
			Scanner input = new Scanner(System.in);
			System.out.print("Enter an id: ");
			int userInputId = input.nextInt();
			// When the user enters a valid id, the system displays the menu
			while (userInputId < 0 || userInputId > userAccountsArray.length - 1) {
				System.out.println("Please enter an existing account id: ");
				userInputId = input.nextInt();
			}
			// Create scanner object to store user input for menu choice selection
			Scanner menuChoice = new Scanner(System.in);
			int choice;
			do {
				System.out.println("Main menu");
				System.out.println("1: Check Balance");
				System.out.println("2: Withdraw");
				System.out.println("3: Deposit");
				System.out.println("4: Exit");
				System.out.println("Enter a choice: ");
				choice = menuChoice.nextInt();
				switch (choice) {
				// use getBal to display balance
				case 1:
					System.out.printf("The balance is $%.2f.\n", userAccountsArray[userInputId].getBal());
					break;
				// use withdraw to update with withdrawal amount
				case 2:
					Scanner amtToWithdraw = new Scanner(System.in);
					System.out.println("Enter an amount to withdraw: ");
					double withdrawnAmount = amtToWithdraw.nextDouble();
					userAccountsArray[userInputId].withdraw(withdrawnAmount);
					break;
				// use deposit to update with deposit amount
				case 3:
					Scanner amtToDeposit = new Scanner(System.in);
					System.out.println("Enter an amount to deposit: ");
					double depositedAmount = amtToDeposit.nextDouble();
					userAccountsArray[userInputId].deposit(depositedAmount);
					break;
				// exit menu and return to request account id
				case 4:
					startOver = true;
				}
			} while (choice != 4);
		} while (startOver = true);
	}
}