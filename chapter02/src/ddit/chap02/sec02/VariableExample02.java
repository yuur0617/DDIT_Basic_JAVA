package ddit.chap02.sec02;

import java.util.Scanner;

public class VariableExample02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1 = 100;
		
		System.out.print("���� �Է� : ");
		
		int age = sc.nextInt();
		
		if(age >= 18) {
			String message = "�����Դϴ�.";
		}else {
			String message = "�̼����Դϴ�.";
		}
		
/*		System.out.println(message);	//message�� if���� ���������� ��� �Ұ���  */	
		System.out.println(age);
	
	}

}
