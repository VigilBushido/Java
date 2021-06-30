
public class Student {
	public String name; 
	public String zNumber; 
	public String major; 
	public double gpa; 
	public int birthYear; 
	public int credits; 
		
	public void initialize(String studentName, String studentZNumber, String studentMajor, double studentGPA, int studentBirthYear, int studentCredits)
	{
		name = studentName;
		zNumber = studentZNumber;
		major = studentMajor;
		gpa = studentGPA;
		birthYear = studentBirthYear;
		credits = studentCredits;
	}
	public void studentAge() {
		System.out.println("Your Age: " + (2018 - birthYear));
	}
	public void studentProﬁle() {
		System.out.println("Name: " + name);
		System.out.println("zNumber: " + zNumber);
		System.out.println("major: " + major);
		System.out.println("gpa: " + gpa);
	}
	public void studentYear() {
		if(credits < 30)
			System.out.println("Your a Freshman");
		else if (credits > 30 && credits < 60)
			System.out.println("Your a Sophmore");
		else if (credits > 60 && credits < 90)
			System.out.println("Your a Junior");
		else if (credits > 90)
			System.out.println("Your a Senior");
	}
	
}
