package example;

import java.util.Scanner;

public class CylinderExample {
	

	public static void main(String[] args) {
		
		double r = 0;	//������
		double h = 0;	//����
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�������� �Է��ϼ��� : ");
		r = sc.nextDouble();		
		System.out.print("���̸� �Է��ϼ��� : ");
		h = sc.nextDouble();
		Cylinder circle = new Cylinder(r,h);

		System.out.println("���� ���� : " + circle.getVolume());
		
		sc.close();

	}

}
