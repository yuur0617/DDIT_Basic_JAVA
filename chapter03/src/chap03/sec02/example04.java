package chap03.sec02;

public class example04 {

	public static void main(String[] args) {
		int pencils = 534;
		int student = 30;
		
		int pencilsPerStudent = pencils / student;
		System.out.println(pencilsPerStudent);
		
		int pencilsLeft = pencils % student;
		System.out.println(pencilsLeft);
	}

}
