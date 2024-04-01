package ddit.chap11.sec02;

import java.util.ArrayList;

public class WrapperExample {

	public static void main(String[] args) {
/*		기본타입 => Wrapper	
 		1) 생성자메서드		*/

		Long l1 = new Long(25l);	//생성자 메서드 활용
		Long l2 = 25l;				//오토박싱
		
		long res = 100+l2;			//오토언박싱	//원래는 l2는 class라 연산 불가능
		System.out.println("res = " + res);
		
/* 		2) ValueOf() 메서드		*/
		
		Long l3 = Long.valueOf("25");
		
		long ll3 = l3.longValue();
		long ll4 = Long.parseLong(String.valueOf(ll3));
		
		ArrayList<Long> list = new ArrayList<Long>();
		list.add(l1);
		list.add(l3);
//		list.add("정몽주");
//		list.add(true);
		
		System.out.println(list.toString());
	}

}
