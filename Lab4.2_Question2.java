import java.util.Scanner;

public class Question2 {
	public static enum LetterGrade{A,B,C,D,F,Null}
	
	
	public static void main(String[] args) {
		
		double percent, temp = 0, avg = 0;
		int tests;
		
		System.out.println("How many tests have you taken? : ");
		Scanner input = new Scanner(System.in);
		tests = input.nextInt();
		
		for (int i = 1 ; i <= tests ; i++) {
			System.out.println("Enter in grade(%) for test " + i);
			percent = input.nextDouble();
			percent += temp;
			avg = (percent) / i;
			temp = percent;
		}
		
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