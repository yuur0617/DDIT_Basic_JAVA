package ddit.chap04.sec01;

import java.util.Scanner;

public class IfStatementexample02 {

	public static void main(String[] args) {
/*		키와 체중을 각각 m와 kg으로 입력 받아 BMI지수를 계산 하고 계산된 BMI지수가 
 		0		~		18.4   	:	저체중
 		18.5	~		22.9	:	정상체중
 		23.0	~		24.9	:	과체중
 		25.0	~		29.9	:	비만
 		30.0	이상				:	고도비만	을 출력 하시오.*/
/*		BMI 지수 = 체중 (kg) / (키(m) * 키(m))*/
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("키(m)를 입력하시오  : ");
		double height = sc.nextDouble();
		
		System.out.print("몸무게(kg)를 입력하시오 : ");
		double weight = sc.nextDouble();
		
		double bmi = weight / (height * height);
		
		String body="";
		
		if(bmi < 0) {
			System.out.println("잘못된 값을 입력하였습니다.");
		}
		else {
			if(bmi >= 0 && bmi <= 18.4) {
				body = "저체중";
			}
			else if(bmi >= 18.5 && bmi <= 22.9) {
				body = "정상체중";
			}
			else if(bmi >= 23.0 && bmi <= 24.9) {
				body = "과체중";
			}
			else if(bmi >= 25.0 && bmi <= 29.9) {
				body = "비만";
			}
			else body = "고도미반";
		}
		
		System.out.println();
		
		System.out.println("bmi의 지수는"+ String.format("%.2f", bmi) );
		System.out.println(body + "입니다.");
		
		sc.close();
	}
}

