package chap05.sec02;

import java.util.Scanner;

public class example06 {

	public static void main(String[] args) {
		boolean run = true;
		int studentNum = 0;
		int[] scores = null;
		Scanner sc = new Scanner(System.in);
		
		while(run) {
			System.out.println("----------------------------------------------");
			System.out.println("1.�л��� | 2.�����Է� | 3.��������Ʈ | 4.�м� | 5.����");
			System.out.println("----------------------------------------------");
			System.out.print("����>");
		
			int selectNo = Integer.parseInt(sc.nextLine());
		
			if(selectNo == 1) {
				System.out.print("�л���>");
				studentNum = Integer.parseInt(sc.nextLine());
				scores = new int[studentNum];
			}else if(selectNo == 2) {
				for(int i=0; i<scores.length; i++) {
					System.out.print("scores[" + i + "]>");
					scores[i] = Integer.parseInt(sc.nextLine());
				}
			}else if(selectNo == 3) {
				for(int i=0; i<scores.length; i++) {
					System.out.println("scores[" + i + "]>" + scores[i]);
				}
			}else if(selectNo == 4) {
				int max = 0;
				int sum = 0;
				double avg = 0.0;
			
				for(int i=0; i<scores.length; i++) {
					if(max < scores[i]) {
						max = scores[i];
					}				
					sum += scores[i];
					avg = (double)sum/studentNum;

				}
				System.out.println("�ְ� ����: " + max);
				System.out.println("��� ����: " + avg);			
			}else if(selectNo == 5) {
				run = false;
			}
		}
		System.out.println("���α׷� ����");

	}

}
