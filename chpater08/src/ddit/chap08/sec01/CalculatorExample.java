package ddit.chap08.sec01;

public class CalculatorExample {

	public static void main(String[] args) {
		ComplteCalc cc = new ComplteCalc(15);
		
		System.out.println("���� : " + cc.add(1205, 4963));
		System.out.println("���� : " + cc.subtract(1205, 4963));
		System.out.println("���� ���� : " + cc.getArea());
	}

}
