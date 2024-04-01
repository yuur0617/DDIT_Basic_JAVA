package ddit.chap08.sec02;

import java.io.IOException;

public class SchedulerExample {

	public static void main(String[] args) throws IOException{
		System.out.println("�����ȭ �й� ��� ����");
		System.out.println("R : ������� �й�");
		System.out.println("L : ª�� ��⿭�� �������� �й�");
		System.out.println("P : �켱������ ���� ������ �Ҵ�");
		
//		try {
//			int c = System.in.read();
//		}catch(IOException e) {
//			
//		}

		int c = System.in.read();	//�ѱ��ڸ� �Է¹޾� int�� ����
		Scheduler scheduler = null;
		
		if(c == 'R' || c == 'r') {
			scheduler = new RoundRoin();
		}else if( c == 'L' || c == 'l') {
			scheduler = new LeastJob();
		}else if( c == 'P' || c == 'p') {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("�й��� ������ �߸��ƽ��ϴ�.");
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
