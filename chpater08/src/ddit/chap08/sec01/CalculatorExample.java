package ddit.chap08.sec01;

public class CalculatorExample {

	public static void main(String[] args) {
		ComplteCalc cc = new ComplteCalc(15);
		
		System.out.println("µ¡¼À : " + cc.add(1205, 4963));
		System.out.println("»¬¼À : " + cc.subtract(1205, 4963));
		System.out.println("¿øÀÇ ³ÐÀÌ : " + cc.getArea());
	}

}
