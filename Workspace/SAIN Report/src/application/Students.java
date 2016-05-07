package application;

import java.util.Arrays;

public class Students {

	String userId, password, major, campus, enrollDate, name;
	double gpa;
	
	
	
	String[] CoursesTakenTwardsMajor;
	String[] CoursesTakenOther;
	String[] CoursesNeeded;
	String[] CoursesCurrent;
	String[] CoursesFailedOrWithdrew;
	
	
	
	
	
	
	
	// Constructors
		
	public Students() {
		// TODO Auto-generated constructor stub
	}


	public Students(String userId, String password, String major,
			String campus, String enrollDate, String name, double gpa) {
		super();
		this.userId = userId;
		this.password = password;
		this.major = major;
		this.campus = campus;
		this.enrollDate = enrollDate;
		this.name = name;
		this.gpa = gpa;
		}


	//Getters & Setters
	public String getUserId() {
		return userId;
	}
	public void setUserId(String userId) {
		this.userId = userId;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public String getMajor() {
		return major;
	}
	public void setMajor(String major) {
		this.major = major;
	}
	public String getCampus() {
		return campus;
	}
	public void setCampus(String campus) {
		this.campus = campus;
	}
	public String getEnrollDate() {
		return enrollDate;
	}
	public void setEnrollDate(String enrollDate) {
		this.enrollDate = enrollDate;
	}
	public double getGpa() {
		return gpa;
	}
	public void setGpa(double gpa) {
		this.gpa = gpa;
	}
	public String[] getCoursesTakenTwardsMajor() {
		return CoursesTakenTwardsMajor;
	}
	public void setCoursesTakenTwardsMajor(String[] coursesTakenTwardsMajor) {
		CoursesTakenTwardsMajor = coursesTakenTwardsMajor;
	}
	public String[] getCoursesTakenOther() {
		return CoursesTakenOther;
	}
	public void setCoursesTakenOther(String[] coursesTakenOther) {
		CoursesTakenOther = coursesTakenOther;
	}
	public String[] getCoursesNeeded() {
		return CoursesNeeded;
	}
	public void setCoursesNeeded(String[] coursesNeeded) {
		CoursesNeeded = coursesNeeded;
	}
	public String[] getCoursesCurrent() {
		return CoursesCurrent;
	}
	public void setCoursesCurrent(String[] coursesCurrent) {
		CoursesCurrent = coursesCurrent;
	}
	public String[] getCoursesFailedOrWithdrew() {
		return CoursesFailedOrWithdrew;
	}
	public void setCoursesFailedOrWithdrew(String[] coursesFailedOrWithdrew) {
		CoursesFailedOrWithdrew = coursesFailedOrWithdrew;
	}

	
///////////////////
	@Override
	public String toString() {
		return "Students [userId=" + userId + ", password=" + password
				+ ", major=" + major + ", campus=" + campus + ", enrollDate="
				+ enrollDate + ", gpa=" + gpa + ", CoursesTakenTwardsMajor="
				+ Arrays.toString(CoursesTakenTwardsMajor)
				+ ", CoursesTakenOther=" + Arrays.toString(CoursesTakenOther)
				+ ", CoursesNeeded=" + Arrays.toString(CoursesNeeded)
				+ ", CoursesCurrent=" + Arrays.toString(CoursesCurrent)
				+ ", CoursesFailedOrWithdrew="
				+ Arrays.toString(CoursesFailedOrWithdrew) + "]";
	}
	
	
	
	
	
	
	
	
	
	
}
