package ddit.chap07.sec02;

public class HiMart {

	public static void main(String[] args) {
		Computer c1 = new Computer();	
		Audio a1 = new Audio();
		Tv t1 = new Tv();
		
		Buyer buyer = new Buyer(100000);
		buyer.buy(c1);				//��ǻ�� ����
		buyer.buy(t1);			
		buyer.buy(new Computer());	//��ü�� ��������ʰ� ��ǻ�� ����
//		Product p = new Computer()
		buyer.summary();	
		
		

	}

}
