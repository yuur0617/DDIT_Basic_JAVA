package ddit.chap04.sec01;

import java.util.Random;
import java.util.Scanner;

public class Ifstaementexample03 {

	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		Ifstaementexample03 ist = new Ifstaementexample03();
//		ist.ifMethod01();
		ist.ifMethod02();
	}

	public void ifMethod01() {
/*		키보드로 점수를 입력받아 그 값이 
 		100 ~ 96 	:	A+
 		95  ~ 93	:	A0
 		92  ~ 90	: 	A-
 		89  ~ 86 	:	B+
 		85  ~ 83	:	B0
 		82  ~ 80	: 	B- 	그 이하는 "Fail"을 출력하시오. */

		System.out.print("점수를 입력하시오 : ");
		int score = sc.nextInt();
		
		String grade = "";
		
		if(score > 89) {
			grade = "A";
			if(score > 95) {
				grade = grade + "+";
			}else if(score > 92) {
				grade = grade + "0";
			}else {
				grade = grade + "-";
			}
		}else if(score > 79) {
			grade = "B";
			if(score > 85) {
				grade = grade + "+";
			}else if(score > 82) {
				grade = grade + "0";
			}else {
				grade = grade + "-";
			}
		}else grade = "Fail";
		
		System.out.println(score+" => "+grade );
	}
	
	public void ifMethod02() {
/*		1~100사이의 임의의 정수 2개를 생성하여 크기순으로 (큰값 -> 작은값)나열 하시오. (descending sort) */
		Random random = new Random();
		
		int num1 = (int)(Math.random() * 100)+1;
		int num2 = random.nextInt(100)+1;

		if(num1 < num2) {
			int temp = num1;
			num1 = num2;
			num2 = temp;
		}
		System.out.println(num1 + ", " + num2);
	}
}
