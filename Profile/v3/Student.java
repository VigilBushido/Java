import java.util.Scanner;

public class Student {
	
	private static int studentCount = 0;
	private String studentName; 
	private String studentZNumber;
	
	public Student(String name, String z_num) {
		studentCount++;
		this.studentName = name;
		this.studentZNumber = z_num;
	}
	
	public Student() {
		studentCount++;
		System.out.println("Enter in your name: ");
		Scanner input = new Scanner(System.in);
		this.studentName = input.nextLine();
		System.out.println("Enter in your z number: ");
		this.studentZNumber = input.nextLine();
	}
	
	public void StudentProfile() {
		System.out.println("Student Name: " + this.studentName);
		System.out.println("Student Z Number: " + this.studentZNumber);
	}
	public static final void NumStudents() {
		System.out.println("Number of students: " + studentCount);
	}

}
