package ddit.chap08.sec02;

public class PriorityAllocation implements Scheduler {

	@Override
	public void getNextCall() {
		System.out.println("고객의 등급을 비교하여 가장 높은 등급의 고객전화를 가져온다.");

	}

	@Override
	public void sendCallToAgent() {
		System.out.println("업무수행 능력이 우수한 사원부터 대기열 앞의 상담전화를 분배한다.");

	}

}
