package ddit.chap07.sec04;

public class PetExample {

	public static void main(String[] args) {
		Dog d1 = new Dog(7,"�����");
		d1.eat();
		d1.walk();
		System.out.println("���� : " + d1.age);
		
		Pet p = new Dog(5, "�۹���");
		p.eat();
		p.walk();
		System.out.println("���� : " + p.age);
		
		Pet p1 = new Rabbit();
		System.out.println("���� : " + p1.age);

	}

}
