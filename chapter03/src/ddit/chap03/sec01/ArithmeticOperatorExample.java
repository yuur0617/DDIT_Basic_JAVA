package ddit.chap03.sec01;

import java.util.Scanner;

/*	사칙연산자 : +, - , *, /, % */
public class ArithmeticOperatorExample {

	
	public static void main(String[] args) {
		
		ArithmeticOperator ao = new ArithmeticOperator(); //객체 생성
//		ao.arithmeticmethod01();	//호출문
//		ao.unaryOperator();
//		ao.companrisonOperator();
		ao.comparisonIperator2();
	}
}


class ArithmeticOperator{
	
	Scanner sc = new Scanner(System.in);
	
	void arithmeticmethod01() {
/*		사칙연산자 : +, - , *, /, %
 		키보드로 정수 2개를 입력 받아 
 		덧셈, 뺏셈, 곱셉, 나눗섬, 나머지를 구하시오. */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("첫번째 정수 : ");
		int num1 = sc.nextInt();
		
		System.out.print("두번째 정수 : ");
		int num2 = sc.nextInt();
		
		System.out.println(num1 + "+" + num2 + "=" + (num1 + num2));		//두 정수의 합
		System.out.println(num1 + "-" + num2 + "=" + (num1 - num2));		//두 정수의 차
		System.out.println(num1 + "*" + num2 + "=" + (num1 * num2));		//두 정수의 곱
		System.out.println(num1 + "/" + num2 + "=" + ((double)num1 / num2));//두 정수의 나누기
		System.out.println(num1 + "%" + num2 + "=" + (num1 % num2));		//두 정수의 나머지
		
		sc.close();
	}
	
	void unaryOperator() {
/*		단항 연산자 : +,-(부호연산자), ~(1의보수), !(NOT:논리부정)
 				 ++,--(증감연산자) */
		int age = 30;
		System.out.println(+50);
		System.out.println(-50);
		System.out.println(~50);	//1의 보수
		System.out.println(!(age>=18));	//age>=18 => true, !(true) => false
		
		System.out.println();
/*		증,감 연산자 
 		++변수, 변수++ : 변수에 값을  1씩 증가 */
		age++; 
		System.out.println("age = " + age); //31
		++age;
		System.out.println("age = " + age); //32
/*		결과 = 변수++ : '변수'의 값을 '결과'에 저장하고 자신('변수')는 1증가 
 		결과 = ++변수  : '변수'의 값을 1증가 시키고 '결과'에 저장*/
		System.out.println();
		
		age = 30;
		System.out.println("postfix = "+(age++));
		System.out.println("age = "+age);
		
		age = 30;
		System.out.println("prefix : "+ (++age));
		
		System.out.println();
		
		int[] score = {95, 70, 85, 90, 60};
		int sum = 0;
		for(int i = 0; i<score.length; i++) {
			sum = sum+score[i++];		
			}
		System.out.println("총점 :" + sum);
	}
	void companrisonOperator() {
/*		비교연산자 : >, < , ==, >=, <=, !=(<>)
 				결과가 참과 거짓(true or false) 
 				조건문(if, while, ?, for문) 구성에 사용 */
/*		키보드로 점수를 입력 받아 그 값이 60이상이면 'PASS', 그 미만이면 'FAIL'을 출력*/
		Scanner sc = new Scanner(System.in);
		
		System.out.print("점수 : ");
		int score = sc.nextInt();
		
		if(score >= 60) {
			System.out.println("PASS");
		}else {
			System.out.println("FAIL");
		}
		
		System.out.println(score >= 90); //true or false
		
		sc.close();
	}
	
	void comparisonIperator2() {
/*		키보드로 년도를 입력 받아 윤년과 평년을 구별하시오.
 		윤년 : 4의 배수이면서, 100의 배수가 아닌아닌 해 이거나 400의 배수가 되는 해 */
		
		System.out.print("년도 : ");
		int year = sc.nextInt();
		
		if(year % 4 == 0 && year%100 != 0 || year % 400 == 0) {
			System.out.println(year+"년은 윤년입니다.");
		}else {
			System.out.println(year + "년은 평년입니다.");
		}
	}

}

