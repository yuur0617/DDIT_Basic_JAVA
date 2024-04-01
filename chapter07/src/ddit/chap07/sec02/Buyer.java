package ddit.chap07.sec02;

public class Buyer {
	int money;		//가지고있는 돈의 액수
	int bonusPoint;	//보너스포인트
	String items =""; 	//구입목록
	int sum; 		//구입금액
	
	Buyer(int money){
		this.money = money;
	}
	
	void buy(Product p) {
		if(money >= p.price) {
		sum = sum + p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		items = items + p + ", ";
		money = money - p.price;
		}else {
			System.out.println("잔액부족입니다.");
		}
		
		Computer c = (Computer)p;	//다은캐스팅
		
//		instanceof 연산자
//		->	객체 instanceof 클래스
		if(p instanceof Audio) {
			Audio a = (Audio)p;
		}
		System.out.println(p + "의가격 : " + p.price);//15000
		System.out.println(c + "의가격 : " + c.price);	//19000
	}
	
	void summary() {
		System.out.println("구매 목록 : " + items);
		System.out.println("구매 금액 합계 : " + sum);
		System.out.println("구매 후 잔고 : " + money);
	}
}
