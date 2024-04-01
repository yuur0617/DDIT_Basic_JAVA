package example;

public class Cylinder {
	
	public double radius;
	public double high;
	public static double PI = 3.141592;
	
	
	//생성자 구현 
	public Cylinder(double radius, double high) {
		this.radius = radius;
		this.high = high;
	}
	
	//원의 부피를 구하는 메서드
	public double getVolume() {
		double area = radius * radius * PI;
		double volume = area * high;
		return volume;
	}	
}
