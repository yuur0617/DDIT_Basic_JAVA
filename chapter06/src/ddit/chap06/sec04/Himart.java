package ddit.chap06.sec04;

public class Himart {

	public static void main(String[] args) {
		Tv t1 = new Tv("LG capthion Tv 60", 5000);
		Tv t2 = new Tv("Samsung Tv 80", 7500);
		
		Audio a1 = new Audio("Inkel", 2500);
		
		Computer c1 = new Computer("LG Gram 15", 12000 );
		Computer c2 = new Computer("Samsung note 15", 15000 );
		Computer c3 = new Computer("Mac pro 13", 20000 );

		Buyer b1 = new Buyer();	//기본생성자 _ 매개변수가 없는것
		
		b1.buy(c2);
		b1.buy(c3);
		b1.buy(t2);
		
		b1.summary();
		
		
	}

}
