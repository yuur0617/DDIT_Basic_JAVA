package ddit.chap05.sec05;

public class ObjectArray02 {
	Book[] books; // Ŭ���� ��ü �迭�� ����

	public static void main(String[] args) {
		new ObjectArray02().init(); // static �Ⱦ���; Ŭ���� ������ �޼ҵ� ȣ��

	}

	public void init() {
		books = new Book[] { new Book("���ʺ� ����", "EBS", 15000), 
							 new Book("�����ι���", "����ȣ", 30000),
							 new Book("�������� ���а����ϱ�", "���ù�", 17000) };

		infoBook();
	}

	public void infoBook() {
		for (Book b : books) {	//Ÿ�Ը� ������ : �迭��
			System.out.println("--------------------------------");
			System.out.println(b);	//.to String ����
		}
		System.out.println("--------------------------------");
	}
}
