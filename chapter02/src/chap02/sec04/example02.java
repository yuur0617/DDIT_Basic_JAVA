package chap02.sec04;

import java.util.Scanner;

public class example02 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("ù��° �� : ");
		String strNum1 = scanner.nextLine();
		
		System.out.print("�ι�° �� : ");
		String strNum2 = scanner.nextLine();
		
		int num1 = Integer.parseInt(strNum1);
		int num2 = Integer.parseInt(strNum2);
		int result = num1 + num2;
		System.out.println("���� ��� : " + result);
		
		scanner.close();
	}
}
