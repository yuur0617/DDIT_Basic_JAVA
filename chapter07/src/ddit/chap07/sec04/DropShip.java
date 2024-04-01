package ddit.chap07.sec04;

public class DropShip extends Unit {
	DropShip(){
		super(0,0);
	}
	
	@Override
	void move(int x1, int y1) {
		System.out.println("("+x+ "," +y+") 에저 ("
							+(x+x1) + "," + (y+y1)+")으로 비행하여 이동하다.");
	}

	void loadUnload() {
		System.out.println("아이템이 탑승하다.");
	}
}
