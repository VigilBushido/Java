import java.util.Scanner;

public class Question1 {

	public static void main(String[] args) {
		//takes an int as input and returns the integer's polarity
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		int numAbs = Math.abs(number);
		String parity;
		if (number % 2 == 0)
			parity = "even";
		else
			parity = "odd";
		if (number == numAbs)
			System.out.println(number + " is a positive number " + parity + " is its abs " + numAbs + " parity");
		else
			System.out.println(number + " is a negative number " + parity + " is its abs " + numAbs + " parity");
		input.close();

	}

}
