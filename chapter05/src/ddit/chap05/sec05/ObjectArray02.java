package ddit.chap05.sec05;

public class ObjectArray02 {
	Book[] books; // 클래스 객체 배열만 생성

	public static void main(String[] args) {
		new ObjectArray02().init(); // static 안쓰고싶어서 클래스 생성후 메소드 호출

	}

	public void init() {
		books = new Book[] { new Book("왕초보 영어", "EBS", 15000), 
							 new Book("경제인문학", "박정호", 30000),
							 new Book("문과생의 과학공부하기", "유시민", 17000) };

		infoBook();
	}

	public void infoBook() {
		for (Book b : books) {	//타입명 변수명 : 배열명
			System.out.println("--------------------------------");
			System.out.println(b);	//.to String 생략
		}
		System.out.println("--------------------------------");
	}
}
