package ddit.chap05.sec03;

import java.util.Random;

public class TwoDimArray02 {

	public static void main(String[] args) {
		Dice d = new Dice();				//생성자
		d.setDice();
		char[][] ch = d.convertArray();		//ch배열에 concertArray에 반환한 값을 넣어준다.
		d.showHisto(ch); 					//char[][] ch를 받음
	}

}

class Dice{
	int[] dice = new int[6];			//각의 눈의 수를 저장	//Dice클래스의 맴버변수
	Random rnd = new Random();			//난수 객체 생성
	char[][] histo;				//배열생성
	
	//주사위를 50번 던져 나온 눈의 수를 구하는 인스턴스메소드
	public void setDice() {				
		for(int i=0; i<50; i++) {		//주사위 50번을 던지는 for문
			int r=rnd.nextInt(6)+1;		//난수를 r에 저장
			dice[r-1]++;				//난수에 해당하는 인덱스의 값을 +1
		}
	}
	
	//행의 수를 구하는 인스턴스메소드
	public char[][] convertArray() {				//배열을 반환하기위해 자료형을 반환타입으로 변경
		int countOfRow = dice[0];					//임시최대값변수		
		for(int i=1; i<dice.length; i++) {
			if(countOfRow < dice[i]) 	
				countOfRow = dice[i];				//행의 최대값을 countOfRow변수에 저장
			
		}
		histo = new char[countOfRow][6];	//[countOfRow][6]을 크기로한 (histo)이차원배열 생성
		
		for(int i=0; i<dice.length; i++) {
			for(int j=0; j<dice[i]; j++) {
				histo[j][i] = '*';
			}
		}
		return histo;								//배열 반환
	}
	
	//histo를 출력하기위한 메소드
	public void showHisto(char[][] ch) {			//출력자료형과 같은 타입을 괄호안에 적는다.
		for(int i=ch.length-1; i>= 0; i--) {		//ch.length = 최대값 
			for(int j=0; j<ch[i].length; j++) {
				System.out.print(ch[i][j]+"\t");
			}
			System.out.println();
		}
		System.out.println("------------------------------------------");
		for(int i=1; i<7; i++) {
			System.out.print(i + "\t");
		}
	}
	
}