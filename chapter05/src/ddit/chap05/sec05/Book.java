package ddit.chap05.sec05;

public class Book {
	private String title;	//책제목	//맴버변수		//private : 외부에서 클래스를 접근할 필요가 없는경우
	private String writer;	//저자
	private int price;		//가격

	public Book(String title, String writer, int price) {	//생성자메서드, 객체 생성?
		this.title = title;		//this : 지역변수와 맴버변수 , 주소값? 생성
		this.writer = writer;
		this.price = price;
	}
	
	@Override		//to String 메서드
	public String toString() {
		String str = "제목 : " + title + "\n";
		str = str + "저자 : " + writer + "\n";
		str = str + "가격 : " + price;
		
		return str;
	}
}
