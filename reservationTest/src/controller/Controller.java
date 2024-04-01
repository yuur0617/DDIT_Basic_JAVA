package controller;

import java.util.HashMap;
import java.util.Map;

import service.ReservationService;
import util.ScanUtil;
import util.View;

public class Controller {
	// 세션
	static public Map<String, Object> sessionStorage = new HashMap<>();
	
	//////
	ReservationService reservationService = ReservationService.getInstance();
	
	public static void main(String[] args) {
		new Controller().start();
	}
	
	private void start() {
//		sessionStorage.put("login", false);	// false: 로그인 안됨
//		sessionStorage.put("loginInfo", null);
		int view = View.HOME;
		while(true) {
			switch (view) {
			// 팀장
			case View.HOME: 
				view = reservationTest(); //예약페이지
				break;
			
			// 예약담당
			case View.SEAT_RNO: 
				view =  reservationService.list();
				break;
			}
		}
	}

	private int reservationTest() {
//		System.out.println(sessionStorage.get("login"));
//		System.out.println(sessionStorage.get("loginInfo"));
		
		System.out.println("======= 대덕인재 개발원 ======");
		System.out.println("   1.입실		2.퇴실	");
		System.out.println("=========================");
		System.out.print("번호 입력 >> ");
		switch (ScanUtil.nextInt()) {
		case 1: 
			return View.SEAT_RNO;	//열람실번호 조회
		case 2: 
			return View.RESERVATION_OUT;	//퇴실페이지
		default: 
			return View.HOME;
		}
	}

}
