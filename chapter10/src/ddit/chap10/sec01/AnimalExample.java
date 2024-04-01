package ddit.chap10.sec01;

public class AnimalExample {

	public static void main(String[] args) {
		Animal animal = new Dog();	//upcast
		//dowmcast
//		if(animal instanceof Dog) {
//			Dog dog = (Dog)animal;
//			System.out.println(dog.name);
//		}
//		if(animal instanceof Cat) {
//			Cat cat = (Cat)animal;
//			System.out.println(cat.name);
//		}else {
//			System.out.println("downcast ÇÒ¼ö ¾øÀ½");
//		}
		
		Cat cat = (Cat)animal;
	}

}

abstract class Animal{
	
}

class Dog extends Animal{
	String name = "´ó¸ÛÀÌ";
}

class Cat extends Animal{
	
}