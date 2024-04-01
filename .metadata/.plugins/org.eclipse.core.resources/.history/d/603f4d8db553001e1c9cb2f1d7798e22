package service;

import java.util.List;
import java.util.Map;
import java.util.Scanner;
import util.ScanUtil;
import util.PrintUtil;
import util.JDBCUtil;
import util.View;

public class ReservationService {
	private static ReservationService instance = null;

	JDBCUtil jdbc = JDBCUtil.getInstance();

	private ReservationService() {
	}

	public static ReservationService getInstance() {
		if (instance == null)
			instance = new ReservationService();
		return instance;
	}

	public static void main(String[] args) {
		ReservationService rse = new ReservationService();
		rse.reservation();
	}

	// sql, List컬렉션, rs, rno, sno 변수선언
	String sql = null;
	List<Map<String, Object>> paramR = null;
	int rs = 0;
	int rno = 0;
	int sno = 0;
	String select;

//뒤로가기 구현 안함...
	public int reservation() {
		// 화면 구현
		PrintUtil.bar2();
		PrintUtil.blank(1);
		System.out.println("\t\t좌석 예약");
		System.out.println("");
		System.out.println("\t\t1. 입실");
		System.out.println("\t\t2. 퇴실");
		System.out.println("\t\t3. 예약시간 연장");
		PrintUtil.blank(1);
		PrintUtil.bar();
		System.out.println("\t\t\t\t0. 뒤로가기");
		System.out.print("\t\t선택 >> ");

		// 명령문 입혁
		switch (ScanUtil.nextInt()) {

		case 0:
			return View.HOME;// 컨트롤러 연결해야 돌아감

		case 1:
			reservationRno();// 컨트롤러 연결할때 주석처리
			return View.RESERVATION_RNO;

		case 2:
			System.out.println("\t\t호실입력 >> ");// 멤버 설정에서 예약값 불러오기 구현..
			int a = ScanUtil.nextInt();
			System.out.println("\t\t좌석입력 >> ");
			int b = ScanUtil.nextInt();
			reservationOut(a, b);
			return View.RESERVATION_OUT;

//		case 3: 시간연장 구현...??

		default:
			System.out.println("잘못 입력하셨습니다.");
			reservation();
			return View.RESERVATION;
		}
	}

	public int reservationRno() {
		PrintUtil.bar2();
		System.out.println("");
		System.out.println("\t\t열람실 선택");
		System.out.println("\t   1. 101호" + "( " + count(101) + " / 9  )");
		System.out.println("\t   2. 102호" + "( " + count(102) + " / 9  )");
		System.out.println("\t   3. 103호" + "( " + count(103) + " / 9  )");
		System.out.println("\t   4. 201호" + "( " + count(201) + " / 20 )");
		System.out.println("\t   5. 202호" + "( " + count(202) + " / 20 )");
		System.out.println("");
		PrintUtil.bar2();
		System.out.println("");
		System.out.println("\t\t\t\t0. 뒤로가기");
		System.out.print("\t\t선택 >> ");

		switch (ScanUtil.nextInt()) {

		case 0:
			reservation();
			return View.RESERVATION;

		case 1:
			rno = 101;
			sno = reserveSeat9(rno);
			reservationIn(rno, sno); 
			return View.RESERVATION_IN;

		case 2:
			rno = 102;
			sno = reserveSeat9(rno);
			reservationIn(rno, sno);
			return View.RESERVATION_IN;

		case 3:
			rno = 103;
			sno = reserveSeat9(rno);
			reservationIn(rno, sno);
			return View.RESERVATION_IN;

		case 4:
			rno = 201;
			sno = reserveSeat20(rno);
			reservationIn(rno, sno);
			return View.RESERVATION_IN;

		case 5:
			rno = 202;
			sno = reserveSeat20(rno);
			reservationIn(rno, sno);
			return View.RESERVATION_IN;

		default:
			System.out.println("잘못 입력하셨습니다.");
			reservationRno();
			return View.RESERVATION_RNO;
		}
	}

	public int reserveSeat9(int rno) {
		sql = " SELECT * FROM SEAT WHERE SEAT_RNO = " + rno;
		paramR = jdbc.selectList(sql);
		PrintUtil.bar2();
		System.out.println("");
		System.out.println("\t\t좌석 선택");
		PrintUtil.blank(1);
		
		for (int i = 0; i < (paramR.size()); i++) {
			if ((i + 1) % 3 == 0) {
				System.out.printf("\t  %-2s ", paramR.get(i).get("SEAT_SNO"));
				if (paramR.get(i).get("SEAT_REV").equals("T")) {
					System.out.println("■");
				} else {
					System.out.println("□");
				}
			} else {
				System.out.printf("\t  %-2s ", paramR.get(i).get("SEAT_SNO"));
				if (paramR.get(i).get("SEAT_REV").equals("T")) {
					System.out.print("■");
				} else {
					System.out.print("□");
				}
			}
		}

		PrintUtil.blank(1);
		PrintUtil.bar();
		System.out.println("\t\t\t\t0. 뒤로가기");
		System.out.print("\t\t선택 >> ");
		sno = ScanUtil.nextInt();
		if(sno>=0 && sno<21) {
			return sno;			
		} else {
			System.out.println("잘못 입력하셨습니다.");
			reservationRno();
			return View.RESERVATION_RNO;
		}
	}

	public int reserveSeat20(int rno) {
		sql = " SELECT * FROM SEAT WHERE SEAT_RNO = " + rno;
		paramR = jdbc.selectList(sql);
		PrintUtil.bar2();
		System.out.println("");
		System.out.println("\t\t좌석 선택");
		PrintUtil.blank(1);
		for (int i = 0; i < (paramR.size()); i++) {
			if ((i + 1) % 5 == 0) {
				System.out.printf("  %-2s ", paramR.get(i).get("SEAT_SNO"));
				if (paramR.get(i).get("SEAT_REV").equals("T")) {
					System.out.println("■ ");
				} else {
					System.out.println("□ ");
				}
			} else {
				if ((i + 1) % 5 == 1) {
					System.out.print("    ");
				}
				System.out.printf("  %-2s ", paramR.get(i).get("SEAT_SNO"));
				if (paramR.get(i).get("SEAT_REV").equals("T")) {
					System.out.print("■ ");
				} else {
					System.out.print("□ ");
				}
			}
		}

		PrintUtil.bar();
		System.out.println("\t\t\t\t0. 뒤로가기"); 
		System.out.print("\t\t선택 >> ");
		sno = ScanUtil.nextInt();

		if (sno >= 0 && sno < 21) {
			return sno;
		} else {
			System.out.println("잘못 입력하셨습니다.");
			reservationRno();
			return View.RESERVATION_RNO;
		}
	}

	public int reservationIn(int rno, int sno) {
		if (sno == 0) {
			System.out.println("\t열람실을 다시 선택합니다.");
			reservationRno();
			return View.RESERVATION_RNO;
		} else {
			PrintUtil.bar2();
			System.out.println("");
			System.out.println("\t\t예약 확인");
			PrintUtil.blank(2);
			System.out.println("\t" + rno + "실 " + sno + "석을 예약하시겠습니까?");
			PrintUtil.blank(2);
			PrintUtil.bar();
			System.out.println("\t\t\t\t0. 뒤로가기");
			System.out.print("\t\t선택 (Y/N) >> ");
			select = ScanUtil.nextLine();
			if (select.equalsIgnoreCase("y")) {
				sql = "UPDATE SEAT SET SEAT_REV='T' WHERE SEAT_RNO = " + rno + "AND SEAT_SNO = " + sno;
				rs = jdbc.update(sql);// rs가 1이 나오면 예약 잘 된것.. 표시?
				if (rs == 1) {
					System.out.println("\t예약이 완료되었습니다. 처음 화면으로 돌아갑니다.");
					return View.HOME;
// 새 SQL문으로 Reservation DB insert해주기			sql = "UPDATE SEAT SET SEAT_REV='T' WHERE SEAT_RNO = " + rno + "AND SEAT_SNO = " + sno;
				} 
				
				else if (rs == 0) {
					System.out.println("\t이미 예약된 좌석입니다. 다시 선택해주세요.");
					reservationRno();
					return View.RESERVATION_RNO;
				} 
				
				else {
					System.out.println("\t잘못 입력하셨습니다. 예약 첫화면으로 돌아갑니다.");
					reservation();
					return View.RESERVATION;
				}
			} 
			
			else if (select.equalsIgnoreCase("n")) {
				System.out.println("\t좌석 예약을 취소하고 예약 첫화면으로 돌아갑니다.");
				reservation();
				return View.RESERVATION;
			} 
			
			else {
				System.out.println("\t잘못 입력하셨습니다. 예약 첫화면으로 돌아갑니다.");
				reservation();
				return View.RESERVATION;
			}
		}
		// y가 됐을때 T로 바꿔주고 + reservation 기록 남겨주기
	}

	// count, 호실별 F의 갯수를 세서 반환하는 메소드
	public int count (int rno) {
		sql = " SELECT SEAT_REV FROM SEAT WHERE SEAT_RNO = " + rno + " AND SEAT_REV = 'F'";
		if (jdbc.selectList(sql).size() == 0)
			return 0;
		else
			return (Integer) jdbc.selectList(sql).size();
//		Integer.parseInt((String)jdbc.selectOne(sql).get("COUNT(*)"));

	}

	public int reservationOut (int rno, int sno) {
		PrintUtil.bar2();
		System.out.println("");
		System.out.println("\t\t예약 확인");
		PrintUtil.blank(2);
		System.out.println("\t" + rno + "실 " + sno + "석을 퇴실하시겠습니까?");
		PrintUtil.blank(2);
		PrintUtil.bar();
		System.out.println("\t\t\t\t0. 뒤로가기");
		System.out.print("\t\t선택 (Y/N) >> ");
		select = ScanUtil.nextLine();
		if (select.equalsIgnoreCase("y")) {
			sql = "UPDATE SEAT SET SEAT_REV='F' WHERE SEAT_RNO = " + rno + "AND SEAT_SNO = " + sno;
			rs = jdbc.update(sql);
			if (rs == 1) {
				System.out.println("\t퇴실이 완료되었습니다. 처음 화면으로 돌아갑니다.");
				return View.HOME;
//새 SQL문으로 Reservation DB insert해주기			sql = "UPDATE SEAT SET SEAT_REV='T' WHERE SEAT_RNO = " + rno + "AND SEAT_SNO = " + sno;
			} else if (rs == 0) {
				System.out.println("\t예약되지 않은 좌석입니다. 다시 선택해주세요.");
				reservationRno();
				return View.RESERVATION_RNO;
			} else {
				System.out.println("\t잘못 입력하셨습니다. 예약 첫화면으로 돌아갑니다.");
				reservation();
				return View.RESERVATION;
			}
		} else if (select.equalsIgnoreCase("n")) {
			System.out.println("\t퇴실을 취소하고 예약 첫화면으로 돌아갑니다.");
			reservation();
			return View.RESERVATION;
		} else {
			System.out.println("\t잘못 입력하셨습니다. 예약 첫화면으로 돌아갑니다.");
			reservation();
			return View.RESERVATION;
			}
		}
}
