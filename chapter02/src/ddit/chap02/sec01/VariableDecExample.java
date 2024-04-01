package ddit.chap02.sec01;

public class VariableDecExample {
	
	static int sum; //멤버 변수로 자동으로 0 으로 초기화 함 
	
	public static void main(String[] args) {
		int score = 90; 	// score 변수 선언, 지역 변수선언과 초기화
		
		sum = sum + score;
/*		sum += score;	//sum = sum + score  같은 의미 	*/
		
		System.out.println("sum = " + sum );

	}

}

