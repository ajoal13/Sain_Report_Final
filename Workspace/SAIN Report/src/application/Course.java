package application;

public class Course {

	
	int courseNum;
	String subject, courseName;
	double credits;
	
	
		


	public Course() {
		super();
	}


	public Course(int courseNum, String subject, String courseName, double credits) {
		super();
		this.courseNum = courseNum;
		this.subject = subject;
		this.courseName = courseName;
		this.credits = credits;
		
	}
	
	
	public int getCourseNum() {
		return courseNum;
	}
	public void setCourseNum(int courseNum) {
		this.courseNum = courseNum;
	}
	public String getSubject() {
		return subject;
	}
	public void setSubject(String subject) {
		this.subject = subject;
	}

	
	public double getCredits() {
		return credits;
	}
	public void setCredits(double credits) {
		this.credits = credits;
	}
	
	
			
	
	
}
