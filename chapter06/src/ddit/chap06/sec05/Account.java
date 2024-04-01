package ddit.chap06.sec05;

public class Account {
	private String owner;
	private long balance;
	
	//Singleton
/*	1. ��ü ���� ����(private ����������,  Ÿ���� �ڱ� Ŭ���� Ÿ��, ������ instance�� ���, static)	*/
	private static Account instance = null;
	
/*	2. ������ �޼��� ����(private ���� ������)*/
	private Account() {
		owner = "ȫ���";
	}
	
/*	3. getInstance�޼���(public ���������� ���, ��ȯŸ����  �ڱ� Ŭ����, static	*/
	public static Account getInstance() {
		if(instance == null) {
			instance = new Account();
		}
		return instance;
	}
	
}
