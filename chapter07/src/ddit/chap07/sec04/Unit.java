package ddit.chap07.sec04;

public abstract class Unit {
	int x;
	int y;
	
	Unit(int x, int y){
		this.x = x;
		this.y = y;
	}
	
	abstract void move(int x1, int y1);	//�߻�޼���
	void stop() {
		System.out.println("���ߴ�");
	}	//���� �޼���
}
