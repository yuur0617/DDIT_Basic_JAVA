package ddit.chap06.sec04;

public class Computer {
	String gname;
	int price;
	int bonusPoint;
	
	Computer(String gname, int price){
		this.gname = gname;
		this.price = price;
		bonusPoint = (int)(price*0.01);
	}
	
	@Override
	public String toString() {
		return gname;
	}
}
