package chap03.sec02;

import java.util.Scanner;

public class example11 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̵� : ");
		String name = sc.nextLine();
		
		System.out.print("�н����� : ");
		String strPassword = sc.nextLine();
		int password = Integer.parseInt(strPassword);
		
		if(name.equals("java")) {
			if(password == 12345) {
				System.out.println("�α��� ����");
			}else {
				System.out.println("�α��� ���� : �н����尡 Ʋ��");
			}
		}else {
			System.out.println("�α��� ���� : ���̵� �������� ����");
		}	
	}
}
