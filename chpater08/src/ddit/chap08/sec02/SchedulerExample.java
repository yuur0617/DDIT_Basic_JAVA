package ddit.chap08.sec02;

import java.io.IOException;

public class SchedulerExample {

	public static void main(String[] args) throws IOException{
		System.out.println("상담전화 분배 방식 선택");
		System.out.println("R : 순서대로 분배");
		System.out.println("L : 짧은 대기열의 상담원에게 분배");
		System.out.println("P : 우선순위가 높은 고객부터 할당");
		
//		try {
//			int c = System.in.read();
//		}catch(IOException e) {
//			
//		}

		int c = System.in.read();	//한글자를 입력받아 int로 저장
		Scheduler scheduler = null;
		
		if(c == 'R' || c == 'r') {
			scheduler = new RoundRoin();
		}else if( c == 'L' || c == 'l') {
			scheduler = new LeastJob();
		}else if( c == 'P' || c == 'p') {
			scheduler = new PriorityAllocation();
		}else {
			System.out.println("분배방식 선택이 잘못됐습니다.");
		}
		
		scheduler.getNextCall();
		scheduler.sendCallToAgent();
	}

}
