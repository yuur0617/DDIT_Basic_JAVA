package ddit.chap07.sec01;

public class Shape {
	String kind;	//종류
	
	Shape(){}
	
	//생성자
	public Shape(String kind) {
		this.kind = kind;
	}
	
	//도형의 면적을 구하는 메서드 but. 어떤도형인지 정의하지않아 공식을 쓰지않는다.
	public void getArea() {
		System.out.println("도형의 면적을 구합니다.");
	}
	
	@Override	//어노테이션	//도형이름 출력
	public String toString() {
		return kind; 
	}
}
