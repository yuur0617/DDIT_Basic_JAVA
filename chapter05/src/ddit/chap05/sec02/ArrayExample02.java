package ddit.chap05.sec02;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample02 {

	int[] lotto = new int[45];
	Random r = new Random();
	
	public static void main(String[] args) {
		new ArrayExample02().lotto();
	}
	/*		lotto번호 생성		*/
	public void lotto() {

		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("금액 : ");
		int money = sc.nextInt();
		
		for(int i=1; i<=money/1000; i++) {
			shuffle();
			System.out.print(i + ":");
			for(int j=0; j<6; j++) {
				System.out.printf(" %5d ", lotto[j]);
			}
			System.out.println();
		}
	}
	
	public void shuffle() {	//배열을 섞는곳

		for(int i=0; i<1000000; i++) {
			int rnd = r.nextInt(45);	//0~44사이의 난수
			int temp = lotto[0];
			lotto[0] = lotto[rnd];
			lotto[rnd] = temp;
		}
	}
}
