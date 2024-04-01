package ddit.chap03.sec01;
/*		�Է�		|			���	
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
/*		�� ������ : !(NOT), &&(AND), ||(OR) */
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
/*		��Ʈ ������	: & , | , ^ 
 				: ���� ��ġ�� ��Ʈ���� AND, OR, EX-OR ����
 				: ����� �����ڷ�� ��ȯ */
		int val1 = 27;
		int val2 = 19;
		
		System.out.println("��Ʈ�� AND : " + (val1 & val2));
		System.out.println("��Ʈ�� AR : " + (val1 | val2));
		System.out.println("��Ʈ�� EX-OR : " + (val1 ^ val2));
		
	}
}

