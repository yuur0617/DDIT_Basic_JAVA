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
		System.out.println("�簢���� ����( ���� : " + width + ", ���� : " + height + ") "+
							(width * height));
//		System.out.println(kind + "���� : " + width * height);
	}
}
