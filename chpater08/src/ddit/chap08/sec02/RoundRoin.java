package ddit.chap08.sec02;

public class RoundRoin implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("���� ��� ��ȭ�� ��⿭���� ���ʴ�� �����´�.");
	}
	
	@Override
	public void sendCallToAgent() {
		System.out.println("��⿭���� ������ ��ȭ�� ���� �������� ���ʴ�� �й��Ѵ�.");
	}
}
