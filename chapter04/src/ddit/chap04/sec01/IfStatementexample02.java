package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementexample02 {

	public static void main(String[] args) {
/*		Ű�� ü���� ���� m�� kg���� �Է� �޾� BMI������ ��� �ϰ� ���� BMI������ 
 		0		~		18.4   	:	��ü��
 		18.5	~		22.9	:	����ü��
 		23.0	~		24.9	:	��ü��
 		25.0	~		29.9	:	��
 		30.0	�̻�				:	����	�� ��� �Ͻÿ�.*/
/*		BMI ���� = ü�� (kg) / (Ű(m) * Ű(m))*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Ű(m)�� �Է��Ͻÿ�  : ");
		double height = sc.nextDouble();
		
		System.out.print("������(kg)�� �Է��Ͻÿ� : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String body="";
		
		if(bmi < 0) {
			System.out.println("�߸��� ���� �Է��Ͽ����ϴ�.");
		}
		else {
			if(bmi >= 0 && bmi <= 18.4) {
				body = "��ü��";
			}
			else if(bmi >= 18.5 && bmi <= 22.9) {
				body = "����ü��";
			}
			else if(bmi >= 23.0 && bmi <= 24.9) {
				body = "��ü��";
			}
			else if(bmi >= 25.0 && bmi <= 29.9) {
				body = "��";
			}
			else body = "���̹�";
		}
		
		System.out.println();
		
		System.out.println("bmi�� ������"+ String.format("%.2f", bmi) );
		System.out.println(body + "�Դϴ�.");
		
		sc.close();
	}
}

