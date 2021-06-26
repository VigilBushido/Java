import java.util.Scanner;

public class exercise12_189 {

	public static void main(String[] args) {
		double gradeValue = 0.0;
		System.out.println("Enter in your letter grade(A-F) and if included (+/-): ");
		Scanner input = new Scanner(System.in);
		String grade = input.next();

		// a switch statement cannot be used with A+ or A-... because they are strings
		if(grade.equals("A+")) {
			gradeValue = 4.25;
			System.out.println("Value: "+ gradeValue);}
		else if(grade.equals("A")){
			gradeValue = 4.0;
			System.out.println("Value: "+ gradeValue);}
		else if(grade.equals("A-")){
			gradeValue = 3.75;
			System.out.println("Value: "+ gradeValue);}
		else if(grade.equals("B+")){
			gradeValue = 3.25;
			System.out.println("Value: "+ gradeValue);}
		else if(grade.equals("B")){
			gradeValue = 3.0;
			System.out.println("Value: "+ gradeValue);}
		else if(grade.equals("B-")){
			gradeValue = 2.75;
			System.out.println("Value: "+ gradeValue);}
		else if(grade.equals("C+")){
			gradeValue = 2.25;
			System.out.println("Value: "+ gradeValue);}
		else if(grade.equals("C")){
			gradeValue = 2.0;
			System.out.println("Value: "+ gradeValue);}
		else if(grade.equals("C-")){
			gradeValue = 1.75;
			System.out.println("Value: "+ gradeValue);}
		else if(grade.equals("D+")){
			gradeValue = 1.25;
			System.out.println("Value: "+ gradeValue);}
		else if(grade.equals("D")){
			gradeValue = 1.0;
			System.out.println("Value: "+ gradeValue);}
		else if(grade.equals("D-")){
			gradeValue = .75;
			System.out.println("Value: "+ gradeValue);}
		else if(grade.equals("F+")){
			gradeValue = .25;
			System.out.println("Value: "+ gradeValue);}
		else if(grade.equals("F") || grade.equals("F-")){
			gradeValue = 0.0;
			System.out.println("Value: "+ gradeValue);}
	}
		
}
