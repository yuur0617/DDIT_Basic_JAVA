package ddit.chap06.sec01;

public class Rectangle {
		//���� �ʱ�ȭ
	int width = 500;			//���������� ���� = defualt	
	int height = 1000;			//����ʵ� 
	
	{	//�ʱ�ȭ ���
		width = 10;
		height = 30;
	}
	
		//������ �޼��� - �پ��� �ʱ�ȭ
	Rectangle(int width, int height) {
		this.width = width;
		this.height = height;
		
	}
	
		//���̸� ����� ����ϴ� �޼��� 
	public void getArea() {
		int area = width * height;
		System.out.println("���� : " + area);
	}
	
}
