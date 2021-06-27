import java.util.Scanner;

public class Q3 {

	public static void main(String[] args) {
		
		int menuchoice = 0;
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
			BankAccount.deposit();}
		else if (menuchoice ==2) {
			BankAccount.withdraw();}
		else if (menuchoice ==3)
			BankAccount.viewBalance();
		else if (menuchoice == 4)
			System.out.println("Logging out... Thank you goodbye");
		else
			System.out.println("Invalid Selection");
		}
		
		while (menuchoice != 4);
	}
	
}