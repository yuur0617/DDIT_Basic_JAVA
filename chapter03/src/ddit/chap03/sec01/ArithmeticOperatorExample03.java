package ddit.chap03.sec01;

import java.util.Scanner;

public class ArithmeticOperatorExample03 {

	public static void main(String[] args) {
/*		Ű����� ���̸� �Է� �޾� �� ���̿� �ش��ϴ� ��ɴ븦 ���ϰ�
 		~20�� : û�⼼��
 		30�� ~ 50�� : ��⼼��
 		50�� ���� : ��⼼�� �� ����Ͻÿ�. */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("���̸� �Է��ϼ��� : ");
		int age = sc.nextInt();
		
		int ageGroup = age/10;
		
		String g = (ageGroup < 3) ? "û�⼼��" : 
					(ageGroup >= 3 && ageGroup < 5) ? "��⼼��" : "��⼼��";
		
		System.out.print(age + "���� " + g + "�Դϴ�.");
		
		sc.close();

	}
}

