package ddit.chap06.homework01;

public class Rectangle {
	Point p;
	int width;
	int height;
	
	Rectangle(Point p, int width, int height){
		this.p=p;
		this.width = width;
		this.height = height;		
	}
	
	Point getPoint() {
		int x1 = p.x + width;
		int y1 = p.y + height;
		return new Point(x1,y1);
	}
}

class Point{
	int x;
	int y;
	
	Point(int x, int y){
		this.x = x;
		this.y = y;
	}
}
