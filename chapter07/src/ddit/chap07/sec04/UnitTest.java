package ddit.chap07.sec04;

public class UnitTest {

	public static void main(String[] args) {
		Unit u = new DropShip();		//Upcasting
		u.move(200, 350);
		
		DropShip ds1 = null;
		if(u instanceof DropShip) {		//DownCasting
			ds1 = (DropShip)u;
		}
		
		ds1.loadUnload();
	}

}
