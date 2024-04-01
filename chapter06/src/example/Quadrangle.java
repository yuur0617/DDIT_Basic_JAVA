package example;

public class Quadrangle {
	
	double dot1, dot2;	
	
	//생성자 구현
	public Quadrangle(double dot1, double dot2) {
		this.dot1 = dot1;
		this.dot2 = dot2;
	}
	
	//첫번째 사각형 x,y좌표와 두번째x,y좌표 비교 & 첫번째 사각형 x,y좌표와 세번째x,y좌표 비교 메서드
	public String Compare(Quadrangle quad1, Quadrangle quad2, Quadrangle quad3) {
		int count = 0;
		String a="";
		String b="";

		if(quad1.dot1 >= quad2.dot1 && quad1.dot2 >= quad2.dot2) {
			count++;
			a = "\n\n-> 첫번째사각형에 두번째사각형이 포함되었습니다.";
		}else {
			a = "\n\n-> 첫번째사각형에 두번째사각형이 포함되지않았습니다.";
		}
		
		if(quad1.dot1 >= quad3.dot1 && quad1.dot2 >= quad3.dot2) {
			count++;
			b = "\n-> 첫번째사각형에 세번째사각형이 포함되었습니다.";
		}else {
			b = "\n-> 첫번째사각형에 세번째사각형이  포함되지않았습니다.";
		}
		return (count + a + b);
	}
}
