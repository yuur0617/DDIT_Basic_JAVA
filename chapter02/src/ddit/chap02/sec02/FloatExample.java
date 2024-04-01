package ddit.chap02.sec02;
/*	�Ǽ��� : float(4byte), double(�⺻��, 8byte)	*/
public class FloatExample {

	public static void main(String[] args) {
//		floatMethod();
		doubleMethod();
	}
	public static void floatMethod() {
/*		float :	4byte(1 bit : ��ȣ, 8bit : ����)
  		23bit :	����(�Ҽ��� ������ ��) 
  		1.4e-45 ~ 3.4e+38 (long Ÿ�Ժ��� ū ũ���� ������ ����)
  		������ ���� 'F'('f')�� ����Ͽ� float type���� �����Ϸ����� �˷�����. */
		float pi = 3.1415926F;
		int radius = 15; //�������� 15
		
		System.out.println("���� ���� = " + (radius*radius*pi));
		System.out.println("���� �ѷ� = " + (2*radius*pi));
	}
	
	public static void doubleMethod() {
/*		double   :	8byte(1 bit : ��ȣ, 11bit : ����)
  		52bit 	 :	����(�Ҽ��� ������ ��) 
  		1.9e-324 ~ 1.8e+308 (long Ÿ�Ժ��� ū ũ���� ������ ����)
  		������ ���� 'D'('d')�� ����ϰų� �����Ҽ�����. */
		double d1 = 0.1;
		double d2 = 0.1f; //float Ÿ���� doubleŸ������ ����
		
		System.out.println("d1 = " + d1);
		System.out.println("d2 = " + d2);
	}
}
 