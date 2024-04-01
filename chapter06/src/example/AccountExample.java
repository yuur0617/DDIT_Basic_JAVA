package example;

import java.util.Scanner;

public class AccountExample {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		String name;
		
		long amount = 0;	//�ݾ�
		int selectNo;		//�����׸�
		
		boolean run = true;
		Account ac1 = new Account(amount);
		
		System.out.print("�̸��� �Է��ϼ��� : " );
		name = sc.nextLine();
		ac1.setOwner(name);
		
		System.out.println(ac1.getOwner()+ " ���� �ݰ����ϴ�. ");

		while(run) {
			System.out.println("----------------------------------");
			System.out.println("1.���� | 2.���� | 3.�ܰ�Ȯ�� | 4.���� ");
			System.out.println("----------------------------------");
			System.out.print("����>");
			selectNo = Integer.parseInt(sc.nextLine());
			//����
			if(selectNo == 1) {
				System.out.println(ac1.getOwner() + " ������ ���� �ܰ� : " +  ac1.getBalance() + "��");
				System.out.print("������ �ݾ��� �������� : ");
				amount = Long.parseLong(sc.nextLine());
				if(amount > 0) {
					System.out.println("�ܰ� : " + ac1.deposit(amount));
				}else {
					System.out.println("�߸��� ���Դϴ�.");	//����ó��
				}
			}
			//����
			else if(selectNo == 2) {
				System.out.println(ac1.getOwner() + " ������ ���� �ܰ� : " + ac1.getBalance() + "��");
				System.out.print("������ �ݾ��� �������� : ");
				amount = Long.parseLong(sc.nextLine());
				if(amount >0) {
					if(ac1.getBalance() < amount) {
						 System.out.println("�ܰ� �����Ͽ� �����Ҽ������ϴ�.");	//����ݾ��� �ܰ�ݾ׺��� Ŭ���
					}else {
						System.out.println("�ܰ� : " + ac1.withdraw(amount));
					}
				}else {
					System.out.println("�߸��� ���Դϴ�.");	//����ó��
				}
			}
			//�ܰ�Ȯ��
			else if(selectNo == 3) {
				System.out.println(ac1.getOwner() + " ������ ���� �ܰ� : " + ac1.getBalance() + "��" );
			}
			//���α׷� ����
			else if(selectNo == 4) {
				System.out.println("�ý����� �����մϴ�.");
				run = false;
			}
			//����ó��
			else System.out.println("�߸��Է��Ͽ����ϴ�.");
		}
	}
}
