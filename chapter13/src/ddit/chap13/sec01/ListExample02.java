package ddit.chap13.sec01;

import java.util.ArrayList;
import java.util.List;

public class ListExample02 {

	public static void main(String[] args) {
		List<Student> list = new ArrayList<Student>();
		
		list.add(new Student(23021L, "ȫ�浿"));
		list.add(new Student(20001L, "������"));
		list.add(new Student(22031L, "������"));
		list.add(new Student(23121L, "�۽ÿ�"));
		
		//�й��� ����
		for(Student s : list) {
			System.out.println("�й� : " + s.stdId);
		}

	}

}
