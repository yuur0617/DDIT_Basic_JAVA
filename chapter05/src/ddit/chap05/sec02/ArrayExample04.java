package ddit.chap05.sec02;

import java.util.Arrays;

public class ArrayExample04 {

	public static void main(String[] args) {
/*		�ֻ����� 50�� ���� ���� ���� ���� �����Ͽ� ������׷��� �ۼ��Ͻÿ�.		*/
		Dice d = new Dice();
		System.out.println(Arrays.toString(d.dice));
		d.histogram();
	}
}

class Dice{
	int[] dice = new int[6];

	Dice() {
		for(int i=0; i<60; i++) {
			int r = (int)(Math.random()*6)+1; //1~6������ ����
			dice[r-1]++;
		}
	}
	
	public void histogram() {
		for(int i=0; i<dice.length; i++) {
			System.out.print(i+1 + " | ");
			for(int j=0; j<dice[i]; j++) {
				System.out.print("#");
			}
			System.out.println(" " + dice[i]);
		}
	}
}
