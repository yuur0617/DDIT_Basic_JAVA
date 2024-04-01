package chap04.sec01;

import java.util.Random;
import java.util.Scanner;

public class chapter04_1 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Random game = new Random();
		
		System.out.print("가위(=1) 바위(=2) 보(=3)를 입력하세요 : ");
		int p = sc.nextInt();	
		int pp = game.nextInt(3)+1;
		
		String result = "";
		String a = "";
		String b = "";
		
		if(p == 1) {
			a = "(가위)";
		}else if (p == 2) {
			a = "(바위)";
		}else if (p == 3) {
			a = "(보)";
		}
		
		if(pp == 1) {
			b = "(가위)";
		}else if (pp == 2) {
			b = "(바위)";
		}else if (pp == 3) {
			b = "(보)";
		}
		
		switch(p) {
		case 1 :
			if(p == 1) {
				result = "무승부";
			}else if(p == 2) {
				result = "패";
			}else if(p == 3) {
				result = "승";
			}
			break;
			
		case 2 :
			if(p == 1) {
				result = "승";
			}else if(p == 2) {
				result = "무승부";
			}else if(p == 3) {
				result = "패";
			}
			break;
			
		case 3 :
			if(p == 1) {
				result = "패";
			}else if(p == 2) {
				result = "승";
			}else if(p == 3) {
				result = "무승부";
			}
			break;	
		default: System.out.println("잘못입력하였습니다.");
		}
		
		if(p == 1|| p==2 || p==3) {
			System.out.println("내 패 : " + p + a +" vs 컴퓨터 패 : " + pp + b + "\n결과 : " + result);
		}
	}
}
