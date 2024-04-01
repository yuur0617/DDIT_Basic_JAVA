package ddit.chap08.sec02;

public class LeastJob implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("다음 상담 전화는 대기열에서 차례대로 가져온다.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("현재 상담하지않고 있는 상담원에 배분하거나, 대기열이 가장 짧은 상담원에게 분배");

	}

}
