import java.util.Scanner;

public class Question3 {
	
	public static void main(String[] args) {
		int counter = 0, number, total = 0;
		double average = 0;
		
		do {
		System.out.println("\n");
		System.out.println("Enter in Test score: ");
		Scanner input = new Scanner(System.in);
		number = input.nextInt();
		counter++;
		if (number != -1) {
		total += number;
		average = total / counter;}
	
		if (average < 70) {
			System.out.println("You have failed the Course");
			System.exit(0);}
		
		}
		
		while (number != -1);
				System.out.println("Exiting System");
				System.out.println("Average of all the scores: " + average);
	}
}
	