package example;

import java.util.Scanner;

public class SchoolExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String stdName;
		int group = 0;
		
		Student std = new Student();

		System.out.print("�ڽ��� �̸��� �Է��ϼ��� : ");
		stdName = sc.nextLine();
		System.out.println("�б� : " + std.group(stdName));	//�б��� ���
		System.out.println("���� : " + std.teacher(std.group(stdName)));	//���Ӽ������̸� ���
		System.out.println("�б� ģ���� : " + std.friend(std.group(stdName), stdName));	//�б� ģ�����̸� ���
	}

}
