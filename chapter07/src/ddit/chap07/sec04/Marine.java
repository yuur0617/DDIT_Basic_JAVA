package ddit.chap07.sec04;

public class Marine extends Unit {

	Marine(int x, int y){
		super(x, y);
	}
	
	@Override
	void move(int x1, int y1) {
		System.out.println("("+x+ "," +y+") ���� ("
							+(x+x1) + "," + (y+y1)+")���� �ɾ �̵��ϴ�.");
	}
	
	void stinPack() {
		System.out.println("�������� ����ϴ�");
	}

}
