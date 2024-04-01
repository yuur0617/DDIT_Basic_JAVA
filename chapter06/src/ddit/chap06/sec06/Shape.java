package ddit.chap06.sec06;

public /*final*/ class Shape {
	String kind;
	
	Shape(String kind){
		this.kind = kind;
	}
	
	public /*final*/ void getArea() {
		System.out.println("도형의 종류 : " + kind);
	}
}
