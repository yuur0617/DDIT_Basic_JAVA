package ddit.chap05.sec02;

public class ArrayExample01 {

	public static void main(String[] args) {
		arrayMethod01();
	}
	
	public static void arrayMethod01() {
/*		������ �迭 10�� ����		*/
		int[] num = null;	//num�� ������ �����̱� ������ 0�� �ƴ϶� null�� �ʱ�ȭ �Ѵ�.
		num = new int[10];
		
		int[] num1 = new int[10];
		
		for(int i=0; i<num1.length; i++) {
			System.out.println("num1[" + i + "] = " + num1[i]);
		}
		
/* 		3���� ��Ҹ� ���� �Ǽ��� �迭�� �����ϰ� 
 		10.5, 30.0, 0.34�� �ʱ�ȭ  		*/
		double[] dvalue = new double[] { 10.5, 30.0, 0.34 };
		
		double[] val = { 10.5, 30.0, 0.34 };
		
		double[] val1 = new double[3];
		val1[0] = 10.5;
		val1[1] = 30.0;
		val1[2] = 0.34;
		
/*		26�� ��Ҹ� ���� ���ڹ迭��  ���ĺ� 'A' ~ 'Z'����  �����ϰ� ����Ͻÿ�.*/
		char[] alpha = new char[26];
		
		for(int i = 0; i<alpha.length; i++) {
			alpha[i] = (char)('A'+ i);
			System.out.printf("%2c", alpha[i]);
		}
	}
}
