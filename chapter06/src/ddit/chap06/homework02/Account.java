package ddit.chap06.homework02;

public class Account {
	private String owner;	//예금주
	private long balance;	//찬고
	
	public Account(String owner) {
		this.owner = owner;
		balance = 0;
	}
	
	public Account() {}	//기본생성자 - 매개변수를 갖지않는 생성자 

	public String getOwner() {
		return owner;
	}

	public long getBalance() {	//잔고 확인
		return balance;
	}
	
	public void setOwner (String owner) {	//기본 생정자에 의하여 생성된 객체에 예금주 설정
		this.owner = owner;
	}
	//입금 메서드 - 입금할 액수
	public void deposit(long money) {
		balance += money;
	}
	
	//출금 메서드 - 출금할 액수
	public long withdraw(long money) {
		if(balance < money) {
			System.out.println("잔고 부족");
			return 0;
		}else {
			balance -= money;
			return money;
		}
	}
	
}
