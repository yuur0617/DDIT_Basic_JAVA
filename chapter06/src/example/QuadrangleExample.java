package example;

import java.util.Scanner;

public class QuadrangleExample {

	public static void main(String[] args) {
		double dot1, dot2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("ù��° �簢�� ��ǥ�� �Է��ϼ���");
		System.out.print("x��ǥ : ");
		dot1 = sc.nextDouble();
		System.out.print("y��ǥ : ");
		dot2 = sc.nextDouble();
		Quadrangle quaddot1 = new Quadrangle(dot1, dot2);
		
		System.out.println("�ι�° �簢�� ��ǥ�� �Է��ϼ���");
		System.out.print("x��ǥ : ");
		dot1 = sc.nextDouble();
		System.out.print("y��ǥ : ");
		dot2 = sc.nextDouble();
		Quadrangle quaddot2 = new Quadrangle(dot1, dot2);
		
		System.out.println("����° �簢�� ��ǥ�� �Է��ϼ���");
		System.out.print("x��ǥ : ");
		dot1 = sc.nextDouble();
		System.out.print("y��ǥ : ");
		dot2 = sc.nextDouble();
		Quadrangle quaddot3 = new Quadrangle(dot1, dot2);
		
		System.out.print("ù��° �簢���� �ٸ��簢���� ���Ե� ���� : " + quaddot1.Compare(quaddot1, quaddot2, quaddot3));
		
		sc.close();

	}

}
