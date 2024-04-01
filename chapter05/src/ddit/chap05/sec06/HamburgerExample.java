package ddit.chap05.sec06;

enum Humburger{
	CHICKEN_BURGER(5000),
	BIGMAC(4500),
	CHEESEBURGER(3500);
	
	private final int price;
	
	private Humburger(int price) {
		this.price = price;
	}
	
	public int getPrice() {
		return price;
	}
}

public class HamburgerExample {

	public static void main(String[] args) {
//		Humburger h;
		Humburger[] hamburger = Humburger.values();
		System.out.println("¸Þ  ´º");
		System.out.println("----------------------------");
		for(Humburger burger : hamburger) {
			System.out.println(burger + " : " + burger.getPrice() + "¿ø");
		}
		System.out.println("----------------------------");
		

	}

}
