package ddit.chap07.homework02;

public class School {
	String schoolName;	//학교이름
	String grade;		//학교등급
	
	School(String schoolName, String grade){
		this.schoolName = schoolName;
		this.grade = grade;
	}

	public String getSchoolName() {
		return schoolName;
	}

	public void setSchoolName(String schoolName) {
		this.schoolName = schoolName;
	}

	public String getGrade() {
		return grade;
	}

	public void setGrade(String grade) {
		this.grade = grade;
	}
	
	
	
}

class Teacher extends School{
	String teacherName;	//선생님이름

	Teacher(String shcoolName, String grade, String teacherName){
		super(shcoolName, grade);
		this.teacherName = teacherName;
	}

	public String getTeacherName() {
		return teacherName;
	}

	public void setTeacherName(String teacherName) {
		this.teacherName = teacherName;
	}
}

class Student extends Teacher{
	String studName; 	//학생이름

	Student(String shcoolName, String grade, String teacherName, String studName){
		super(shcoolName, grade, teacherName);
		this.studName = studName;
	}
	
	public String getStudName() {
		return studName;
	}

	public void setStudName(String studName) {
		this.studName = studName;
	}

	
	
}
