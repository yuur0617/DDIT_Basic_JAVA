package ddit.chap06.sec05;

public class AccountTest {

	public static void main(String[] args) {
		Account at1 = Account.getInstance();
		
		System.out.println("ù ��° ������ �ּ�  : " + at1);
		
		Account at2 = Account.getInstance();
		System.out.println("�� ��° ������ �ּ�  : " + at2);

	}

}
