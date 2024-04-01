package ddit.chap04.sec03;

public class WhileStatementExample01 {

	public static void main(String[] args) {
//		whileMethod01();
//		whileMethod02();
		whileMethod03();
	}
	
	public static void whileMethod01() {
		int numOfChop = 0;	//도끼질의 횟수
		while(numOfChop < 10) {
			System.out.println("나무를"+numOfChop+"번 찍었습니다.");
			System.out.println("아직 안넘어갔습니다.\n\n");
			numOfChop++;
		}
		System.out.println("나무를"+numOfChop+"번 찍었습니다.");
		System.out.println("드디어 나무가 넘어 갔습니다.");
	}
	
	public static void whileMethod02() {
/*		1~50사이의 피보나치 수열값을 출력하시오.		*/
		int ppn = 1;	//전전수
		int pn = 1;		//전수
		int cn = 0;		//현재수 
		
		System.out.printf("%2d, %2d, ", ppn , pn);
		while(cn < 50) {
			cn = ppn + pn;
			if(cn <= 50) {
				System.out.printf("%2d, ", cn);
			}else {
				break;
			}
			ppn = pn;
			pn = cn;
		}
	}
	
	public static void whileMethod03() {
/*		오늘은 100원, 내일부터 오늘의 2배씩 저축할때 
 		최초로 100만원을 넘는 날과 그때까지 저축한 액수를 출력하시오.	*/
		int sum = 0;
		int money = 100;
		int days = 0;
		
		while(true) {
			sum = sum + money;
			days = days + 1;

			System.out.print("[" + days+"일차 " + "]");
			System.out.println("저금통 금액 : "+ sum);
			if(sum >= 1000000)
				break;
			
			money = money * 2;
			System.out.println("다음날 저축 금액 : " + money);
			System.out.println();
		}
	}
}
