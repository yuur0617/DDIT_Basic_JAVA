package ddit.chap04.sec03;

import java.util.Scanner;

public class WhileStatementExample02 {

	public static void main(String[] args) {
		new WhileStatementExample02().init();
	}
	
	public void init() {
		String menu = "*** 커피메뉴 *** \n";
		menu += "1. 아메리카노               2000원\n";
		menu += "2. 카페라떼                  3500원\n";
		menu += "3. 카라멜 마끼야또        5000원\n";
		menu += "4. 자바칩 프라프치노     6500원\n";
		menu += "5. 프로그램 종료\n";
		
		int sum = 0;
		int exit = 0;
		String bill = "*** 영수증  ***\n";
		
		while(true) {
			System.out.println(menu);
			Scanner sc = new Scanner(System.in);
			System.out.print("커피 선택 : ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1: 
				sum = sum + 2000;
				bill += "아메리카노               2000원\n";
				break;
			case 2: 
				sum = sum + 3500;
				bill += "카페라떼                  3500원\n";
				break;
			case 3: 
				sum = sum + 5000;
				bill += "카라멜 마끼야또        5000원\n";
				break;
			case 4: 
				sum = sum + 6500;
				bill += "자바칩 프라프치노     6500원\n";
				break;
			case 5: 
				exit = -1;
				break;
			default : 
				System.out.println("메뉴선택이 잘못되었습니다.");				
			}
			if(exit == -1) {
				System.out.println("프로그램 종료");
				break;
			}
		}
		
		bill += "----------------------------------\n";
		bill +=" 총 합계                   " + sum + "원";
		System.out.println(bill);
	}

}
