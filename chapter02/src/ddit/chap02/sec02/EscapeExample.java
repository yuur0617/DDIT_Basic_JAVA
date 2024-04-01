package ddit.chap02.sec02;

public class EscapeExample {

	public static void main(String[] args) {
		String str1 = "ȫ�浿";
		String str2 = "ȫ���";
		String str3 = "������";
		
//		System.out.println(str1);
		System.out.println(str1 + "�� \n�� ģ���Դϴ�.");		//�ٹٲ�
		System.out.println(str1 + "�� \r�� ģ���Դϴ�.");		//ĳ��������
		
		System.out.println();
		
		System.out.println(str1 + " \"" +  str3 + "\"");//"���
		System.out.println(str1 + " \'" +  str3 + "\'");//'���
		System.out.println(str1 + " \\" +  str3 + "\\");//\���
		
		System.out.println();
		
		System.out.println("\u0041");
		System.out.println("\u0061");
		System.out.println("\uAC00");

	}
}

