package ddit.chap05.sec05;

public class ObjectArray01 {

	public static void main(String[] args) {
/*		���� ��ǥ�� ǥ���ϴ� Ŭ����(point)�� �����ϰ� �̸� �̿��Ͽ� 
 		�ﰢ��, �簢��, ���� ������ ����Ͻÿ�.					*/		
//		Triangle t1 = new Triangle(new Point(100, 200), new Point(600, 200), new Point(350,500));
		
//		Point p1 = new Point(100, 200);
//		Point p2 = new Point(600, 200);
//		Point p3 = new Point(350, 500);
//		Triangle t1 = new Triangle(p1, p2, p3);

		Point[] point = {new Point(100, 200), new Point(600, 200), new Point(350,500)};
		Triangle t1 = new Triangle(point);
		
		t1.draw();
		

	}
}

class Point {
	private int x;
	private int y;
	
	Point(int x, int y){	//Point�޼��尡 ���ɶ� ����	 //Point(10,20) <- ���๮
		this.x = x;			//�޼������ ���� > �ɹ�����
		this.y = y;			//this : ����ƮŬ������ �ּ�? ����������? �ɹ������� ��Ī��
	}
	
	@Override				//������	//������̼�	//override�� ������ �ּҷ� ����
	public String toString() {
		return "(" + x + "," + y + ")";
	}
}

class Triangle{
//	Point p1;		//p1.toString?
//	Point p2;
//	Point p3;
//	
//	Triangle(Point p1, Point p2, Point p3){
//		this.p1 = p1;
//		this.p2 = p2;
//		this.p3 = p3;
//	}
//	
//	public void draw() {
//		System.out.println("��" + p1 + "���� ��" + p2 + "���� drawLine()�� �����Ѵ�");
//		System.out.println("��" + p2 + "���� ��" + p3 + "���� drawLine()�� �����Ѵ�");
//		System.out.println("��" + p3 + "���� ��" + p1 + "���� drawLine()�� �����Ѵ�");
//	}
	Point[] point = new Point[3];	//����Ʈ��ü�� ���� �迭�� ����
	
	Triangle(Point[] point) {
		this.point = point;
	}
	
	public void draw() {
		System.out.println("��" + point[0] + "���� ��" + point[1] + "���� drawLine()�� �����Ѵ�");
		System.out.println("��" + point[1] + "���� ��" + point[2] + "���� drawLine()�� �����Ѵ�");
		System.out.println("��" + point[2] + "���� ��" + point[0] + "���� drawLine()�� �����Ѵ�");
	}
	

}
