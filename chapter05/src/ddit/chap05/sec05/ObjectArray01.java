package ddit.chap05.sec05;

public class ObjectArray01 {

	public static void main(String[] args) {
/*		점의 좌표를 표현하는 클래스(point)를 생성하고 이를 이용하여 
 		삼각형, 사각형, 원의 정보를 출력하시오.					*/		
//		Triangle t1 = new Triangle(new Point(100, 200), new Point(600, 200), new Point(350,500));
		
//		Point p1 = new Point(100, 200);
//		Point p2 = new Point(600, 200);
//		Point p3 = new Point(350, 500);
//		Triangle t1 = new Triangle(p1, p2, p3);

		Point[] point = {new Point(100, 200), new Point(600, 200), new Point(350,500)};
		Triangle t1 = new Triangle(point);
		
		t1.draw();
		

	}
}

class Point {
	private int x;
	private int y;
	
	Point(int x, int y){	//Point메서드가 사용될때 실행	 //Point(10,20) <- 실행문
		this.x = x;			//메서드안의 변수 > 맴버변수
		this.y = y;			//this : 포인트클래스의 주소? 참조형변수? 맴버변수를 지칭함
	}
	
	@Override				//재정의	//어노테이션	//override가 없을때 주소로 찍힘
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

class Triangle{
//	Point p1;		//p1.toString?
//	Point p2;
//	Point p3;
//	
//	Triangle(Point p1, Point p2, Point p3){
//		this.p1 = p1;
//		this.p2 = p2;
//		this.p3 = p3;
//	}
//	
//	public void draw() {
//		System.out.println("점" + p1 + "에서 점" + p2 + "점를 drawLine()로 연걸한다");
//		System.out.println("점" + p2 + "에서 점" + p3 + "점을 drawLine()로 연결한다");
//		System.out.println("점" + p3 + "에서 점" + p1 + "점을 drawLine()로 연결한다");
//	}
	Point[] point = new Point[3];	//포인트객체를 담을 배열만 생성
	
	Triangle(Point[] point) {
		this.point = point;
	}
	
	public void draw() {
		System.out.println("점" + point[0] + "에서 점" + point[1] + "점를 drawLine()로 연걸한다");
		System.out.println("점" + point[1] + "에서 점" + point[2] + "점을 drawLine()로 연결한다");
		System.out.println("점" + point[2] + "에서 점" + point[0] + "점을 drawLine()로 연결한다");
	}
	

}
