
import java.util.Scanner;

public class exercise11_189 {

	public static void main(String[] args) {
		double gradeValue;
		System.out.println("Enter in your letter grade(A-F): ");
		Scanner input = new Scanner(System.in);
		String grade = input.next();
		
		switch (grade)
		{
		case"A": 
			gradeValue = 4.0;
			System.out.println("Value: "+ gradeValue);
			break;
		case"B":
			gradeValue = 3.0;
			System.out.println("Value: "+ gradeValue);
			break;
		case"C":
			gradeValue = 2.0;
			System.out.println("Value: "+ gradeValue);
			break;
		case"D":
			gradeValue = 1.0;
			System.out.println("Value: "+ gradeValue);
			break;
		case"F":
			gradeValue = 0.0;
			System.out.println("Value: "+ gradeValue);
			break;
		default:
			gradeValue = 0.0;
			System.out.println("Invalid");
		}
			
	}
}
