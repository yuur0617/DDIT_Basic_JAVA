package ddit.chap02.sec02;

public class BooleanExample {

	public static void main(String[] args) {
/*		boolean : true/false 를 저장할수있는 변수 타입
 				: 조건문구성에 사용되는 수식의 결과값 
 				: 다른 7가지의 변수형은 boolean타입으로 변환되지 않고
 				  boolean형도 다른 타입으로 형변환 되지 않음 */
		int age1 = 15;
		boolean f1 = age1 >= 18;
		
		int age2 = 105;
		boolean f2 = age2 >=18;
		
		System.out.println("f1 = " + f1);
		System.out.println("f2 = " + f2);
	}

}
