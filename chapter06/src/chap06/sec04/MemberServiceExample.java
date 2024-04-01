package chap06.sec04;

public class MemberServiceExample {

	public static void main(String[] args) {
		MemberService memberService = new MemberService();
		
		boolean result = memberService.login("hong","12345");
		
		if(result) {
			System.out.println("로그인 되었습니다.");
			memberService.logout("hong");
		}else { System.out.println("ID 또는  Password 확인 요망");
			
		}
	}

}
