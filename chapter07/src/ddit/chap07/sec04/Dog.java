package ddit.chap07.sec04;

public class Dog extends Pet {
	String name;
	
	Dog(int age, String name){
		super(age);
		this.name = name;
	}
	
	@Override
	void walk() {
		System.out.println(name + "�׹߷� �ٴѴ�. ��! =33 ");
	}

	@Override
	void eat() {
		System.out.println( "������ ���� ��Ḧ �Դ´�.");

	}

}
