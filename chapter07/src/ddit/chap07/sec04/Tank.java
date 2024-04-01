package ddit.chap07.sec04;

public class Tank extends Unit{
	Tank(int x, int y){
		super (x,y);
	}
	
	@Override
	void move(int x1, int y1) {
		System.out.println("("+x+ "," +y+") 에저 ("
							+(x+x1) + "," + (y+y1)+")으로 운전하여 이동하다.");
	}
	
	void siegaMode() {
		System.out.println("시즈모드를 사용하다.");
	}
}
