package example;

import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		
		long amount = 0;	//금액
		int selectNo;		//선택항목
		
		boolean run = true;
		Account ac1 = new Account(amount);
		
		System.out.print("이름을 입력하세요 : " );
		name = sc.nextLine();
		ac1.setOwner(name);
		
		System.out.println(ac1.getOwner()+ " 고객님 반갑습니다. ");

		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.저축 | 2.인출 | 3.잔고확인 | 4.종료 ");
			System.out.println("----------------------------------");
			System.out.print("선택>");
			selectNo = Integer.parseInt(sc.nextLine());
			//저축
			if(selectNo == 1) {
				System.out.println(ac1.getOwner() + " 고객님의 현재 잔고 : " +  ac1.getBalance() + "원");
				System.out.print("저축할 금액을 적으세요 : ");
				amount = Long.parseLong(sc.nextLine());
				if(amount > 0) {
					System.out.println("잔고 : " + ac1.deposit(amount));
				}else {
					System.out.println("잘못된 값입니다.");	//예외처리
				}
			}
			//인출
			else if(selectNo == 2) {
				System.out.println(ac1.getOwner() + " 고객님의 현재 잔고 : " + ac1.getBalance() + "원");
				System.out.print("인출할 금액을 적으세요 : ");
				amount = Long.parseLong(sc.nextLine());
				if(amount >0) {
					if(ac1.getBalance() < amount) {
						 System.out.println("잔고가 부족하여 인출할수없습니다.");	//인출금액이 잔고금액보다 클경우
					}else {
						System.out.println("잔고 : " + ac1.withdraw(amount));
					}
				}else {
					System.out.println("잘못된 값입니다.");	//예외처리
				}
			}
			//잔고확인
			else if(selectNo == 3) {
				System.out.println(ac1.getOwner() + " 고객님의 현재 잔고 : " + ac1.getBalance() + "원" );
			}
			//프로그램 종료
			else if(selectNo == 4) {
				System.out.println("시스템을 종료합니다.");
				run = false;
			}
			//예외처리
			else System.out.println("잘못입력하였습니다.");
		}
	}
}
