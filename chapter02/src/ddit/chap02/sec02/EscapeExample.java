package ddit.chap02.sec02;

public class EscapeExample {

	public static void main(String[] args) {
		String str1 = "홍길동";
		String str2 = "홍길순";
		String str3 = "정몽주";
		
//		System.out.println(str1);
		System.out.println(str1 + "은 \n내 친구입니다.");		//줄바꿈
		System.out.println(str1 + "은 \r내 친구입니다.");		//캐리지리턴
		
		System.out.println();
		
		System.out.println(str1 + " \"" +  str3 + "\"");//"출력
		System.out.println(str1 + " \'" +  str3 + "\'");//'출력
		System.out.println(str1 + " \\" +  str3 + "\\");//\출력
		
		System.out.println();
		
		System.out.println("\u0041");
		System.out.println("\u0061");
		System.out.println("\uAC00");

	}
}

