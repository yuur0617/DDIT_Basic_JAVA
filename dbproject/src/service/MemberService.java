package service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import controller.Controller;
import dao.MemberDAO;
import util.ScanUtil;
import util.View;

public class MemberService {
	private static MemberService instance = null;
	private MemberService() {}
	public static MemberService getInstance() {
		if(instance == null) instance = new MemberService();
		return instance;
	}
	
	MemberDAO memberDao = MemberDAO.getInstance();
	
	public int login() {
		if((boolean) Controller.sessionStorage.get("login")) {
			System.out.println("이미 로그인되어있습니다.");
			return View.HOME;
		}
		System.out.println("-- 로그인 --");
		System.out.print("아이디 >> ");
		String id = ScanUtil.nextLine();
		System.out.print("비밀번호 >> ");
		String pass = ScanUtil.nextLine();
		Map<String, Object> row = memberDao.login(id, pass);
		if(row == null) {
			System.out.println("아이디가 없습니다.");
			return View.HOME;
		}else {
			Controller.sessionStorage.put("login", true);
			System.out.println(row.get("MEM_NAME") + "님 환영합니다!");
			return View.BOARD_LIST;
		}
	}
	public int signUp() {
		System.out.println("-- 회원가입 --");
		System.out.print("아이디 >> ");
		String id = ScanUtil.nextLine();
		System.out.print("비밀번호 >> ");
		String pass = ScanUtil.nextLine();
		
		List<Object> param = new ArrayList<>();
		param.add(id);
		param.add(pass);
		
		int result = memberDao.signUp(param);
		System.out.println("처리건수 : "+result);
		return View.HOME;
	}
	
	public int infoUpdate() {
		if(Controller.sessionStorage.get("login")==(Object)false) {
			System.out.println("로그인을 먼저 수행해야합니다.");
			return View.HOME;
		}
		Map<String,Object> map=(Map<String, Object>) Controller.sessionStorage.get("loginInfo");
		String memId=(String)map.get("MEM_ID");
		
		System.out.println("-- 회원정보 수정 --");
		return 0;
	}
}







