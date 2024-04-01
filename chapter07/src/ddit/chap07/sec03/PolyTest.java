package ddit.chap07.sec03;

public class PolyTest {

	public static void main(String[] args) {
		Tank tank = new Tank();				
		DropShip dship = new DropShip();	
		Marine m = new Marine();			
		SCV scv = new SCV();				
		
		scv.repair(tank);
		scv.repair(dship);
//		scv.repair();
	}

}
