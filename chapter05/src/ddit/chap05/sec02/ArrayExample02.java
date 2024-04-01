package ddit.chap05.sec02;

import java.util.Random;
import java.util.Scanner;

public class ArrayExample02 {

	int[] lotto = new int[45];
	Random r = new Random();
	
	public static void main(String[] args) {
		new ArrayExample02().lotto();
	}
	/*		lotto��ȣ ����		*/
	public void lotto() {

		for(int i=0; i<lotto.length; i++) {
			lotto[i] = i+1;
		}
		
		Scanner sc = new Scanner(System.in);
		System.out.print("�ݾ� : ");
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
	
	public void shuffle() {	//�迭�� ���°�

		for(int i=0; i<1000000; i++) {
			int rnd = r.nextInt(45);	//0~44������ ����
			int temp = lotto[0];
			lotto[0] = lotto[rnd];
			lotto[rnd] = temp;
		}
	}
}
