package ddit.chap06.homework02;

public class Account {
	private String owner;	//������
	private long balance;	//����
	
	public Account(String owner) {
		this.owner = owner;
		balance = 0;
	}
	
	public Account() {}	//�⺻������ - �Ű������� �����ʴ� ������ 

	public String getOwner() {
		return owner;
	}

	public long getBalance() {	//�ܰ� Ȯ��
		return balance;
	}
	
	public void setOwner (String owner) {	//�⺻ �����ڿ� ���Ͽ� ������ ��ü�� ������ ����
		this.owner = owner;
	}
	//�Ա� �޼��� - �Ա��� �׼�
	public void deposit(long money) {
		balance += money;
	}
	
	//��� �޼��� - ����� �׼�
	public long withdraw(long money) {
		if(balance < money) {
			System.out.println("�ܰ� ����");
			return 0;
		}else {
			balance -= money;
			return money;
		}
	}
	
}
