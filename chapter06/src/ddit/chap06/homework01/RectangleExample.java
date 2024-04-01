package ddit.chap06.homework01;

public class RectangleExample {

	public static void main(String[] args) {
		Rectangle[] r = { new Rectangle(new Point(10,15),100,150),
				  new Rectangle(new Point(50,50),75,60),
				  new Rectangle(new Point(15,75),80,30)};
		isContatin(r);
	}

	static void isContatin(Rectangle[] r) {
		for(int i =1; i<r.length; i++) {
			if((r[0].p.x <= r[i].p.x && r[0].p.y <= r[i].p.y)&&
				(r[0].getPoint().x >= r[i].getPoint().x && r[0].getPoint().y >= r[i].getPoint().y)) {
				System.out.println("첫번째 사각형은 " + (i+1) + "번재 사각형을 포함하고 있습니다.");	
			}else {
				System.out.println("첫번째 사각형은 " + (i+1) + "번재 사각형을 포함하고 있지 않습니다.");
			}
		}

	}

}
