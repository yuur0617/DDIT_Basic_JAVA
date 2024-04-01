package ddit.chap02.sec03;

import java.util.Scanner;

/*	다음 3과목의 평균을 구하시오. 단, 평균은 소수점 2번째 자리에서 반올림
 	점수 : 87, 80, 90 */

/*	키보드로 입력
 	1. Scanner class import 
 		=> import java.util.Scanner; -- 선언(class 밖에 기술
 	2. Scanner class 객체 생성
 		=> Scanner sc(변수명) = new Scanner(System.in);	
 	3. 메시지 출력
 		=> system.out.println("메시지");	
 	4. Scanner클래서 객체(sc)를 이용하여 자료 입력
 		=> (정수) sc.nextInt()
 		 		 Integer.parseInt(sc.nextLine())
 		=> (문자열) sc.next()
 		          sc.nextLine() */ 


public class CastExample01 {

	public static void main(String[] args) {
		
		int sum = 0;	//총점
		int score = 0;	//과목 점수
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("국어 점수 : ");
		score =sc.nextInt();
		sum = sum + score;	//sum = sum + sc.nextInt()
		
		System.out.print("수학 점수 : ");
		score =sc.nextInt();
		sum = sum + score;
		
		System.out.print("과학 점수 : ");
		score =sc.nextInt();
		sum = sum + score;
		
		double avg = (double)sum/3;	//평균
		
		avg = (int)(avg*10 +0.5)/10.;
		
		System.out.println("총점 = " + sum);
		System.out.println("평균 = " + avg);
		
		sc.close();
	}

}
