package service;

import java.lang.reflect.Array;
import java.util.List;
import java.util.Map;

import dao.ReservationDAO;
import util.ScanUtil;
import util.View;

public class ReservationService {
	//싱글톤
	private static ReservationService instance = null;
	private ReservationService() {}
	public static ReservationService getInstance() {
		if(instance == null) instance = new ReservationService();
		return instance;
	}
	
	ReservationDAO dao = ReservationDAO.getInstance();
	
	public int list() {
		System.out.println("---------------------------------------");
		System.out.println("1. 101호   2.102호  4.201호");
		System.out.print("번호 선택 >> ");
		int result = ScanUtil.nextInt();
		switch(result) {
			case 1 : 
				int num = 101;
//				seatSno1(num);
		default: 
			return View.HOME;
		}
	}
	
//	public void seatSno1(int num) {	//자리가 9개인 seat 좌석번호를 받아서 3*3으로 표시
////		1번 선택 시 DB에서 101호의 좌석번호, 예약 여부(T,F)를 받아와서
////		3*3 으로 된 좌석 배치도에 T일 경우 □, F일 경우 ■ 입력
//		List<Map<String, Object>> result = dao.list(num);
//		
//		for(int i=0; i<result.size(); i++) {
//			if(i%3 == 0 ) {
//				if(result.get("T ")== true)
//					System.out.println(" ■ ");
//				else
//					System.out.println(" □ ");
//			}else {
//				if(result.get(i).get("tf") == true)
//					System.out.print(" ■ ");
//				else
//					System.out.print(" □ ");
//			}
//		
//		}
//	}
	
	public void seatSno2() {	//자리가 20개인 seat
		
	}
}









