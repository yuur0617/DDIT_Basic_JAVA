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
//			System.out.println("오류발생 : 클래스를 찾을수없습니다.");
//		}
		init();
	}
	public static void init() {
		try {
		exceptionMethod01();
		}catch(ArithmeticException e) {
			System.out.println("산술연산오류");
			System.out.println("합계 : " + sum);
			System.out.println("평균 : " + sum/10);
		}catch(ClassNotFoundException e) {
			System.out.println("클래스 부존재 오류");
		}catch(Exception e) {
			System.out.println("모든 오류");
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
//			System.out.println("수치변환 예외발생");
//			System.out.println("합계 : " + sum);
//			System.out.println("평균 : " + avg);
//		}catch(ArrayIndexOutOfBoundsException e) {
//			System.out.println("배열 첨자 예외발생");
//			System.out.println("합계 : " + sum);
//			System.out.println("평균 : " + avg);
//		}catch(Exception e) {
//			System.out.println("모든 예외발생");
//			System.out.println("합계 : " + sum);
//			System.out.println("평균 : " + avg);
//		}
		
		System.out.println("프로그램 수행 종료");
	}
}
