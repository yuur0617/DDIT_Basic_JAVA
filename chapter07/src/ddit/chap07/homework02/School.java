package ddit.chap07.homework02;

public class School {
	String schoolName;	//�б��̸�
	String grade;		//�б����
	
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
	String teacherName;	//�������̸�

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
	String studName; 	//�л��̸�

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
