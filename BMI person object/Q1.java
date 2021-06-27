import java.util.Scanner;

public class Q1 {

	public static void main(String[] args) {
		for( int i = 0 ; i <= 2; i++) {
		Person user = new Person();
		System.out.println("Enter in user name: ");
		Scanner input = new Scanner(System.in);
		user.Name = input.nextLine();
		
		Person.Greeting();
		
		System.out.println("Enter in your weight in lbs: ");
		int weight = input.nextInt();
		
		System.out.println("Enter in your height in inches: ");
		double height = input.nextDouble();
		
		user.kilograms = weight / 2.2;
		user.heightMeters = height * 0.0254;
		
		Person.calculateBMI();
		}
	}
	
}
