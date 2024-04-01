package ddit.chap04.sec02;

public class ForStatementExample03 {

	public static void main(String[] args) {
//		forMethod01();
//		forMethod02();
//		forMethod03();
		forMethod04();
	}
	
	public static void forMethod01() {
/*		구구단 2단~ 9단    */
		for(int i = 2; i <= 9; i++) {
			System.out.println("\n[" + i + "단 ]");
			for(int j = 1; j <= 9; j++) {
				System.out.println(i + "*" + j + "=" + (i*j));
			}
		}
	}
	
	public static void forMethod02() {
/*		구구단 2단~ 9단    
		2*1=2	3*1=3	4*1=4	...		9*1=9	
		2*2=4	3*2=6	4*2=8	...		9*2=18  
		 			.
		 			.
		 			.
		2*9=18	3*9=27	4*9=36	...		9*9=81		*/
		for(int i = 1; i <= 9; i++) {
			System.out.println(" ");
			for(int j = 2; j <= 9; j++) {
				System.out.printf("%d*%d=%2d  ",j, i , (j*i));
			}
		}
	}

	public static void forMethod03() {
/*		1+1/2+1/3+ ... +1/10 = ? */
		double result = 0;
		for(int i = 1; i < 11; i++) {
			result = result + (1/(double)i);
		}
		System.out.println("result = " + result);
	}
	
	public static void forMethod04() {
/*		서기 1년 1월 1일 1부터 오늘까지 경과된 일수를 구하시오.  
 		1) 1년 ~ 2022년까지 경과된 일수 계산    */
		int days = 0;
		int year = 0;
		for(year = 1; year <=2022; year++) {
			if((year % 4 == 0 && year % 100 != 0)|| (year % 400 == 0)) {
				days = days + 366;
			}else {
				days = days + 365;
			}
		}
//		2023년도에서 경과된 일수
		for(int month = 1; month <=7; month ++) {
			switch(month){
			case 1:	case 3: case 5: case 7:
			case 8: case 10: case 12:
				days = days + 31;
				break;
			case 4: case 6: case 9: case 11:
				days = days + 30;
				break;
			case 2:
				if(year % 4 == 0 && year % 100 != 0 || (year % 400 == 0)) {
					days = days + 29;
				}else	{
					days = days + 28;
				}
			}
		}
		days = days + 21;
		System.out.println(days);
		switch((days + 1) % 7) {
		case 1:
			System.out.println("오늘은 일요일 입니다.");
			break;
		case 2:
			System.out.println("오늘은 월요일 입니다.");
			break;
		case 3:
			System.out.println("오늘은 화요일 입니다.");
			break;
		case 4:
			System.out.println("오늘은 수요일 입니다.");
			break;
		case 5:
			System.out.println("오늘은 목요일 입니다.");
			break;
		case 6:
			System.out.println("오늘은 금요일 입니다.");
			break;
		case 7:
			System.out.println("오늘은 토요일 입니다.");
			break;
		}	
	}
}
