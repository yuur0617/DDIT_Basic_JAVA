package ddit.chap07.homework02;

import java.util.Scanner;

public class SchoolExample {

	public static void main(String[] args) {
//		Student[] stu = new Student[5];
		Student[] stu = {new Student("대전초등학교", "1-가", "이순신", "홍길동"),
						 new Student("대전초등학교", "1-가", "이순신", "정몽주"),
						 new Student("대전초등학교", "1-다", "김영현", "강감찬"),
						 new Student("대전초등학교", "1-나", "김헬렌", "이성현"),
						 new Student("대전초등학교", "1-가", "이순신", "홍길순")
		};

		String grade = "";
		String tName = "";
		String schName = "";
		String[] stuName = new String[stu.length];	//기억공간 생성
		int j = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("조회 학생 이름 : ");
		String sName = sc.next();					//조회할 학생이름 _ 홍길동
		
		for(int i = 0; i <stu.length; i++) {
			if(sName.equals(stu[i].getStudName())) {
				schName = stu[i].getSchoolName();
				grade = stu[i].getGrade();
				tName  = stu[i].getTeacherName();
				for(int k =0; k<stu.length; k++) { //같은반 친구를 고르는 문
					if(stu[k].teacherName.equals(tName)) {	
						stuName[j] = stu[k].studName;
						j++;
					}
				}
			}
		}
		System.out.println("조회결과");
		System.out.println("학교명 : " + schName);
		System.out.println("반 : " + grade);
		System.out.println("담임 : " + tName);
		System.out.print("반구성원 : ");
		for(int i =0; i<stuName.length; i++) {
			if(stuName[i]!= null) {				//null이  안나올 경우까지만 
				System.out.printf("%5s, " ,stuName[i]);	
			}
		}
	}
	
}
