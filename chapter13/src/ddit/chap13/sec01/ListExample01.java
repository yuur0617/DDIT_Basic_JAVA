package ddit.chap13.sec01;

import java.util.ArrayList;
import java.util.Iterator;

public class ListExample01 {

	public static void main(String[] args) {
		ArrayList list = new ArrayList();
		
		list.add("홍길동");		//오토박싱
		list.add(90);
		list.add(23.56);

		list.add(new Student(2302301L, "이성계"));
		
		System.out.println(list);
		
		System.out.println("-----------------------------------");
		System.out.println(list.contains("홍길동"));	//true
		System.out.println(list.contains("홍길순"));	//false
		
		System.out.println("-----------------------------------");
/*		전체조회		*/
		for(int i=0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
		System.out.println("-----------------------------------");
		System.out.println("[[ 가능이 강화된 for문 사용 ]]");
		for(Object obj : list) {
			System.out.println(obj);
		}
		
		System.out.println("-----------------------------------");
		System.out.println("[[ interator 사용  ]]");
		Iterator iter = list.iterator();
		while(iter.hasNext()) {
			Object obj = iter.next();
			System.out.println(obj);
		}
	}

}

class Student{
	String name;
	long stdId;	//학번

	Student(long stdId, String name){
		this.stdId = stdId;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return stdId + "=>" + name;
	}
}