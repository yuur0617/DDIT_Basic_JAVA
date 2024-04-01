package example;

import java.util.Scanner;

public class CylinderExample {
	

	public static void main(String[] args) {
		
		double r = 0;	//반지름
		double h = 0;	//높이
		
		Scanner sc = new Scanner(System.in);
		System.out.print("반지름을 입력하세요 : ");
		r = sc.nextDouble();		
		System.out.print("높이를 입력하세요 : ");
		h = sc.nextDouble();
		Cylinder circle = new Cylinder(r,h);

		System.out.println("원의 부피 : " + circle.getVolume());
		
		sc.close();

	}

}
