package ddit.chap02.sec03;

public class StringExample {

	public static void main(String[] args) {
/*		String	: java api���� �����ϴ� ���ڿ� ��ü
  				: ���ڿ��� " " �ȿ� ����� ������
  				: ���ڿ��� ���Ǵ� "+"�����ڴ� ���ڿ� ������ �ǹ�
 				: any type + ���ڿ� => ���ڿ� + ���ڿ� 
 			ex) 77 + "7" => "77" + "7" => "777" */
		
		String str1 = "7"; // String str1 = new String("7");
		String res = 77 + str1;
		
//		System.out.println("res = " + res);
		
		String str2 = "ȫ�浿";
		String str3 = "ȫ�浿";
		
/*		�ּҺ� */		
		if(str2 == str3) {	//������ �������� ����� ("==")�� �ּҺ�
			System.out.println("���� �ּ�");
		}else {
			System.out.println("�ٸ� �ּ�");
		}
	
/*		 �����*/
		if(str2.equals(str3)) {
			System.out.println("���� �̸�");
		}else {
			System.out.println("�ٸ� �̸�");
		}
			
		String str4 = new String("ȫ�浿");
		String str5 = new String("ȫ�浿");
		
		if(str4 == str5) {
			System.out.println("���� �ּ�");
		}else {
			System.out.println("�ٸ� �ּ�");
		}
		
		if(str4.equals(str5)) {
			System.out.println("���� �̸�");
		}else {
			System.out.println("�ٸ� �̸�");
		}
			
	}

}
