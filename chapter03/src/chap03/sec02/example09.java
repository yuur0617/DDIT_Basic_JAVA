package chap03.sec02;

import java.util.Scanner;

public class example09 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.print("ù��° �� : ");
		double num1 = sc.nextDouble();
		
		System.out.print("�ι�° �� : ");
		double num2 = sc.nextDouble();
		
		System.out.println("-----------------------------");
		
		double result = num1 / num2;
		if(num2 != 0) {
			System.out.println("��� : " + result);
		}else
			System.out.println("��� : ���Ѵ�");	
	}
}
