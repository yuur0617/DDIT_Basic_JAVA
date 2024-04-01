package ddit.chap07.sec02;

public class Buyer {
	int money;		//�������ִ� ���� �׼�
	int bonusPoint;	//���ʽ�����Ʈ
	String items =""; 	//���Ը��
	int sum; 		//���Աݾ�
	
	Buyer(int money){
		this.money = money;
	}
	
	void buy(Product p) {
		if(money >= p.price) {
		sum = sum + p.price;
		bonusPoint = bonusPoint + p.bonusPoint;
		items = items + p + ", ";
		money = money - p.price;
		}else {
			System.out.println("�ܾ׺����Դϴ�.");
		}
		
		Computer c = (Computer)p;	//����ĳ����
		
//		instanceof ������
//		->	��ü instanceof Ŭ����
		if(p instanceof Audio) {
			Audio a = (Audio)p;
		}
		System.out.println(p + "�ǰ��� : " + p.price);//15000
		System.out.println(c + "�ǰ��� : " + c.price);	//19000
	}
	
	void summary() {
		System.out.println("���� ��� : " + items);
		System.out.println("���� �ݾ� �հ� : " + sum);
		System.out.println("���� �� �ܰ� : " + money);
	}
}
