package chap02.sec04;

import java.util.Scanner;

public class example03 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("[�ʼ� ���� �Է�]");
	
		System.out.print("1. �̸� : ");
		String name = sc.nextLine();
		
		System.out.print("2. �ֹι�ȣ �� 6�ڸ� : ");
		String num = sc.nextLine();
		
		System.out.print("3. ��ȭ��ȣ : ");
		String tel = sc.nextLine();
		
		System.out.println();
		
		System.out.println("[�Է��� ����]");
		System.out.println(name);
		System.out.println(num);
		System.out.println(tel);
		
		sc.close();
	}
}
