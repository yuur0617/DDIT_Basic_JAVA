package ddit.chap07.sec04;

public class DropShip extends Unit {
	DropShip(){
		super(0,0);
	}
	
	@Override
	void move(int x1, int y1) {
		System.out.println("("+x+ "," +y+") ���� ("
							+(x+x1) + "," + (y+y1)+")���� �����Ͽ� �̵��ϴ�.");
	}

	void loadUnload() {
		System.out.println("�������� ž���ϴ�.");
	}
}
