package example;

public class Account {
	private String Owner; 	//��
	private long balance;	//�ܰ�
	
	//�⺻������
	public Account() {}
	
	//������ 
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
	
	//������ 
	public Account(long balance) {
		this.balance = balance;
	}
	//Balance getter, setter	//�ܰ� ��ȸ
	public long getBalance() {
		return balance;
	}
	public void setBalance(long balance) {
		this.balance = balance; 
	}
	
	//����
	public long deposit(long amount) {	
		balance += amount;		
		return balance;
	}
	
	//����
	public long withdraw(long amount) {	
		balance -= amount;	
		return balance;
	}
}
