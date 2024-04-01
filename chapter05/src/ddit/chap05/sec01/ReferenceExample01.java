package ddit.chap05.sec01;

public class ReferenceExample01 {

	public static void main(String[] args) {
		Person p1 = new Person("홍길동");
		String st1 = "홍길동";
		String st2 = "홍길동";
		String st3 = new String("홍길동");
		String st4 = new String("홍길동");
		
		if(st1 == st2) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		if(st3 == st4) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		System.out.println(st3);  		//String 안에 toString이 있어서?
	}

}

class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
	
	@Override	//재정의
	public String toString() {
		return name;
	}
}
