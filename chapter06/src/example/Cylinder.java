package example;

public class Cylinder {
	
	public double radius;
	public double high;
	public static double PI = 3.141592;
	
	
	//������ ���� 
	public Cylinder(double radius, double high) {
		this.radius = radius;
		this.high = high;
	}
	
	//���� ���Ǹ� ���ϴ� �޼���
	public double getVolume() {
		double area = radius * radius * PI;
		double volume = area * high;
		return volume;
	}	
}
