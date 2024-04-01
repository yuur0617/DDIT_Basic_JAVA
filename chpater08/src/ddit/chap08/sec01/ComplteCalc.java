package ddit.chap08.sec01;

public class ComplteCalc extends Calc implements Circle{

	int radius;
	
	public ComplteCalc(int radius) {
		this.radius = radius;
	}
	
	@Override
	public long itmes(int num1, int num2) {
		
		return num1 * num2;
	}

	@Override
	public double divide(int num1, int num2) {
		
		return (double)num1 / num2;
	}

	public double getArea() {
		return radius * radius * PI;
	}
}
