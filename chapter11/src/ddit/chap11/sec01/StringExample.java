package ddit.chap11.sec01;

public class StringExample {

	public static void main(String[] args) {
		String addr="대전시 중구 계롱로846";
		String addr1 = " 중구 "; //공백
		
		for(int i=4; i<addr.length()-3; i++) {
			System.out.print(addr.charAt(i)+ " ");
		}
		System.out.println();
		
		System.out.println(addr.substring(4));
		System.out.println(addr.substring(4, 10));
		
		String str1 = addr.substring(4,6);
		
		if(str1.equals(addr1.trim())) {	//trim 공백제거
			System.out.println("같은 구");
		}else {
			System.out.println("다른 구");
		}
		
	}

}
