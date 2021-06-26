import java.util.Scanner;

public class If_else {
	public static final double neg_bal = -10; // negative balance
	public static final double int_rate = .02; // interest rate
	public static void main(String[] args) {

		System.out.println("Enter your checking account balance");
		Scanner input = new Scanner(System.in);
		double balance = input.nextDouble();
		System.out.println("Original Balance: " + balance);
		System.out.println("Enter in a deduction");
		double deduct = input.nextDouble();
		if (balance - deduct >= 0) {
			balance -= deduct;
			System.out.println("New Balance: " + balance);
			double interest = (balance * int_rate) / 12;
			System.out.println("After 1 month: " + (balance + interest));
		}
		else {
			balance -= deduct;
			balance -= neg_bal;
			System.out.println("Negative penaty applied... New Balance: " + balance);
			double interest = (balance * int_rate) / 12;
			System.out.println("After 1 month: " + (balance + interest));
		}

		input.close();
		// after 1 month of interest rate and deduction and penalties
	}

}
