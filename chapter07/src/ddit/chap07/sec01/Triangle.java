package ddit.chap07.sec01;

public class Triangle extends Shape{
	double width;
	double height;
	
	public Triangle(String kind, double width, double height) {
		super(kind);
		this.width = width;
		this.height = height;
	}
	
	Triangle(){}
	
	@Override
	public void getArea() {
		System.out.println("삼각형의 면적( 가로 : " + width + ", 세로 : " + height + ") "+
							(width * height)/2);
//		System.out.println(kind + "면적 : " + width * height / 2);
	} 
}
