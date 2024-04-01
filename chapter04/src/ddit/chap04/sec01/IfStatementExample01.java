package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementExample01 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		ifMethod01();
//		ifMethod02();
		ifMethod03();
	}

	public static void ifMethod01() {
/*		Ű����� ������ �Է¹޾� 60�� �̻��̸� "�հ�"�� ����Ͻÿ�. */

		System.out.print("������ �Է� �ϼ��� : ");
		
		int score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("�հ�");
		}else {
			System.out.println("���հ�");
		}		
	}
	public static void ifMethod02() {
/*		���� �ϳ��� �Է¹޾� Ȧ������ ¦������ �����Ͽ� ����Ͻÿ�.*/
		
		System.out.print("���� �ϳ��� �Է��ϼ��� : ");
		
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("¦���Դϴ�.");
		}
		else {
			System.out.println("Ȧ���Դϴ�.");
		}
	}
	
	public static void ifMethod03() {
/*		Ű����� 1~12������ ������ �Է� �޾�  
 		�� ���� 3~5�̸� "�� �Դϴ�.",6~8�̸� "���� �Դϴ�.", 9~11�̺� "�����Դϴ�.",12~2�̸� "�����Դϴ�."�� ����Ͻÿ�. */
		
		System.out.print("�� �Է�(1~12) : ");
		
		int month = sc.nextInt();
		String message = "";
		if(month <1 || month >12) {
			System.out.println("���� �߸� �Է� �߽��ϴ�.");
			System.exit(0);
		}else {
			if(month>=3 && month <=5) {
				message = month + "���� ���Դϴ�.";
			}
			else if(month >=6 && month <=8) {
				message = month + "���� �����Դϴ�.";
			}
			else if(month >= 9 && month <=11) {
				message = month + "���� �����Դϴ�.";
			}
			else {
				message = month + "�� �ܿ��Դϴ�.";
			}
			System.out.println(message);
		}
	}
}	

