package ddit.chap06.sec04;

public class Buyer {
	String items="";	//���Ÿ��
	int sum;		//�� ���� �ݾ�
	int bp;			//���ʽ� ����Ʈ
	
	public void buy(Tv t) {	
		items = items + t + ","; //to string �޼��� ȣ��?
		sum = sum + t.price;
		bp = bp + t.bonusPoint;
	}
	//Ÿ���� �޶� buy�޼ҵ带 3�� ���� -> �޼ҵ� �����ε�_Ÿ���� �ٸ����� �̸��� ���� �޼ҵ尡 �������ΰ�
	public void buy(Audio a) {	
		items = items + a + ", "; 
		sum = sum + a.price;
		bp = bp + a.bonusPoint;
	}
	
	public void buy(Computer c) {	
		items = items + c + ", "; 	//items = items + c.toString() + ", "; - toString()�޼ҵ� ����
		sum = sum + c.price;
		bp = bp + c.bonusPoint;
	}
	
	public void summary() {
		System.out.println("���Ÿ� : " + items);
		System.out.println("���űݾ� �հ� : " + sum);
		System.out.println("���ʽ�����Ʈ : " + bp);
	}
}
