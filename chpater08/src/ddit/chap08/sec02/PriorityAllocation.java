package ddit.chap08.sec02;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("���� ����� ���Ͽ� ���� ���� ����� ����ȭ�� �����´�.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("�������� �ɷ��� ����� ������� ��⿭ ���� �����ȭ�� �й��Ѵ�.");

	}

}
