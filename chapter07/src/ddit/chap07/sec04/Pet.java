package ddit.chap07.sec04;

public abstract class Pet {
	int age;
	
	Pet(int age){
		this.age = age;
	}
	abstract void walk();
	abstract void eat();
	
	void run() {
		System.out.println("´Þ¸®´Ù");
	}
}
