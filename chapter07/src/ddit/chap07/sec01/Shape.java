package ddit.chap07.sec01;

public class Shape {
	String kind;	//����
	
	Shape(){}
	
	//������
	public Shape(String kind) {
		this.kind = kind;
	}
	
	//������ ������ ���ϴ� �޼��� but. ��������� ���������ʾ� ������ �����ʴ´�.
	public void getArea() {
		System.out.println("������ ������ ���մϴ�.");
	}
	
	@Override	//������̼�	//�����̸� ���
	public String toString() {
		return kind; 
	}
}
