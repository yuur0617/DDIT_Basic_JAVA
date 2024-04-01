package ddit.chap06.sec04;

public class Buyer {
	String items="";	//구매목록
	int sum;		//총 구매 금액
	int bp;			//보너스 포인트
	
	public void buy(Tv t) {	
		items = items + t + ","; //to string 메서드 호출?
		sum = sum + t.price;
		bp = bp + t.bonusPoint;
	}
	//타입이 달라서 buy메소드를 3개 선언 -> 메소드 오버로딩_타입은 다르지만 이름이 같은 메소드가 여러개인것
	public void buy(Audio a) {	
		items = items + a + ", "; 
		sum = sum + a.price;
		bp = bp + a.bonusPoint;
	}
	
	public void buy(Computer c) {	
		items = items + c + ", "; 	//items = items + c.toString() + ", "; - toString()메소드 생략
		sum = sum + c.price;
		bp = bp + c.bonusPoint;
	}
	
	public void summary() {
		System.out.println("구매목룍 : " + items);
		System.out.println("구매금액 합계 : " + sum);
		System.out.println("보너스포인트 : " + bp);
	}
}
