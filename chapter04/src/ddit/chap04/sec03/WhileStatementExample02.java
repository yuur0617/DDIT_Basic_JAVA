package ddit.chap04.sec03;

import java.util.Scanner;

public class WhileStatementExample02 {

	public static void main(String[] args) {
		new WhileStatementExample02().init();
	}
	
	public void init() {
		String menu = "*** Ŀ�Ǹ޴� *** \n";
		menu += "1. �Ƹ޸�ī��               2000��\n";
		menu += "2. ī���                  3500��\n";
		menu += "3. ī��� �����߶�        5000��\n";
		menu += "4. �ڹ�Ĩ ������ġ��     6500��\n";
		menu += "5. ���α׷� ����\n";
		
		int sum = 0;
		int exit = 0;
		String bill = "*** ������  ***\n";
		
		while(true) {
			System.out.println(menu);
			Scanner sc = new Scanner(System.in);
			System.out.print("Ŀ�� ���� : ");
			int choice = Integer.parseInt(sc.nextLine());
			
			switch(choice) {
			case 1: 
				sum = sum + 2000;
				bill += "�Ƹ޸�ī��               2000��\n";
				break;
			case 2: 
				sum = sum + 3500;
				bill += "ī���                  3500��\n";
				break;
			case 3: 
				sum = sum + 5000;
				bill += "ī��� �����߶�        5000��\n";
				break;
			case 4: 
				sum = sum + 6500;
				bill += "�ڹ�Ĩ ������ġ��     6500��\n";
				break;
			case 5: 
				exit = -1;
				break;
			default : 
				System.out.println("�޴������� �߸��Ǿ����ϴ�.");				
			}
			if(exit == -1) {
				System.out.println("���α׷� ����");
				break;
			}
		}
		
		bill += "----------------------------------\n";
		bill +=" �� �հ�                   " + sum + "��";
		System.out.println(bill);
	}

}
