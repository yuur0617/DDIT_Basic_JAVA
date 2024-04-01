package ddit.chap06.sec03;

public class Grade {
	int sub1;
	int sub2;
	int sub3;
	
	int sum;
	
	Grade(){	//기본생성자 (default Constructor) - 매개변수가 없는 생성자
		this(90, 80, 70);
/*		sub1 = 90;
		sub2 = 89;
		sub3 = 70;			*/
	}
	
	Grade(int sub1){
		this(sub1, 80, 70);
/*		this.sub1 = sub1;
		sub2 = 89;
		sub3 = 70;			*/
	}
	
	Grade(int sub1, int sub2){
		this(sub1, sub2, 70);
/*		this.sub1 = sub1;
		this.sub2 = sub2;
		sub3 = 70;			*/
	}
	
	Grade(int sub1, int sub2, int sub3){
		this.sub1 = sub1;
		this.sub2 = sub2;
		this.sub3 = sub3;
	}
	
	public int sum() {
		sum = sub1 + sub2 + sub3;
		return (sum);
	}
	
	public double avg() {
		return (double)sum /3;
	}
}
