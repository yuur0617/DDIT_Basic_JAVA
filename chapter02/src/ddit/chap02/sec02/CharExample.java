package ddit.chap02.sec02;
/* ���� : char(2byte, ��ȣ���� ������, 0~65535)
      : ' ' �� ���� ǥ��
      : �ϳ��� ���ڸ� ���� */

public class CharExample {

	public static void main(String[] args) {
		char ch1 = 'a';	//97
		char ch2 = '��'; //45824
		
		System.out.println("ch1 = " + ch1);
		System.out.println("ch1 = " + (ch1+1)); //(int)����ȯ �߻�
		System.out.println("ch2 = " + ch2);
		System.out.println("ch2 = " + (ch2+0));
		
		byte b1 = 10;
		short s1 = 0;
		
//		ch1 = b1 + 'a';
//		ch2 = s1 + 'a';	
//		char�� �� ũ�Ⱑ ũ�� ������ ǥ���Ҽ����⶧���� 
	}

}

