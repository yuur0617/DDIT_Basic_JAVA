package ddit.chap07.sec03;

interface Repairable{}

class Unit {
	int hitPoint;		//유닛의 파워
	final int MAX_HP;	//유닛의 공격 총 용량?		MAX_HP > hitPoint
	
	Unit(int hp){
		MAX_HP = hp;	//생성할때 처음부터 MAX_HP
	}
}

//GroundUnit
class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{	//수리공장을 사용가능한지 
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "탱크";
	}
}

class Marine extends GroundUnit {	//수리공장을 사용할수없으므로 implements Repairable을 사용하지않음
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "해병";
	}
}



class SCV extends GroundUnit implements Repairable{	//부모가 2개  GroundUnit : 상속, Repairable :  
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {		//객체 instanceof 클래스 -> r이 Unit클래스에 상속된 객치인가요?
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u + "의 수리가 완료 되었습니다.");
		}
	}
	
	@Override
	public String toString() {
		return "수리공장";
	}
}

class AirUnit extends Unit{
	AirUnit(int hp){
		super(hp);
	}
}

class DropShip extends AirUnit implements Repairable{
	DropShip(){
		super(150);
	}
	
	@Override
	public String toString() {
		return "수송선";
	}
}

