package chap04.sec01;

import java.util.Random;
import java.util.Scanner;

public class chapter04_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random game = new Random();
		
		System.out.print("����(=1) ����(=2) ��(=3)�� �Է��ϼ��� : ");
		int p = sc.nextInt();	
		int pp = game.nextInt(3)+1;
		
		String result = "";
		String a = "";
		String b = "";
		
		if(p == 1) {
			a = "(����)";
		}else if (p == 2) {
			a = "(����)";
		}else if (p == 3) {
			a = "(��)";
		}
		
		if(pp == 1) {
			b = "(����)";
		}else if (pp == 2) {
			b = "(����)";
		}else if (pp == 3) {
			b = "(��)";
		}
		
		switch(p) {
		case 1 :
			if(p == 1) {
				result = "���º�";
			}else if(p == 2) {
				result = "��";
			}else if(p == 3) {
				result = "��";
			}
			break;
			
		case 2 :
			if(p == 1) {
				result = "��";
			}else if(p == 2) {
				result = "���º�";
			}else if(p == 3) {
				result = "��";
			}
			break;
			
		case 3 :
			if(p == 1) {
				result = "��";
			}else if(p == 2) {
				result = "��";
			}else if(p == 3) {
				result = "���º�";
			}
			break;	
		default: System.out.println("�߸��Է��Ͽ����ϴ�.");
		}
		
		if(p == 1|| p==2 || p==3) {
			System.out.println("�� �� : " + p + a +" vs ��ǻ�� �� : " + pp + b + "\n��� : " + result);
		}
	}
}
