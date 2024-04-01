package ddit.chap02.sec02;

/* ���� : byte(1byte), short(2byte), int(�⺻��, 4byte), long(8byte) */

public class IntegerExample {

	public static void main(String[] args) {
//		byteMethod();
//		shortMethod();
//		intMethod();
		longMethod();
	}
	
	public static void byteMethod() {
/*		byte : 	1byte ������
 			 : 	127 ~ -128 ������ ���� ����
 				���� ���� ����� ���� ���� ���ͷ��� ���� 
 				�������� �� �������� ����� ��ȯ ����
 				(0,1,2, ... ,127,-128,-127,...,-1) */
		byte b1 = 120;
		System.out.println("b1 = " + b1);
		
		byte b2 = 127;
		b2 = ++b2;	// byte�� �ִ�� 127�����ε� +1�� �ϸ鼭 128�� �������� ����Ƿ� ��ȯ ���� ��.
		
		System.out.println("b2 = " + b2);
	}
	
	public static void shortMethod() {
/*		short :	2byte ������
 			  : 32767 ~ -32768������ ���� ����
  				���� ���� ����� ���� ���� ���ͷ��� ���� 
 				�������� �� �������� ����� ��ȯ ����
  				(0,1,2,...,32767, -32768,-32767,...,-1)	*/
		short score = 90;
		System.out.println("score = " + score);
		
		score = (short)(score + 32767);
		System.out.println("score = " + score);
	}
	
	public static void intMethod() {
/*		int  : 	4byte ������
		     : 	2,147,483,647 ~ -2,147,483,648������ ���� ����
				���� ���� ����� ���� ���� ���ͷ��� ���� 
				�������� �� �������� ����� ��ȯ ����
				(0,1,2,...,2147483647, -2147483648,-2147483647,...,-1)	
			 :	�⺻ ������	*/
		int num1 = 1000000;
		int num2 = 1000000;
		int res = num1 * num2;
		
		System.out.println("res = " + res);
	}
	
	public static void longMethod() {
/*		long :	8byte ������
		     : 	9,223,372,036,854,775,807 ~ -9,223,372,036,854,775,808 ������ ���� ����
				���� ���� ����� ���� ���� ���ͷ��� ���� 
				�������� �� �������� ����� ��ȯ ����
				(0,1,2,...,9223372036854775807, -9223372036854775808,-9223372036854775807,...,-1)
			 :	������ �ڿ� 'L'('l')�� �߰��� 	*/	
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
