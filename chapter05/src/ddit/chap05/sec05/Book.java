package ddit.chap05.sec05;

public class Book {
	private String title;	//å����	//�ɹ�����		//private : �ܺο��� Ŭ������ ������ �ʿ䰡 ���°��
	private String writer;	//����
	private int price;		//����

	public Book(String title, String writer, int price) {	//�����ڸ޼���, ��ü ����?
		this.title = title;		//this : ���������� �ɹ����� , �ּҰ�? ����
		this.writer = writer;
		this.price = price;
	}
	
	@Override		//to String �޼���
	public String toString() {
		String str = "���� : " + title + "\n";
		str = str + "���� : " + writer + "\n";
		str = str + "���� : " + price;
		
		return str;
	}
}
