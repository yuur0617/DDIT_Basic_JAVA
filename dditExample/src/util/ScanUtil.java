package util;

import java.util.Scanner;

public class ScanUtil {
	
	// ��ƿ��Ƽ ������ �޼����� ��� static�� ���δ�.
	// Math.random() Math.round() System.out.println()
	
	private static Scanner s = new Scanner(System.in);

	public static String nextLine(){
		return s.nextLine();
	}
	
	public static int nextInt(){
		return Integer.parseInt(s.nextLine());
	}
	
	
	
}