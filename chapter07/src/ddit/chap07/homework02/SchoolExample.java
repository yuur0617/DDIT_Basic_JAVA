package ddit.chap07.homework02;

import java.util.Scanner;

public class SchoolExample {

	public static void main(String[] args) {
//		Student[] stu = new Student[5];
		Student[] stu = {new Student("�����ʵ��б�", "1-��", "�̼���", "ȫ�浿"),
						 new Student("�����ʵ��б�", "1-��", "�̼���", "������"),
						 new Student("�����ʵ��б�", "1-��", "�迵��", "������"),
						 new Student("�����ʵ��б�", "1-��", "���ﷻ", "�̼���"),
						 new Student("�����ʵ��б�", "1-��", "�̼���", "ȫ���")
		};

		String grade = "";
		String tName = "";
		String schName = "";
		String[] stuName = new String[stu.length];	//������ ����
		int j = 0;
		
		Scanner sc = new Scanner(System.in);
		System.out.print("��ȸ �л� �̸� : ");
		String sName = sc.next();					//��ȸ�� �л��̸� _ ȫ�浿
		
		for(int i = 0; i <stu.length; i++) {
			if(sName.equals(stu[i].getStudName())) {
				schName = stu[i].getSchoolName();
				grade = stu[i].getGrade();
				tName  = stu[i].getTeacherName();
				for(int k =0; k<stu.length; k++) { //������ ģ���� ���� ��
					if(stu[k].teacherName.equals(tName)) {	
						stuName[j] = stu[k].studName;
						j++;
					}
				}
			}
		}
		System.out.println("��ȸ���");
		System.out.println("�б��� : " + schName);
		System.out.println("�� : " + grade);
		System.out.println("���� : " + tName);
		System.out.print("�ݱ����� : ");
		for(int i =0; i<stuName.length; i++) {
			if(stuName[i]!= null) {				//null��  �ȳ��� �������� 
				System.out.printf("%5s, " ,stuName[i]);	
			}
		}
	}
	
}
