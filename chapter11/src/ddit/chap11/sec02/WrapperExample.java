package ddit.chap11.sec02;

import java.util.ArrayList;

public class WrapperExample {

	public static void main(String[] args) {
/*		�⺻Ÿ�� => Wrapper	
 		1) �����ڸ޼���		*/

		Long l1 = new Long(25l);	//������ �޼��� Ȱ��
		Long l2 = 25l;				//����ڽ�
		
		long res = 100+l2;			//�����ڽ�	//������ l2�� class�� ���� �Ұ���
		System.out.println("res = " + res);
		
/* 		2) ValueOf() �޼���		*/
		
		Long l3 = Long.valueOf("25");
		
		long ll3 = l3.longValue();
		long ll4 = Long.parseLong(String.valueOf(ll3));
		
		ArrayList<Long> list = new ArrayList<Long>();
		list.add(l1);
		list.add(l3);
//		list.add("������");
//		list.add(true);
		
		System.out.println(list.toString());
	}

}
