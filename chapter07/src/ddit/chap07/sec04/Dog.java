package ddit.chap07.sec04;

public class Dog extends Pet {
	String name;
	
	Dog(int age, String name){
		super(age);
		this.name = name;
	}
	
	@Override
	void walk() {
		System.out.println(name + "네발로 다닌다. 명! =33 ");
	}

	@Override
	void eat() {
		System.out.println( "강아지 전용 사료를 먹는다.");

	}

}
