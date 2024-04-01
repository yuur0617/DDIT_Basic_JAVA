package example;

import java.util.Scanner;

public class SchoolExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String stdName;
		int group = 0;
		
		Student std = new Student();

		System.out.print("자신의 이름을 입력하세요 : ");
		stdName = sc.nextLine();
		System.out.println("학급 : " + std.group(stdName));	//학급을 출력
		System.out.println("담임 : " + std.teacher(std.group(stdName)));	//담임선생님이름 출력
		System.out.println("학급 친구들 : " + std.friend(std.group(stdName), stdName));	//학급 친구들이름 출력
	}

}
