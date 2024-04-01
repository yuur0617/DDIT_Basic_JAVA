package ddit.chap06.sec05;

public class AccountTest {

	public static void main(String[] args) {
		Account at1 = Account.getInstance();
		
		System.out.println("첫 번째 계좌의 주소  : " + at1);
		
		Account at2 = Account.getInstance();
		System.out.println("두 번째 계좌의 주소  : " + at2);

	}

}
