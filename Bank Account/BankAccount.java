import java.util.Scanner;

public class BankAccount {
	static Scanner input = new Scanner(System.in);
	static double balance;
	static double depo = 0;
	static double withdrawel = 0;
	
	public static void deposit() {
		//- Make a deposit from the account balance. 
		System.out.println("How much would you like to Deposit? : ");
		depo = input.nextDouble();
		balance += depo;
	}
	public static void withdraw() {
		System.out.println("How much would you like to Withdrawel");
		withdrawel = input.nextDouble();
		double temp = balance;
		temp -= withdrawel;
		if (temp < 0)
			System.out.println("You don't have enough in your account");
		else
			balance -= withdrawel;
		//- Withdraw an amount from the account balance.
	}
	public static void viewBalance() {
		System.out.println("The current account balance is: " + balance);
		// - Prints to the standard output the account balance
	}
}
