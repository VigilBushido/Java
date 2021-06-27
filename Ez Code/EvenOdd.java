import java.util.Scanner;

public class EvenOdd {

	public static void main(String[] args) {
		int number; 
		
		System.out.println("Input a number");
		Scanner input = new Scanner(System.in);
		
		number = input.nextInt();
		 
		//even if number%2 == 0
		if (number % 2 == 0){
		System.out.println(number + " is even");
		}
		else {
		//odd if number%2 == 1
		System.out.println(number + " is odd");
		}
		
		input.close();
	}

}
