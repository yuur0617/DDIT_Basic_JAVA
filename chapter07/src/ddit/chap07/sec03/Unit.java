package ddit.chap07.sec03;

interface Repairable{}

class Unit {
	int hitPoint;		//������ �Ŀ�
	final int MAX_HP;	//������ ���� �� �뷮?		MAX_HP > hitPoint
	
	Unit(int hp){
		MAX_HP = hp;	//�����Ҷ� ó������ MAX_HP
	}
}

//GroundUnit
class GroundUnit extends Unit{
	GroundUnit(int hp){
		super(hp);
	}
}

class Tank extends GroundUnit implements Repairable{	//���������� ��밡������ 
	Tank(){
		super(150);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "��ũ";
	}
}

class Marine extends GroundUnit {	//���������� ����Ҽ������Ƿ� implements Repairable�� �����������
	Marine(){
		super(40);
		hitPoint = MAX_HP;
	}
	
	@Override
	public String toString() {
		return "�غ�";
	}
}



class SCV extends GroundUnit implements Repairable{	//�θ� 2��  GroundUnit : ���, Repairable :  
	SCV(){
		super(60);
		hitPoint = MAX_HP;
	}
	
	void repair(Repairable r) {
		if(r instanceof Unit) {		//��ü instanceof Ŭ���� -> r�� UnitŬ������ ��ӵ� ��ġ�ΰ���?
			Unit u = (Unit)r;
			while(u.hitPoint != u.MAX_HP) {
				u.hitPoint++;
			}
			System.out.println(u + "�� ������ �Ϸ� �Ǿ����ϴ�.");
		}
	}
	
	@Override
	public String toString() {
		return "��������";
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
		return "���ۼ�";
	}
}

