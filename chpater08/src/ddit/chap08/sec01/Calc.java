package ddit.chap08.sec01;

public abstract class Calc implements Calculater{
	
	public int add(int num1, int num2) {
		return num1+num2;
	}
	
	public int subtract(int num1, int num2) {
		return num1 - num2;
	}
}
