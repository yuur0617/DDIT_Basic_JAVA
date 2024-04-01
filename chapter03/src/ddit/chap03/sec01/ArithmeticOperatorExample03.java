package ddit.chap03.sec01;

import java.util.Scanner;

public class ArithmeticOperatorExample03 {

	public static void main(String[] args) {
/*		키보드로 나이를 입력 받아 그 나이에 해당하는 년령대를 구하고
 		~20대 : 청년세대
 		30대 ~ 50대 : 장년세대
 		50대 이후 : 노년세대 로 출력하시오. */
		Scanner sc = new Scanner(System.in);
		
		System.out.print("나이를 입력하세요 : ");
		int age = sc.nextInt();
		
		int ageGroup = age/10;
		
		String g = (ageGroup < 3) ? "청년세대" : 
					(ageGroup >= 3 && ageGroup < 5) ? "장년세대" : "노년세대";
		
		System.out.print(age + "세는 " + g + "입니다.");
		
		sc.close();

	}
}

