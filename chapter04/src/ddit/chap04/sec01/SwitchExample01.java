package ddit.chap04.sec01;

import java.util.Scanner;

public class SwitchExample01 {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		SwitchExample01 se = new SwitchExample01();
//		se.switMethod01();
//		se.switMethod02();
		se.switMethod03();
	}

	void switMethod01() {
/*		ȸ������� �Է¹޾� �� ���� 
 		1 ����̸� "VIPȸ���Դϴ�."��
 		2~3 ����̸� "���ȸ���Դϴ�."��
 		4~6 ����̸� "�Ϲ�ȸ���Դϴ�."��
 		7~9 ����̸� "�ű�ȸ���Դϴ�.��
 		�ٸ� ���̸� "�߸��� ����Դϴ�."�� ����Ͻÿ�.*/
		System.out.print("ȸ�����(1 ~ 9) : ");
		int grade = sc.nextInt();
		
		String msg = "";
		
		switch(grade) {
		case 1 : msg = "VIPȸ���Դϴ�.";
				break;
				
		case 2 : case 3 : msg = "���ȸ���Դϴ�.";
				break;
				
		case 4 : case 5 : case 6 : msg = "�Ϲ�ȸ���Դϴ�.";
				break;
				
		case 7 : case 8 : case 9 : msg = "�ű�ȸ���Դϴ�.";
				break;
				
		default : msg = "�߸��� ����Դϴ�.";
		}
		System.out.println(grade + "�����" +msg);
	}
	
	void switMethod02() {
/*		�������� �� �������� �Է¹޾�
 		"kr" �Ǵ� "korea"�̸� "���ѹα��Դϴ�."
 		"jp" �Ǵ� "japan"�̸� "�Ϻ��Դϴ�."
 		"chian"�̸� �߱��Դϴ�."�� ����Ͻÿ�. */
		System.out.print("�������� �� �������� �Է��Ͻÿ� : ");
		String country = sc.nextLine();
		
		switch(country) {
		case "kr" : case "korea" :
			System.out.println("���ѹα��Դϴ�.");
			break;
			
		case "jp" : case "japan" :
			System.out.println("�Ϻ��Դϴ�.");
			break;
			
		case "chian" :
			System.out.println("�߱��Դϴ�.");
			break;
			
		default : System.out.println("�߸��Է��Ͽ����ϴ�.");				
		}
	}
	
	void switMethod03() {
/*		Ű����� ������ �Է¹޾� �� ���� 
 		100 ~ 96 	:	A+
 		95  ~ 93	:	A0
 		92  ~ 90	: 	A-
 		89  ~ 86 	:	B+
 		85  ~ 83	:	B0
 		82  ~ 80	: 	B- 	�� ���ϴ� "Fail"�� ����Ͻÿ�. */
		
		System.out.print("������ �Է��ϼ��� : ");
		int score = sc.nextInt();
		
		String grade = "";
		
		switch(score / 10) {
		case 10 : grade = "A+";
			break;
			
		case 9: grade = "A";
			switch(score % 10) {
				case 9 : case 8 : case 7 : case 6 : grade = grade + "+";
					break;
					
				case 5 : case 4: case 3: grade = grade + "0";
					break;
					
				case 2 : case 1 : case 0 : grade = grade + "-";
					break;
					
			}
			break;
			
		case 8 : grade = "B";
			switch(score % 10) {
				case 9 : case 8 : case 7 : case 6 : grade = grade + "+";
					break;
					
				case 5 : case 4: case 3: grade = grade + "0";
					break;
					
				case 2 : case 1 : case 0 : grade = grade + "-";
					break;
					
				}
			break;
			
		default: grade = "Fail";	
		}
		System.out.println(score + " => " + grade);
	}
	
}
