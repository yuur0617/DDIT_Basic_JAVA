package ddit.chap05.sec01;

public class ReferenceExample01 {

	public static void main(String[] args) {
		Person p1 = new Person("ȫ�浿");
		String st1 = "ȫ�浿";
		String st2 = "ȫ�浿";
		String st3 = new String("ȫ�浿");
		String st4 = new String("ȫ�浿");
		
		if(st1 == st2) {
			System.out.println("���� �ּ�");
		}else {
			System.out.println("�ٸ� �ּ�");
		}
		
		if(st3 == st4) {
			System.out.println("���� �ּ�");
		}else {
			System.out.println("�ٸ� �ּ�");
		}
		
		System.out.println(st3);  		//String �ȿ� toString�� �־?
	}

}

class Person{
	String name;
	
	Person(String name){
		this.name = name;
	}
	
	@Override	//������
	public String toString() {
		return name;
	}
}
