package example;

public class Account {
	private String Owner; 	//고객
	private long balance;	//잔고
	
	//기본생성자
	public Account() {}
	
	//생성자 
	public Account(String Owner){
		this.Owner = Owner;
	}
	//Owner getter,setter
	public String getOwner() {
		return Owner;
	}
	public void setOwner(String Owner) {
		this.Owner = Owner;
	}
	
	//생성자 
	public Account(long balance) {
		this.balance = balance;
	}
	//Balance getter, setter	//잔고 조회
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance; 
	}
	
	//저축
	public long deposit(long amount) {	
		balance += amount;		
		return balance;
	}
	
	//인출
	public long withdraw(long amount) {	
		balance -= amount;	
		return balance;
	}
}
