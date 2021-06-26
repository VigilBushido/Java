import java.util.Scanner;

public class HowMany {

	public static void main(String[] args) {
		
		int menuchoice = 0;
		double balance = 0, deposit, withdrawel;
		do {
		System.out.println("\n");
		System.out.println("Welcome to the ATM");
		System.out.println("1 - Deposit");
		System.out.println("2 - Withdrawel");
		System.out.println("3 - Check Account Balance");
		System.out.println("4 - Logout");
		Scanner input = new Scanner(System.in);
		menuchoice = input.nextInt();
		
		if (menuchoice == 1) {
			System.out.println("How much would you like to Deposit? : ");
			deposit = input.nextDouble();
			balance += deposit;}
		else if (menuchoice ==2) {
			System.out.println("How much would you like to Withdrawel");
			withdrawel = input.nextDouble();
			double temp = balance;
			temp -= withdrawel;
			if (temp < 0)
				System.out.println("You don't have enough in your account");
			else
				balance -= withdrawel;}
		else if (menuchoice ==3)
			System.out.println("The current account balance is: " + balance);
		else if (menuchoice == 4)
			System.out.println("Logging out... Thank you goodbye");
		else
			System.out.println("Invalid Selection");
		
		}
		while (menuchoice != 4);
	}
	
}
