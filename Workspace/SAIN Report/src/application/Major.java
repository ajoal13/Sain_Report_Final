package application;

public class Major {

	
	String majorTitle, program, degree;
	int course1, course2, course3, course4, course5, course6;
	
	
	
	
	Major Major_IT = new Major ("Information Technology", "Information Technology", "Associates",  101, 102, 103, 104, 105, 106);
	Major Major_Math = new Major ("Math", "Math", "Associates", 201, 202, 203, 204, 205, 206);
	
	
	
	
	
	
	
public Major(String majorTitle, String program, String degree, int course1,
			int course2, int course3, int course4, int course5, int course6) {
		super();
		this.majorTitle = majorTitle;
		this.program = program;
		this.degree = degree;
		this.course1 = course1;
		this.course2 = course2;
		this.course3 = course3;
		this.course4 = course4;
		this.course5 = course5;
		this.course6 = course6;
		
	}




//	Course[] majorCourses;
//	Course[] englishCourses;
//	Course[] sciCourses;
//	Course[] mathCourses;
//	Course[] humCourses;
//	Course[] physEdCourses;
	
	
	


	public String getMajorTitle() {
		return majorTitle;
	}




	public void setMajorTitle(String majorTitle) {
		this.majorTitle = majorTitle;
	}




	public String getProgram() {
		return program;
	}




	public void setProgram(String program) {
		this.program = program;
	}




	public String getDegree() {
		return degree;
	}




	public void setDegree(String degree) {
		this.degree = degree;
	}




	public int getCourse1() {
		return course1;
	}




	public void setCourse1(int course1) {
		this.course1 = course1;
	}




	public int getCourse2() {
		return course2;
	}




	public void setCourse2(int course2) {
		this.course2 = course2;
	}




	public int getCourse3() {
		return course3;
	}




	public void setCourse3(int course3) {
		this.course3 = course3;
	}




	public int getCourse4() {
		return course4;
	}




	public void setCourse4(int course4) {
		this.course4 = course4;
	}




	public int getCourse5() {
		return course5;
	}




	public void setCourse5(int course5) {
		this.course5 = course5;
	}




	public int getCourse6() {
		return course6;
	}




	public void setCourse6(int course6) {
		this.course6 = course6;
	}




	public Major getMajor_IT() {
		return Major_IT;
	}




	public void setMajor_IT(Major major_IT) {
		Major_IT = major_IT;
	}}
