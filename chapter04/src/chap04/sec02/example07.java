package chap04.sec02;

import java.util.Scanner;

public class example07 {

	public static void main(String[] args) {

		boolean run = true;
		int balance = 0;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("--------------------------------");
			System.out.println("1. 예금 | 2.출금 | 3. 잔고 | 4. 종료");
			System.out.println("--------------------------------");
			System.out.print("선택 > ");
			
			int num = Integer.parseInt(sc.nextLine());
			
			switch (num) {
			case 1: 
				System.out.print("에금액>");
				balance += Integer.parseInt(sc.nextLine());
				break;
			case 2: 
				System.out.print("출금액>");
				balance += Integer.parseInt(sc.nextLine());
				break;
			case 3: 
				System.out.print("잔고>");
				balance += Integer.parseInt(sc.nextLine());
				break;
			case 4:
				run = false;
				break;
			}
			System.out.println();
		}
		System.out.println("프로그램 종료");
	}
}
