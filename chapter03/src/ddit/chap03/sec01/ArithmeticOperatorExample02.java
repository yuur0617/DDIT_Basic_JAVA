package ddit.chap03.sec01;
/*		입력		|			출력	
  	A		B	|	AND		OR		EX-OR
 	0		0	|	 0		 0		  0
  	0		1	|	 0		 1		  1
  	1		0	|	 0		 1		  1	
  	1		1	|	 1		 1		  0
  */
public class ArithmeticOperatorExample02 {
	public static void main(String[] args) {
//		logicalOperator();
		bitwise();
	}
	
	public static void logicalOperator() {
/*		논리 연산자 : !(NOT), &&(AND), ||(OR) */
		char ch = '0';
		int num = 100;
		
		System.out.println((int)'0');
		System.out.println((int)'a');
		
		boolean flag = ch >'a'&& num !=50;
		System.out.println("and => flag = " + flag);
		
		boolean flag2 = ch >'a'|| num !=50;
		System.out.println("and => flag = " + flag2);
	}
	public static void bitwise() {
/*		비트 연산자	: & , | , ^ 
 				: 같은 위치의 비트별로 AND, OR, EX-OR 연산
 				: 결과는 숫자자료로 반환 */
		int val1 = 27;
		int val2 = 19;
		
		System.out.println("비트별 AND : " + (val1 & val2));
		System.out.println("비트별 AR : " + (val1 | val2));
		System.out.println("비트별 EX-OR : " + (val1 ^ val2));
		
	}
}

