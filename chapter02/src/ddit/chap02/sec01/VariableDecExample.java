package ddit.chap02.sec01;

public class VariableDecExample {
	
	static int sum; //��� ������ �ڵ����� 0 ���� �ʱ�ȭ �� 
	
	public static void main(String[] args) {
		int score = 90; 	// score ���� ����, ���� ��������� �ʱ�ȭ
		
		sum = sum + score;
/*		sum += score;	//sum = sum + score  ���� �ǹ� 	*/
		
		System.out.println("sum = " + sum );

	}

}

