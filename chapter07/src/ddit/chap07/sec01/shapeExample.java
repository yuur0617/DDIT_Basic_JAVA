package ddit.chap07.sec01;

public class shapeExample {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.kind = "Ÿ��";
		circle.radius = 12.5;
		
		circle.getArea();
		
		Circle circle1 = new Circle("�ݿ�", 30.5);
		circle1.getArea();
		
		Shape s1 = new Shape("������");
		
		Rectangle Rec = new Rectangle("�簢��", 52, 17);
		Rec.getArea();
		
		Triangle Tri = new Triangle("�ﰢ��", 15, 3);
		Tri.getArea();	
	}
}
