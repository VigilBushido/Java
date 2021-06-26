import java.awt.Color;
import java.util.Scanner;

public class Grade {

	public static void main(String[] args) {
		System.out.println("Enter in your grade as a percent: ");
		Scanner input = new Scanner(System.in);
		Double grade = input.nextDouble();
		if (grade >= 90)
			System.out.println("Your Grade is a A");
		else if (grade >= 80) 
			System.out.println("Your Grade is a B");
		else if (grade >= 70) 
			System.out.println("Your Grade is a C");
		else 
			System.out.println("Your Grade is Unsatisfactory");
		
		input.close();
		
		// since its 1 line you can use else with no braces
		
		// blue black red, yellow green
		
		canvas.setColor(Color.YELLOW);
	}

}
