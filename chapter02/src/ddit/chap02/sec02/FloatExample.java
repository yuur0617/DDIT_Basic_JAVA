package ddit.chap02.sec02;
/*	실수형 : float(4byte), double(기본형, 8byte)	*/
public class FloatExample {

	public static void main(String[] args) {
//		floatMethod();
		doubleMethod();
	}
	public static void floatMethod() {
/*		float :	4byte(1 bit : 부호, 8bit : 지수)
  		23bit :	가수(소숫점 이하의 수) 
  		1.4e-45 ~ 3.4e+38 (long 타입보다 큰 크기의 데이터 저장)
  		데이터 끝에 'F'('f')를 기술하여 float type임을 컴파일러에게 알려야함. */
		float pi = 3.1415926F;
		int radius = 15; //반지름이 15
		
		System.out.println("원의 넓이 = " + (radius*radius*pi));
		System.out.println("원의 둘레 = " + (2*radius*pi));
	}
	
	public static void doubleMethod() {
/*		double   :	8byte(1 bit : 부호, 11bit : 지수)
  		52bit 	 :	가수(소숫점 이하의 수) 
  		1.9e-324 ~ 1.8e+308 (long 타입보다 큰 크기의 데이터 저장)
  		데이터 끝에 'D'('d')를 기술하거나 생략할수있음. */
		double d1 = 0.1;
		double d2 = 0.1f; //float 타입을 double타입으로 저장
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
	}
}
 