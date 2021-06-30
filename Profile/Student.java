

public class Student {
		
		private String fullName; 
		private String firstName; 
		private String lastName; 
		private String gradeYear; 
		private double gpa; 
		private int creditsCompl;
	
		public Student(String student_fullname, double student_gpa, int completed_credits) {
			this.fullName = student_fullname;
			this.gpa = student_gpa;
			this.creditsCompl = completed_credits;
			
			if (this.creditsCompl <= 30) {
				this.gradeYear = "Freshman";
				System.out.println("Check1");}
			else if(this.creditsCompl >= 30 && this.creditsCompl <= 60)
				this.gradeYear = "Sophmore";
			else if(this.creditsCompl >= 60 && this.creditsCompl <= 90)
				this.gradeYear = "Junior";
			else if(this.creditsCompl >= 90)
				this.gradeYear = "Senior";
			
			String[] splited = this.fullName.split("\\s+"); 
			this.firstName = splited[0]; this.lastName = splited[1];

			
		}

		public void displayStudentProfile(){
			System.out.println("Student First Name: " + this.firstName);
			System.out.println("Student Last Name: " + this.lastName);
			System.out.println("GPA: " + this.gpa);
			System.out.println("Year: " + this.gradeYear);

		}

}
