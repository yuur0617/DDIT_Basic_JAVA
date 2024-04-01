package ddit.chap02.sec02;

import java.util.Scanner;

public class VariableExample02 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int v1 = 100;
		
		System.out.print("나이 입력 : ");
		
		int age = sc.nextInt();
		
		if(age >= 18) {
			String message = "성년입니다.";
		}else {
			String message = "미성년입니다.";
		}
		
/*		System.out.println(message);	//message는 if문의 지역변수라 사용 불가능  */	
		System.out.println(age);
	
	}

}
