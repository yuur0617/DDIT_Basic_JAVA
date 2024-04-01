package ddit.chap03.sec01;

import java.util.Scanner;

/*	��Ģ������ : +, - , *, /, % */
public class ArithmeticOperatorExample {

	
	public static void main(String[] args) {
		
		ArithmeticOperator ao = new ArithmeticOperator(); //��ü ����
//		ao.arithmeticmethod01();	//ȣ�⹮
//		ao.unaryOperator();
//		ao.companrisonOperator();
		ao.comparisonIperator2();
	}
}


class ArithmeticOperator{
	
	Scanner sc = new Scanner(System.in);
	
	void arithmeticmethod01() {
/*		��Ģ������ : +, - , *, /, %
 		Ű����� ���� 2���� �Է� �޾� 
 		����, ����, ����, ������, �������� ���Ͻÿ�. */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° ���� : ");
		int num1 = sc.nextInt();
		
		System.out.print("�ι�° ���� : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));		//�� ������ ��
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));		//�� ������ ��
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));		//�� ������ ��
		System.out.println(num1 + "/" + num2 + "=" + ((double)num1 / num2));//�� ������ ������
		System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));		//�� ������ ������
		
		sc.close();
	}
	
	void unaryOperator() {
/*		���� ������ : +,-(��ȣ������), ~(1�Ǻ���), !(NOT:������)
 				 ++,--(����������) */
		int age = 30;
		System.out.println(+50);
		System.out.println(-50);
		System.out.println(~50);	//1�� ����
		System.out.println(!(age>=18));	//age>=18 => true, !(true) => false
		
		System.out.println();
/*		��,�� ������ 
 		++����, ����++ : ������ ����  1�� ���� */
		age++; 
		System.out.println("age = " + age); //31
		++age;
		System.out.println("age = " + age); //32
/*		��� = ����++ : '����'�� ���� '���'�� �����ϰ� �ڽ�('����')�� 1���� 
 		��� = ++����  : '����'�� ���� 1���� ��Ű�� '���'�� ����*/
		System.out.println();
		
		age = 30;
		System.out.println("postfix = "+(age++));
		System.out.println("age = "+age);
		
		age = 30;
		System.out.println("prefix : "+ (++age));
		
		System.out.println();
		
		int[] score = {95, 70, 85, 90, 60};
		int sum = 0;
		for(int i = 0; i<score.length; i++) {
			sum = sum+score[i++];		
			}
		System.out.println("���� :" + sum);
	}
	void companrisonOperator() {
/*		�񱳿����� : >, < , ==, >=, <=, !=(<>)
 				����� ���� ����(true or false) 
 				���ǹ�(if, while, ?, for��) ������ ��� */
/*		Ű����� ������ �Է� �޾� �� ���� 60�̻��̸� 'PASS', �� �̸��̸� 'FAIL'�� ���*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� : ");
		int score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		System.out.println(score >= 90); //true or false
		
		sc.close();
	}
	
	void comparisonIperator2() {
/*		Ű����� �⵵�� �Է� �޾� ����� ����� �����Ͻÿ�.
 		���� : 4�� ����̸鼭, 100�� ����� �ƴѾƴ� �� �̰ų� 400�� ����� �Ǵ� �� */
		
		System.out.print("�⵵ : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year%100 != 0 || year % 400 == 0) {
			System.out.println(year+"���� �����Դϴ�.");
		}else {
			System.out.println(year + "���� ����Դϴ�.");
		}
	}

}

