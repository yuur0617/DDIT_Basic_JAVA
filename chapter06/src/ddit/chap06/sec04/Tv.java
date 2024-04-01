package ddit.chap06.sec04;

public class Tv {
	String gname;
	int price;
	int bonusPoint;
	
	Tv(String gname, int price){
		this.gname = gname;
		this.price = price;
		bonusPoint = (int)(price*0.01);
	}
	
	@Override
	public String toString() {
		return gname;
	}
}
