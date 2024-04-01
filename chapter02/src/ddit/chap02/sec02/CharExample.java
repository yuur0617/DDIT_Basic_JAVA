package ddit.chap02.sec02;
/* 문자 : char(2byte, 부호없는 정수형, 0~65535)
      : ' ' 로 묶어 표현
      : 하나의 글자만 가능 */

public class CharExample {

	public static void main(String[] args) {
		char ch1 = 'a';	//97
		char ch2 = '대'; //45824
		
		System.out.println("ch1 = " + ch1);
		System.out.println("ch1 = " + (ch1+1)); //(int)형변환 발생
		System.out.println("ch2 = " + ch2);
		System.out.println("ch2 = " + (ch2+0));
		
		byte b1 = 10;
		short s1 = 0;
		
//		ch1 = b1 + 'a';
//		ch2 = s1 + 'a';	
//		char가 더 크기가 크고 음수를 표현할수없기때문에 
	}

}

