package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementExample01 {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
//		ifMethod01();
//		ifMethod02();
		ifMethod03();
	}

	public static void ifMethod01() {
/*		키보드로 점수를 입력받아 60점 이상이면 "합격"을 출력하시오. */

		System.out.print("점수를 입력 하세요 : ");
		
		int score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("합격");
		}else {
			System.out.println("불합격");
		}		
	}
	public static void ifMethod02() {
/*		정수 하나를 입력받아 홀수인지 짝수인지 구분하여 출력하시오.*/
		
		System.out.print("정수 하나를 입력하세요 : ");
		
		int num = sc.nextInt();
		
		if(num%2 == 0) {
			System.out.println("짝수입니다.");
		}
		else {
			System.out.println("홀수입니다.");
		}
	}
	
	public static void ifMethod03() {
/*		키보드로 1~12사이의 정수를 입력 받아  
 		그 값이 3~5이면 "봄 입니다.",6~8이면 "여름 입니다.", 9~11이변 "가을입니다.",12~2이면 "겨율입니다."를 출력하시오. */
		
		System.out.print("월 입력(1~12) : ");
		
		int month = sc.nextInt();
		String message = "";
		if(month <1 || month >12) {
			System.out.println("월을 잘못 입력 했습니다.");
			System.exit(0);
		}else {
			if(month>=3 && month <=5) {
				message = month + "월은 봄입니다.";
			}
			else if(month >=6 && month <=8) {
				message = month + "월은 여름입니다.";
			}
			else if(month >= 9 && month <=11) {
				message = month + "월은 가을입니다.";
			}
			else {
				message = month + "은 겨울입니다.";
			}
			System.out.println(message);
		}
	}
}	

