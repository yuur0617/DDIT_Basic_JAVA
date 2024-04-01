package chap04.sec02;

public class chapter04_2 {

	public static void main(String[] args) {
		int num1 = 1;
		int num2 = 1;
		int num3 = 0;
		
		System.out.print(num1 + " " + num2);

		for(; ; ) {
			num3 = num1 + num2;
			int temp = num1;
			num1 = num2;
			num2 = num3;
			if(num1 > 50) {
				break;
			}
			System.out.print(" ");
			System.out.print(num3);
		}
	}
}
