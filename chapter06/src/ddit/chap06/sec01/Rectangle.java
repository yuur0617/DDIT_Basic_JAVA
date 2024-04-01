package ddit.chap06.sec01;

public class Rectangle {
		//직접 초기화
	int width = 500;			//접근지정자 생략 = defualt	
	int height = 1000;			//멤버필드 
	
	{	//초기화 블록
		width = 10;
		height = 30;
	}
	
		//생성자 메서드 - 다양한 초기화
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
		//넓이를 계산후 출력하는 메서드 
	public void getArea() {
		int area = width * height;
		System.out.println("넓이 : " + area);
	}
	
}
