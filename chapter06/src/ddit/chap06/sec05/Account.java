package ddit.chap06.sec05;

public class Account {
	private String owner;
	private long balance;
	
	//Singleton
/*	1. 객체 변수 선언(private 접근지정자,  타입은 자기 클래스 타입, 변수명 instance를 사용, static)	*/
	private static Account instance = null;
	
/*	2. 생성자 메서드 선언(private 접근 지정자)*/
	private Account() {
		owner = "홍길순";
	}
	
/*	3. getInstance메서드(public 접근지정자 사용, 반환타입은  자기 클래스, static	*/
	public static Account getInstance() {
		if(instance == null) {
			instance = new Account();
		}
		return instance;
	}
	
}
