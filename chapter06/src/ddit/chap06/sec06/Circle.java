package ddit.chap06.sec06;

public class Circle extends Shape {
	final double PI;
//	final double PI = 3.1415926;
	int radius;
	
	Circle(String kind, int radius){
		super(kind);
		this.radius = radius;
		PI = 3.1415926;
	}
	
	@Override
	public void getArea() {
//		PI = PI + 0.1;
		double area = PI * radius * radius;
		System.out.println(kind + "¿« ≥–¿Ã : " + area);
	}
}
