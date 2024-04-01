package ddit.chap07.sec01;

public class shapeExample {

	public static void main(String[] args) {
		Circle circle = new Circle();
		circle.kind = "타원";
		circle.radius = 12.5;
		
		circle.getArea();
		
		Circle circle1 = new Circle("반원", 30.5);
		circle1.getArea();
		
		Shape s1 = new Shape("오각형");
		
		Rectangle Rec = new Rectangle("사각형", 52, 17);
		Rec.getArea();
		
		Triangle Tri = new Triangle("삼각형", 15, 3);
		Tri.getArea();	
	}
}
