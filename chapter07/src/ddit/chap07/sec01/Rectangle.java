package ddit.chap07.sec01;

public class Rectangle extends Shape{
	private int width;
	private int height;
	
	Rectangle(){}
	
	Rectangle(String kind, int width, int height){
		super(kind);
		this.width = width;
		this.height = height;
	}
	
	@Override
	public void getArea() {
		System.out.println("사각형의 면적( 가로 : " + width + ", 세로 : " + height + ") "+
							(width * height));
//		System.out.println(kind + "면적 : " + width * height);
	}
}
