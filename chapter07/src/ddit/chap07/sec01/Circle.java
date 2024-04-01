package ddit.chap07.sec01;

public class Circle extends Shape{
	double radius;
	final double PI = 3.1415926;
	
	Circle(){}
	
	Circle(String kind, double radius){
		super(kind);
		this.radius = radius;
	}
	
	@Override
	public void getArea() {
		System.out.println(kind + "¸éÀû : " + radius * radius * PI);
	}
}
