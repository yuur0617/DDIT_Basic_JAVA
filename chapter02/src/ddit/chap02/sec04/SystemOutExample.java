package ddit.chap02.sec04;

public class SystemOutExample {

	public static void main(String[] args) {
		System.out.println("12345678901234567890");
		System.out.printf("%5d%6.2f\n", 10, 5.326);
		
		System.out.printf("%10s\n","대전시");
		System.out.printf("%-10s\n","대전시");
		
		System.out.printf("%10s\n","Daejeon");
		System.out.printf("%-10s","Daejeon");
		
		
		System.out.print("대전시 ");
		System.out.print("중구 계룡로 846");
	}
}


