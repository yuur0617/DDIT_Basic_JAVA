package ddit.chap11.sec01;

public class StringExample {

	public static void main(String[] args) {
		String addr="������ �߱� ��շ�846";
		String addr1 = " �߱� "; //����
		
		for(int i=4; i<addr.length()-3; i++) {
			System.out.print(addr.charAt(i)+ " ");
		}
		System.out.println();
		
		System.out.println(addr.substring(4));
		System.out.println(addr.substring(4, 10));
		
		String str1 = addr.substring(4,6);
		
		if(str1.equals(addr1.trim())) {	//trim ��������
			System.out.println("���� ��");
		}else {
			System.out.println("�ٸ� ��");
		}
		
	}

}
