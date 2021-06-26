import java.util.Scanner;

public class GradeAvg {
	public static enum LetterGrade{A,B,C,D,F,Null}
	
	
	public static void main(String[] args) {
		//create a program that asks the user for the number grade they received on two tests.
		// average the test grade. 
		// use if / else to determine the grade received.
		
		double percent, percent2, avg;
		System.out.println("Enter in grade(%) for test 1");
		Scanner input = new Scanner(System.in);
		percent = input.nextDouble();
		System.out.println("Enter in grade(%) for test 2");
		percent2 = input.nextDouble();
		
		avg = (percent + percent2) / 2;
		System.out.println("This is avg "+avg);
		//keyword is enum , creates a type of a set {E, A, B}
		LetterGrade studentGrade;
		studentGrade = LetterGrade.Null;
				
		if (avg >= 90)
			studentGrade = LetterGrade.A;
		else if (avg >= 80 && avg < 90)
			studentGrade = LetterGrade.B;
		else if (avg >= 70 && avg < 80)
			studentGrade = LetterGrade.C;
		else if (avg >= 60 && avg < 70)
			studentGrade = LetterGrade.D;
		else if (avg < 60)
			studentGrade = LetterGrade.F;
		
		System.out.println("This is studentGrade "+ studentGrade);
		System.out.println("Double Check that Student grade is " + studentGrade);
		
		switch(studentGrade) {
			case A:
				System.out.println("Your average grade is a A");
				break;
			case B:
				System.out.println("Your average grade is a B");
				break;
			case C:
				System.out.println("Your average grade is a C");
				break;
			case D:
				System.out.println("Your average grade is a D");
				break;
			case F:
				System.out.println("Your average grade is a F");
				break;
			default:
				System.out.println("Program exiting...");
		}
	}

}
