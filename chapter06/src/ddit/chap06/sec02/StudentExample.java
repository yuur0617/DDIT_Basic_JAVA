package ddit.chap06.sec02;

public class StudentExample {

	public static void main(String[] args) {
		
		Student s1 = new Student();
//		s1.major = "소프트웨어 학과";
		
		System.out.println("학과 : " + s1.MAJOR);
		System.out.println("학번 : " + Student.stdID);
		
		Student s2 = new Student();
//		s2.major = "소프트웨어 학과";
		
		System.out.println("학과 : " + s2.MAJOR);
		System.out.println("학번 : " + s2.getStdID());
	}

}
