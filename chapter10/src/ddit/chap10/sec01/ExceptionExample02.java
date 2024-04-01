package ddit.chap10.sec01;

public class ExceptionExample02 {
	static int sum = 0;
	static int avg = 0;
	public static void main(String[] args) {
//		try {
//			Class.forName("java.lang.object");
//		}catch(ClassNotFoundException e) {
//			e.printStackTrace();
//		}catch(Exception e) {
//			System.out.println("�����߻� : Ŭ������ ã���������ϴ�.");
//		}
		init();
	}
	public static void init() {
		try {
		exceptionMethod01();
		}catch(ArithmeticException e) {
			System.out.println("����������");
			System.out.println("�հ� : " + sum);
			System.out.println("��� : " + sum/10);
		}catch(ClassNotFoundException e) {
			System.out.println("Ŭ���� ������ ����");
		}catch(Exception e) {
			System.out.println("��� ����");
		}
	}
	public static void exceptionMethod01() throws ArithmeticException, ClassNotFoundException, Exception {
		
		int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
		sum = 0;
		int d = 0;
		for(int i=0; i<score.length; i++) {
			d = i+1;
			if(i == 7) d=0;
			sum = sum+score[i]/d;
		}
		avg = sum/score.length;
		
//		try {
//			int[] score = {10, 20, 30, 40, 50, 60, 70, 80, 90, 100};
//			sum = 0;
//			int d = 0;
//			for(int i=0; i<score.length; i++) {
//				d = i+1;
//				if(i == 7) d=0;
//				sum = sum+score[i]/d;
//			}
//			avg = sum/score.length;
//		}catch(ArithmeticException e) {
//			System.out.println("��ġ��ȯ ���ܹ߻�");
//			System.out.println("�հ� : " + sum);
//			System.out.println("��� : " + avg);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("�迭 ÷�� ���ܹ߻�");
//			System.out.println("�հ� : " + sum);
//			System.out.println("��� : " + avg);
//		}catch(Exception e) {
//			System.out.println("��� ���ܹ߻�");
//			System.out.println("�հ� : " + sum);
//			System.out.println("��� : " + avg);
//		}
		
		System.out.println("���α׷� ���� ����");
	}
}
