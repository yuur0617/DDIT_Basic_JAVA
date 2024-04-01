package ddit.chap04.sec03;

public class chapter04_3 {

	public static void main(String[] args) {
/*	1-2+3-4 ... -10 = ?*/
		int result = 0;
		for(int i = 1; i < 11; i++) {
			if(i%2 != 0) {
				result = result + i;
				if(i>1) {
					System.out.print("+");
				}
				
			}else {
				result = result - i;
				System.out.print("-");
			}
			System.out.print(i);
		}
		System.out.println();
		System.out.println("result = " + result);
	}
}
