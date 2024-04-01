package ddit.chap02.sec03;

public class StringExample {

	public static void main(String[] args) {
/*		String	: java api에서 제공하는 문자열 객체
  				: 문자열은 " " 안에 기술된 데이터
  				: 문자열에 사용되는 "+"연산자는 문자열 결합을 의미
 				: any type + 문자열 => 문자열 + 문자열 
 			ex) 77 + "7" => "77" + "7" => "777" */
		
		String str1 = "7"; // String str1 = new String("7");
		String res = 77 + str1;
		
//		System.out.println("res = " + res);
		
		String str2 = "홍길동";
		String str3 = "홍길동";
		
/*		주소비교 */		
		if(str2 == str3) {	//참조형 변수들의 동등비교 ("==")는 주소비교
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
	
/*		 내용비교*/
		if(str2.equals(str3)) {
			System.out.println("같은 이름");
		}else {
			System.out.println("다른 이름");
		}
			
		String str4 = new String("홍길동");
		String str5 = new String("홍길동");
		
		if(str4 == str5) {
			System.out.println("같은 주소");
		}else {
			System.out.println("다른 주소");
		}
		
		if(str4.equals(str5)) {
			System.out.println("같은 이름");
		}else {
			System.out.println("다른 이름");
		}
			
	}

}
