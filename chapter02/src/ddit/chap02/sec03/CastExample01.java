package ddit.chap02.sec03;

import java.util.Scanner;

/*	���� 3������ ����� ���Ͻÿ�. ��, ����� �Ҽ��� 2��° �ڸ����� �ݿø�
 	���� : 87, 80, 90 */

/*	Ű����� �Է�
 	1. Scanner class import 
 		=> import java.util.Scanner; -- ����(class �ۿ� ���
 	2. Scanner class ��ü ����
 		=> Scanner sc(������) = new Scanner(System.in);	
 	3. �޽��� ���
 		=> system.out.println("�޽���");	
 	4. ScannerŬ���� ��ü(sc)�� �̿��Ͽ� �ڷ� �Է�
 		=> (����) sc.nextInt()
 		 		 Integer.parseInt(sc.nextLine())
 		=> (���ڿ�) sc.next()
 		          sc.nextLine() */ 


public class CastExample01 {

	public static void main(String[] args) {
		
		int sum = 0;	//����
		int score = 0;	//���� ����
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���� ���� : ");
		score =sc.nextInt();
		sum = sum + score;	//sum = sum + sc.nextInt()
		
		System.out.print("���� ���� : ");
		score =sc.nextInt();
		sum = sum + score;
		
		System.out.print("���� ���� : ");
		score =sc.nextInt();
		sum = sum + score;
		
		double avg = (double)sum/3;	//���
		
		avg = (int)(avg*10 +0.5)/10.;
		
		System.out.println("���� = " + sum);
		System.out.println("��� = " + avg);
		
		sc.close();
	}

}
