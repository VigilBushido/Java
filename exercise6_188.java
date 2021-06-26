import java.util.Scanner;

public class exercise6_188 {

	public static void main(String[] args) {
		System.out.println("Enter in check amount: ");
		Scanner input = new Scanner(System.in);
		double amount = input.nextDouble();
		
		double serviceCharge = 0.0;
		if (amount < 10) {
			serviceCharge = 1.0; System.out.println("The service charge: "+ serviceCharge);}
		else if (amount < 100) {
			serviceCharge = 0.1 * amount; System.out.println("The service charge: "+ serviceCharge);}
		else if (amount < 1000) {
			serviceCharge = 5 + (0.05 * amount); System.out.println("The service charge: "+ serviceCharge);}
		else if (amount > 1000) {
			serviceCharge = 40 + (0.01 * amount); System.out.println("The service charge: "+ serviceCharge);}
	}

}
