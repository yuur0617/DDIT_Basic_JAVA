package example;

import java.util.Scanner;

public class QuadrangleExample {

	public static void main(String[] args) {
		double dot1, dot2;
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("첫번째 사각형 좌표를 입력하세요");
		System.out.print("x좌표 : ");
		dot1 = sc.nextDouble();
		System.out.print("y좌표 : ");
		dot2 = sc.nextDouble();
		Quadrangle quaddot1 = new Quadrangle(dot1, dot2);
		
		System.out.println("두번째 사각형 좌표를 입력하세요");
		System.out.print("x좌표 : ");
		dot1 = sc.nextDouble();
		System.out.print("y좌표 : ");
		dot2 = sc.nextDouble();
		Quadrangle quaddot2 = new Quadrangle(dot1, dot2);
		
		System.out.println("세번째 사각형 좌표를 입력하세요");
		System.out.print("x좌표 : ");
		dot1 = sc.nextDouble();
		System.out.print("y좌표 : ");
		dot2 = sc.nextDouble();
		Quadrangle quaddot3 = new Quadrangle(dot1, dot2);
		
		System.out.print("첫번째 사각형에 다른사각형이 포함된 개수 : " + quaddot1.Compare(quaddot1, quaddot2, quaddot3));
		
		sc.close();

	}

}
