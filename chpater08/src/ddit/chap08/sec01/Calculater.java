package ddit.chap08.sec01;

public interface Calculater extends Circle{
	
	int add(int num1, int num2);	// == public abstract int add(int num1, int num2);
	int subtract(int num1, int num2);
	long itmes(int num1, int num2);
	double divide(int num1, int num2);
}
