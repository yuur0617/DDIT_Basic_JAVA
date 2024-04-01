package ddit.chap06.sec03;

public class GradeExample {

	public static void main(String[] args) {
		Grade g1 = new Grade();
		System.out.println("���� : " + g1.sum());
		System.out.println("��� : " + g1.avg());
		
		Grade g2 = new Grade(100);
		System.out.println("���� : " + g2.sum());
		System.out.println("��� : " + g2.avg());
		
		Grade g3 = new Grade(100, 100);
		System.out.println("���� : " + g3.sum());
		System.out.println("��� : " + g3.avg());
		
		Grade g4 = new Grade(100, 100, 95);
		System.out.println("���� : " + g4.sum());
		System.out.println("��� : " + g4.avg());
	}

}
