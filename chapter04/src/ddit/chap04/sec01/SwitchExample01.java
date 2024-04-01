package ddit.chap04.sec01;

import java.util.Scanner;

public class SwitchExample01 {
	
	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {

		SwitchExample01 se = new SwitchExample01();
//		se.switMethod01();
//		se.switMethod02();
		se.switMethod03();
	}

	void switMethod01() {
/*		회원등급을 입력받아 그 값이 
 		1 등급이면 "VIP회원입니다."를
 		2~3 등급이면 "우수회원입니다."를
 		4~6 등급이면 "일반회원입니다."를
 		7~9 등급이면 "신규회원입니다.를
 		다른 값이면 "잘못된 등급입니다."를 출력하시오.*/
		System.out.print("회원등급(1 ~ 9) : ");
		int grade = sc.nextInt();
		
		String msg = "";
		
		switch(grade) {
		case 1 : msg = "VIP회원입니다.";
				break;
				
		case 2 : case 3 : msg = "우수회원입니다.";
				break;
				
		case 4 : case 5 : case 6 : msg = "일반회원입니다.";
				break;
				
		case 7 : case 8 : case 9 : msg = "신규회원입니다.";
				break;
				
		default : msg = "잘못된 등급입니다.";
		}
		System.out.println(grade + "등급은" +msg);
	}
	
	void switMethod02() {
/*		영문으로 된 국가명을 입력받아
 		"kr" 또는 "korea"이면 "대한민국입니다."
 		"jp" 또는 "japan"이면 "일본입니다."
 		"chian"이면 중국입니다."를 출력하시오. */
		System.out.print("영문으로 된 국가명을 입력하시오 : ");
		String country = sc.nextLine();
		
		switch(country) {
		case "kr" : case "korea" :
			System.out.println("대한민국입니다.");
			break;
			
		case "jp" : case "japan" :
			System.out.println("일본입니다.");
			break;
			
		case "chian" :
			System.out.println("중국입니다.");
			break;
			
		default : System.out.println("잘못입력하였습니다.");				
		}
	}
	
	void switMethod03() {
/*		키보드로 점수를 입력받아 그 값이 
 		100 ~ 96 	:	A+
 		95  ~ 93	:	A0
 		92  ~ 90	: 	A-
 		89  ~ 86 	:	B+
 		85  ~ 83	:	B0
 		82  ~ 80	: 	B- 	그 이하는 "Fail"을 출력하시오. */
		
		System.out.print("점수를 입력하세요 : ");
		int score = sc.nextInt();
		
		String grade = "";
		
		switch(score / 10) {
		case 10 : grade = "A+";
			break;
			
		case 9: grade = "A";
			switch(score % 10) {
				case 9 : case 8 : case 7 : case 6 : grade = grade + "+";
					break;
					
				case 5 : case 4: case 3: grade = grade + "0";
					break;
					
				case 2 : case 1 : case 0 : grade = grade + "-";
					break;
					
			}
			break;
			
		case 8 : grade = "B";
			switch(score % 10) {
				case 9 : case 8 : case 7 : case 6 : grade = grade + "+";
					break;
					
				case 5 : case 4: case 3: grade = grade + "0";
					break;
					
				case 2 : case 1 : case 0 : grade = grade + "-";
					break;
					
				}
			break;
			
		default: grade = "Fail";	
		}
		System.out.println(score + " => " + grade);
	}
	
}
