package ddit.chap02.sec02;

/* 정수 : byte(1byte), short(2byte), int(기본형, 4byte), long(8byte) */

public class IntegerExample {

	public static void main(String[] args) {
//		byteMethod();
//		shortMethod();
//		intMethod();
		longMethod();
	}
	
	public static void byteMethod() {
/*		byte : 	1byte 기억공간
 			 : 	127 ~ -128 까지의 정수 저장
 				위의 값을 벗어나는 값을 갖는 리터럴은 오류 
 				연산결과가 위 범위값을 벗어나면 순환 적용
 				(0,1,2, ... ,127,-128,-127,...,-1) */
		byte b1 = 120;
		System.out.println("b1 = " + b1);
		
		byte b2 = 127;
		b2 = ++b2;	// byte의 최대는 127까지인데 +1을 하면서 128로 범위값을 벗어나므로 순환 적용 됨.
		
		System.out.println("b2 = " + b2);
	}
	
	public static void shortMethod() {
/*		short :	2byte 기억공간
 			  : 32767 ~ -32768까지의 정수 저장
  				위의 값을 벗어나는 값을 갖는 리터럴은 오류 
 				연산결과가 위 범위값을 벗어나면 순환 적용
  				(0,1,2,...,32767, -32768,-32767,...,-1)	*/
		short score = 90;
		System.out.println("score = " + score);
		
		score = (short)(score + 32767);
		System.out.println("score = " + score);
	}
	
	public static void intMethod() {
/*		int  : 	4byte 기억공간
		     : 	2,147,483,647 ~ -2,147,483,648까지의 정수 저장
				위의 값을 벗어나는 값을 갖는 리터럴은 오류 
				연산결과가 위 범위값을 벗어나면 순환 적용
				(0,1,2,...,2147483647, -2147483648,-2147483647,...,-1)	
			 :	기본 정수형	*/
		int num1 = 1000000;
		int num2 = 1000000;
		int res = num1 * num2;
		
		System.out.println("res = " + res);
	}
	
	public static void longMethod() {
/*		long :	8byte 기억공간
		     : 	9,223,372,036,854,775,807 ~ -9,223,372,036,854,775,808 까지의 정수 저장
				위의 값을 벗어나는 값을 갖는 리터럴은 오류 
				연산결과가 위 범위값을 벗어나면 순환 적용
				(0,1,2,...,9223372036854775807, -9223372036854775808,-9223372036854775807,...,-1)
			 :	데이터 뒤에 'L'('l')을 추가함 	*/	
		int n1 = 1000000;
		int n2 = 1000000;
		long res1 = n1 * n2;
		
		long m1 = 1000000L;
		long m2 = 1000000L;
		long res2 = m1 * m2;
		
		System.out.println("res1 = " + res1);
		System.out.println("res2 = " + res2);
	} 
}
