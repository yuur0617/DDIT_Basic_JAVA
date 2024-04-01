package ddit.chap13.sec01;

import java.util.ArrayList;
import java.util.List;

public class ListExample02 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(23021L, "홍길동"));
		list.add(new Student(20001L, "강감찬"));
		list.add(new Student(22031L, "정몽주"));
		list.add(new Student(23121L, "송시열"));
		
		//학번만 추출
		for(Student s : list) {
			System.out.println("학번 : " + s.stdId);
		}

	}

}
